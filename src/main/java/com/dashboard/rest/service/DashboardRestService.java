package com.dashboard.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dashboard.rest.entity.DashboardRest;
import com.dashboard.rest.entity.DashboardRestKey;


public interface DashboardRestService {
	public List<DashboardRest> findAll();
	
	public Optional<DashboardRest> findById(DashboardRestKey id);
	
	public <S extends DashboardRest> S insert(S entity);
	
	public <S extends DashboardRest> S save(S entity);
	
	public void delete(DashboardRest entity) ;
}
