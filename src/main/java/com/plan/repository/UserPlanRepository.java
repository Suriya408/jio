package com.plan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.plan.model.Userplan;

@Repository
public interface UserPlanRepository extends MongoRepository<Userplan, String> {

}
