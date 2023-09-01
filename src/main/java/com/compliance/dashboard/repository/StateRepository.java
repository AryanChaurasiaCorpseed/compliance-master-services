package com.compliance.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compliance.dashboard.model.stateModel.State;
@Repository
public interface StateRepository extends JpaRepository<State, Long> {

}
