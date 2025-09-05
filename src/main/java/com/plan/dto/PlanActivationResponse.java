package com.plan.dto;

public class PlanActivationResponse {

	private String planId;
	private double deductedAmount;
	private String activationDate;
	private String expiryDate;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public double getDeductedAmount() {
		return deductedAmount;
	}

	public void setDeductedAmount(double deductedAmount) {
		this.deductedAmount = deductedAmount;
	}

	public String getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
