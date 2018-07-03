package com.dashboard.rest.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dashboard.rest.Repository.DashboardRestRepository;
import com.dashboard.rest.entity.DashboardRest;
import com.dashboard.rest.entity.DashboardRestKey;
import com.dashboard.rest.service.DashboardRestService;

@Service
public class DashboardRestServiceImpl implements DashboardRestService {
	
	
	@Autowired
	private DashboardRestRepository dashboardRestRepository;
	
	@Override
	public List<DashboardRest> findAll() {
		return dashboardRestRepository.findAll();
	}

	@Override
	public Optional<DashboardRest> findById(DashboardRestKey id) {
		return dashboardRestRepository.findById(id);
	}

	@Override
	public <S extends DashboardRest> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DashboardRest> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(DashboardRest entity) {
		// TODO Auto-generated method stub
		
	}

}
