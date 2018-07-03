package com.dashboard.rest.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.dashboard.rest.entity.DashboardRest;
import com.dashboard.rest.entity.DashboardRestKey;

public interface DashboardRestRepository extends CassandraRepository<DashboardRest, DashboardRestKey>{
 
}
