package com.gsrk.spring.boot.start.resources;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.gsrk.spring.boot.start.entity.TopicEntity;
import com.gsrk.spring.boot.start.exception.TopicNotFoundException;
import com.gsrk.spring.boot.start.model.Topic;
import com.gsrk.spring.boot.start.service.TopicService;


/**
 * Properties are fetching from remote repository through Spring Cloud Config server.
 * @author gsrkr
 *
 */
@Component
@Path("/topics")
public class TopicResource {

	@Autowired
	private TopicService topicService;
	
	@Value("${com.gsrk.course.api.name}")
	private String message;
	
	@Path("/all")
	@GET
	@Produces("application/json")
	public Response getAllTopics() {
		List<TopicEntity> topics = null;
		try{
			topics = topicService.getAllTopics();
			if(topics==null || topics.isEmpty())
				throw new TopicNotFoundException("Topics Not Found:");
		}catch(TopicNotFoundException tne){
			tne.printStackTrace();
			return Response.status(404).build();
		}
			
		return Response.status(Response.Status.OK).entity(topics).build();
		
	}

	@Path("{id}")
	@GET
	@Produces("application/json")
	public Response findTopicById(@PathParam("id") String id) {
		Optional<TopicEntity> t = null;
		try {
			int topicId = Integer.parseInt(id);
			t = topicService.findTopicById(topicId);
			if (t == null || t.get()==null)
				throw new TopicNotFoundException("Topic Not Found for the Id:" + id);
		} catch (TopicNotFoundException tne) {
			tne.printStackTrace();
			return Response.status(404).build();
		}
		return Response.status(Response.Status.OK).entity(t).build();
	}
	@Path("/add")
	@POST
	@Produces("application/json")
	@Consumes("application/json")
	public Response saveTopic(Topic topic) {
		// TODO Auto-generated method stub
		try{
			if(topic == null || topic.getName()== null || topic.getDescription() == null)
				throw new TopicNotFoundException("Empty Topic Not allowed.");
			topicService.saveTopic(topic);
		}catch(TopicNotFoundException tne){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}catch(Exception ex){
			ex.printStackTrace();
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
		return Response.status(Response.Status.CREATED).build();
	}
	
	@Path("/message")
	@GET
	@Produces("application/json")
	public Response sayHey(){
		System.out.println("Message is:"+message);
		return Response.status(Response.Status.OK).entity(message).build();
	}

}
