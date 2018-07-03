package com.dashboard.rest.RepositoryImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Repository;

import com.dashboard.rest.Repository.DashboardRestRepository;
import com.dashboard.rest.entity.DashboardRest;
import com.dashboard.rest.entity.DashboardRestKey;

@Repository
public class DashboardRestRepositoryImpl implements DashboardRestRepository{

	@Override
	public <S extends DashboardRest> List<S> saveAll(Iterable<S> entites) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DashboardRest> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DashboardRest> findAllById(Iterable<DashboardRestKey> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Slice<DashboardRest> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DashboardRest> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DashboardRest> List<S> insert(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DashboardRest> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DashboardRest> findById(DashboardRestKey id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(DashboardRestKey id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(DashboardRestKey id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DashboardRest entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends DashboardRest> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
}
