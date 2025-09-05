package com.plan.Service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plan.Service.UserPlanService;
import com.plan.dto.ApplicationDTO;
import com.plan.dto.UserPlanDTO;
import com.plan.model.Plan;
import com.plan.model.Userplan;
import com.plan.repository.PlanRepository;
import com.plan.repository.UserPlanRepository;

@Service
public class UserPlanServiceImpl implements UserPlanService {

	@Autowired
	private UserPlanRepository userPlanRepository;

	@Autowired
	private PlanRepository planRepository;

	@Override
	public ApplicationDTO activatePlan(UserPlanDTO request) {
		// Plan planDetails = planRepository.findByPlanId(request.getPlanId()); //
		// Ideally fetched from plan metadata
		// double deductedAmount = planDetails.getPrice();
		LocalDateTime activationDate = LocalDateTime.now();
		LocalDateTime expiryDate = activationDate.plusDays(30); // Example: 30-day plan
		Userplan userPlanObj = new Userplan();
		userPlanObj.setPlan_id(request.getPlanId());
		userPlanObj.setUser_id(request.getUserId());
		userPlanObj.setStart_date(activationDate);
		userPlanObj.setEnd_date(expiryDate);
		userPlanObj.setStatus("active");
		userPlanRepository.save(userPlanObj);
		ApplicationDTO applicationDTO = new ApplicationDTO();
		// detech the amount using finClient
		applicationDTO.setStatusCode(200);
		applicationDTO.setMessage("Plan activated successfully");
		applicationDTO.setData(request);

		return applicationDTO;
	}
}
