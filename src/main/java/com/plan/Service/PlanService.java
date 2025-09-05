package com.plan.Service;

import com.plan.dto.ApplicationDTO;
import com.plan.dto.UserPlanDTO;
import com.plan.model.Plan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PlanService {
    List<Plan> getAllPlans();

    Plan getPlanByPlanId(String planName);

    Page<Plan> getAllPlansWithPagination(Pageable pageable);

    List<Plan> searchPlans(String price, String data);

}
