package com.weibo.demo.controller;

import javax.annotation.Resource;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.autoconfigure.session.SessionProperties.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClient;


@Configuration
@ConditionalOnClass(Mongo.class)
public class MorphiaFactory {

	@Autowired
    private MongoClient mongo;  
  
	@Autowired
    MongoProperties mongoProperties;  
  
    @Bean  
    public Datastore get() {  
        Morphia morphia = new Morphia();  
        return morphia.createDatastore(mongo,mongoProperties.getDatabase());  
    }
}
