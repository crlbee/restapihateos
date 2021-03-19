package com.springtest.rest.restapi.configuration;

import com.springtest.rest.restapi.entity.Employee;
import com.springtest.rest.restapi.entity.Order;
import com.springtest.rest.restapi.entity.Status;
import com.springtest.rest.restapi.service.EmployeeDAO;
import com.springtest.rest.restapi.service.OrderDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
	private static final Logger log =
	 LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeDAO repository, OrderDAO orderRep){
		return args -> {
			repository.save(new Employee("Bilbo", "Baggins", "burglar"));
			repository.save(new Employee("Frodo", "Baggins", "thief"));
			repository.findAll().forEach(employee -> log.info("Preloaded " + employee));
			orderRep.save(new Order("MacBook Pro", Status.COMPLETED));
			orderRep.save(new Order("iPhone", Status.IN_PROGRESS));
			orderRep.findAll().forEach(order -> {
			  log.info("Preloaded " + order);
			});
	};
}
}
