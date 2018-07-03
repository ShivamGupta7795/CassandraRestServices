package com.dashboard.rest.entity;

import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/*Model describes the table structure of the cassandra table. 
 * Primary Key class defines the structure of primary key*/


@Table("employee")
public class DashboardRest {
	
	@PrimaryKey
	private DashboardRestKey dashboardRestKey;
	
	@Column("city")
	private String empCity;
	
	@Column("role")
	private String empRole;
	
	@Column("name")
	private String empName;

	public DashboardRestKey getDashboardRestKey() {
		return dashboardRestKey;
	}

	public void setDashboardRestKey(DashboardRestKey dashboardRestKey) {
		this.dashboardRestKey = dashboardRestKey;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}
