package com.plan.Service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.plan.Service.PlanService;
import com.plan.dto.ApplicationDTO;
import com.plan.dto.UserPlanDTO;
import com.plan.model.Plan;
import com.plan.repository.PlanRepository;
import com.plan.repository.UserPlanRepository;

@Service
public class PlanServiceImpl implements PlanService {

	@Autowired
	private final PlanRepository planRepository;

	public PlanServiceImpl(PlanRepository planRepository) {
		this.planRepository = planRepository;
	}

	@Override
	public List<Plan> getAllPlans() {
		return planRepository.findAll();
	}

	@Override
	public Page<Plan> getAllPlansWithPagination(Pageable pageable) {
		return planRepository.findAll(pageable);
	}

	@Override
	public Plan getPlanByPlanId(String planId) {
		return planRepository.findByPlanId(planId);
	}

	public List<Plan> searchPlans(String price, String data) {
		if (price != null && data != null) {
			return planRepository.findByPriceAndData(price, data);
		} else if (price != null) {
			return planRepository.findByPrice(price);
		} else if (data != null) {
			return planRepository.findByData(data);
		} else {
			return planRepository.findAll();
		}
	}

}
