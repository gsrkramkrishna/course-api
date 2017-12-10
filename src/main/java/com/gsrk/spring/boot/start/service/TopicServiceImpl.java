package com.gsrk.spring.boot.start.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gsrk.spring.boot.start.model.Topic;
@Service
public class TopicServiceImpl implements TopicService {

	public List<Topic> getAllTopics() {
		// TODO Auto-generated method stub
		return createListOfToics();
	}
	
	private List<Topic> createListOfToics(){
		return Arrays.asList(new Topic(123,"Java","Java Topic"),new Topic(223,"Spring","Spring Topic"),new Topic(323,"Hibernate","Hibernate Topic"));
	}

	public Topic findTopicById(int id){
		// TODO Auto-generated method stub
		List<Topic> topics = createListOfToics();
		for(Topic topic:topics){
			if(topic.getId() == id)
				return topic;
		}
		return null;
	}

}
