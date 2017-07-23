package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Subscription;
import com.example.service.SubscriptionService;

@RestController
public class SubscriptionController {

	@Autowired
	private SubscriptionService subscriptionService;

	@RequestMapping("/customer/subscriptions")
	public List<Subscription> getSubscriptions() {
		return subscriptionService.getSubScriptions();
	}

	@RequestMapping("/customer/subscription/{ban}")
	public Subscription getSubscription(@PathVariable String ban) {
		return subscriptionService.getBan(ban);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/customer/subscription")
	public void addSubscription(@RequestBody Subscription subscription) {
		subscriptionService.addSubscription(subscription);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/customer/subscription/{ban}")
	public void updateSubscription(@RequestBody Subscription subscription,
			@PathVariable String ban) {
		subscriptionService.updateSubscription(ban, subscription);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/subscription/{ban}")
	public void deleteSubscription(@RequestBody Subscription subscription,
			@PathVariable String ban) {
		subscriptionService.deleteSubscription(ban, subscription);
	}

	@RequestMapping("/test")
	public String demo() {
		return "Hi";
	}
}
