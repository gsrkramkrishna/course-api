package com.gsrk.spring.boot.start.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gsrk.spring.boot.start.entity.TopicEntity;
import com.gsrk.spring.boot.start.model.Topic;
import com.gsrk.spring.boot.start.repository.TopicJPARepository;
@Service
@Transactional
public class TopicServiceImpl implements TopicService {
	
	@Autowired
	private TopicJPARepository topicRepository;

	public List<TopicEntity> getAllTopics() {
		// TODO Auto-generated method stub
		return topicRepository.findAll();
	}
	
	public Optional<TopicEntity> findTopicById(int id){
		// TODO Auto-generated method stub
		return topicRepository.findById(id);
	}

	public void saveTopic(Topic topic) {
		// TODO Auto-generated method stub
		TopicEntity entity = new TopicEntity(); 
		entity.setName(topic.getName());
		entity.setDescription(topic.getDescription());
		Serializable s = topicRepository.save(entity);
		if(s instanceof TopicEntity)
			entity = (TopicEntity) s;
		System.out.println("Topic:"+entity.getId());
	}

}
