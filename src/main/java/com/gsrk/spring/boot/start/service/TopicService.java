package com.gsrk.spring.boot.start.service;

import java.util.List;

import com.gsrk.spring.boot.start.model.Topic;

public interface TopicService {

	public List<Topic> getAllTopics();
	
	public Topic findTopicById(int id);
}
