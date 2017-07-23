package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SubscriptionDAO;
import com.example.model.Subscription;

@Service
public class SubscriptionService {

	@Autowired
	private SubscriptionDAO subscriptionDAO;

	public List<Subscription> getSubScriptions() {
		return (List<Subscription>) subscriptionDAO.findAll();
	}

	public Subscription getBan(String ban) {
		return subscriptionDAO.findOne(ban);
	}

	public void addSubscription(Subscription subscription) {
		subscriptionDAO.save(subscription);
	}

	public void updateSubscription(String ban, Subscription subscription) {
		subscriptionDAO.save(subscription);
	}

	public void deleteSubscription(String ban, Subscription subscription) {
		subscriptionDAO.delete(ban);
	}

}
