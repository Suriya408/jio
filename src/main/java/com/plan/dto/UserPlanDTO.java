
package com.plan.dto;

public class UserPlanDTO {

	private String userId;

	private String planId;

	private String bankuserId;

	private String bankAccountNumber;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getBankuserId() {
		return bankuserId;
	}

	public void setBankuserId(String bankuserId) {
		this.bankuserId = bankuserId;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

}
