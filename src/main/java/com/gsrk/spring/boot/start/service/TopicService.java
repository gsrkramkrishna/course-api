package com.gsrk.spring.boot.start.service;

import java.util.List;
import java.util.Optional;

import com.gsrk.spring.boot.start.entity.TopicEntity;
import com.gsrk.spring.boot.start.model.Topic;

public interface TopicService {

	public List<TopicEntity> getAllTopics();
	
	public Optional<TopicEntity> findTopicById(int id);
	
	public void saveTopic(Topic topic);
}
