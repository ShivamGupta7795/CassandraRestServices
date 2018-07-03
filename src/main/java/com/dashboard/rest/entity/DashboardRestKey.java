package com.dashboard.rest.entity;


import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

/*Notice that each attribute of primary key has an ordinal number which defines its arg position in primary key
 * Each attribute can be either partition key or clustered key*/


@PrimaryKeyClass
public class DashboardRestKey {
	
	@PrimaryKeyColumn(name =  "dept_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	String deptId;
	
	@PrimaryKeyColumn(name =  "empId", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	String empId;

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((deptId == null) ? 0 : deptId.hashCode());
	    result = prime * result + ((empId == null) ? 0 : empId.hashCode());
	    return result;
	}
	
	
	 @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    
	    DashboardRestKey taskSummaryKey = (DashboardRestKey) obj;
	    
	    return this.deptId.equals(taskSummaryKey.deptId) 
	    		&&(this.empId == taskSummaryKey.empId);
	 }
}
