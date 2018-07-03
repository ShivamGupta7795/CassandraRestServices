package com.dashboard.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dashboard.rest.entity.DashboardRest;
import com.dashboard.rest.entity.DashboardRestKey;
import com.dashboard.rest.service.DashboardRestService;

@RestController
@RequestMapping(value = "/dashboardtask")
public class DashboardRestController {
	
	
	@Autowired
	private DashboardRestService dashboardRestService; 
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public List<DashboardRest> findAll(){
		return dashboardRestService.findAll();
	}
	
	@RequestMapping(method= RequestMethod.GET, value = "/one")
	public Optional<DashboardRest> findOne(@RequestParam(value = "emp_Id", defaultValue = "1234" ) String empId) {
		DashboardRestKey dashboardRestKey = new DashboardRestKey();
		dashboardRestKey.setEmpId(empId);
		return dashboardRestService.findById(dashboardRestKey);
	}
	
}
