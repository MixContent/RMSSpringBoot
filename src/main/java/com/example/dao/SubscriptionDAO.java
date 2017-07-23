package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.model.Subscription;

@RepositoryRestResource
public interface SubscriptionDAO extends CrudRepository<Subscription, String> {

	
}
