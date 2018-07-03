package com.dashboard.rest.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;

@Configuration
@PropertySource("classpath:application.properties")
public class CassandraConfig extends AbstractCassandraConfiguration{
	
	@Value("${cassandra.port}")
	private String cassandraPort;
	
	@Value("${cassandra.host}")
	private String cassandraHost;
	
	@Value("${cassandra.keyspace}")
	private String keyspace;

	@Override
	protected String getKeyspaceName() {
		return keyspace;
	}
	
	
	@Bean
	public CassandraClusterFactoryBean cassandraClusterFactoryBean() {
		CassandraClusterFactoryBean config = new CassandraClusterFactoryBean();
		config.setClusterName("dashboardservices");
		config.setPort(Integer.parseInt(cassandraPort));
		config.setContactPoints(cassandraHost);
		return config;
	}
	
	@Bean
	public CassandraMappingContext cassandraMappingContext() {
		return new CassandraMappingContext();
	}
}
