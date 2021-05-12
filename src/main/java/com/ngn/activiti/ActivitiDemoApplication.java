package com.ngn.activiti;

import java.util.List;

import javax.annotation.PostConstruct;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ngn.activiti")
public class ActivitiDemoApplication {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RuntimeService runtimeService;
	
	public static void main(String[] args) {
		SpringApplication.run(ActivitiDemoApplication.class, args);
	}
	
	@PostConstruct
	public void listProcessInstances() {
		List<ProcessInstance> processInstances = runtimeService.createProcessInstanceQuery().list();
		LOGGER.info("processInstances size : {}", processInstances.size());
		for (ProcessInstance processInstance : processInstances) {
			LOGGER.info("Process instance id : {}", processInstance.getId());
		}
	}
}
