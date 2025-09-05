package com.plan.repository;

import com.plan.model.Plan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends MongoRepository<Plan, String> {

    List<Plan> findByPriceAndData(String price, String data);

    List<Plan> findByPrice(String price);

    List<Plan> findByData(String data);

    Plan findByPlanId(String planId);
}
