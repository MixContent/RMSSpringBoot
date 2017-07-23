package com.example.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "SUBSCRIPTION_DB")
public class Subscription {
	@Id
	private String ban;
	private String ptn;
	private boolean isUpgradeElligible;

	public Subscription() {
		// no-op
	}

	public Subscription(String ptn, String ban, boolean isUpgradeElligible) {
		super();
		this.ptn = ptn;
		this.ban = ban;
		this.isUpgradeElligible = isUpgradeElligible;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public String getPtn() {
		return ptn;
	}

	public void setPtn(String ptn) {
		this.ptn = ptn;
	}

	public boolean isUpgradeElligible() {
		return isUpgradeElligible;
	}

	public void setUpgradeElligible(boolean isUpgradeElligible) {
		this.isUpgradeElligible = isUpgradeElligible;
	}

}
