package com.plan.Service;

import com.plan.dto.ApplicationDTO;
import com.plan.dto.UserPlanDTO;

public interface UserPlanService {

	ApplicationDTO activatePlan(UserPlanDTO request);
}
