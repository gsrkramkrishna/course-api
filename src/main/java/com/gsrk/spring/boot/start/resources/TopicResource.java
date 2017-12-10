package com.gsrk.spring.boot.start.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gsrk.spring.boot.start.exception.TopicNotFoundException;
import com.gsrk.spring.boot.start.model.Topic;
import com.gsrk.spring.boot.start.service.TopicService;

@Component
@Path("/topics")
public class TopicResource {

	@Autowired
	private TopicService topicService;
	
	@Path("/all")
	@GET
	@Produces("application/json")
	public Response getAllTopics() {
		List<Topic> topics = null;
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
		Topic t = null;
		try {
			int topicId = Integer.parseInt(id);
			t = topicService.findTopicById(topicId);
			if (t == null)
				throw new TopicNotFoundException("Topic Not Found for the Id:" + id);
		} catch (TopicNotFoundException tne) {
			tne.printStackTrace();
			return Response.status(404).build();
		}
		return Response.status(Response.Status.OK).entity(t).build();
	}

}
