package com.plan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.plan.Service.PlanService;
import com.plan.Service.UserPlanService;
import com.plan.dto.ApplicationDTO;
import com.plan.dto.PlanActivationResponse;
import com.plan.dto.UserPlanDTO;
import com.plan.model.Plan;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/plans")
public class PlanController {
	
	@Autowired
    private PlanService planService;
    
	@Autowired
	private UserPlanService userPlanService;


    @GetMapping("/all")
    public ResponseEntity<List<Plan>> getAllPlans() {
        List<Plan> allPlans = planService.getAllPlans();
        if(allPlans.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(allPlans);
    }


    @GetMapping
    public ResponseEntity<Page<Plan>> getAllPlansWithPagination(Pageable pageable) {
        Page<Plan> plans = planService.getAllPlansWithPagination(pageable);
        if (plans.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(plans);
    }


    @GetMapping("/{planId}")
    public ResponseEntity<Plan> getPlansByPlanId(@PathVariable String planId) {
        Plan plan = planService.getPlanByPlanId(planId);
        if (plan == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(plan);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Plan>> searchPlans(
            @RequestParam(required = false) String price,
            @RequestParam(required = false) String data
    ) {
        List<Plan> plans = planService.searchPlans(price, data);
        return ResponseEntity.ok(plans);
    }
    
    @PostMapping("/activatePlan")
     public ResponseEntity<ApplicationDTO> activatePlan(
             @RequestBody UserPlanDTO request) {
         return ResponseEntity.ok(userPlanService.activatePlan(request));
     }


}
