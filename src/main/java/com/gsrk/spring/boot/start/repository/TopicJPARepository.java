package com.gsrk.spring.boot.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gsrk.spring.boot.start.entity.TopicEntity;

public interface TopicJPARepository extends JpaRepository<TopicEntity,Integer>{

}
