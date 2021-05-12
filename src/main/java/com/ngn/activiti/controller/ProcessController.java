package com.ngn.activiti.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ngn.activiti.pojo.APIResponse;
import com.ngn.activiti.service.ProcessService;

@RestController
@RequestMapping("/process")
public class ProcessController {

	private static final String START_PROCESS_ENDPOINT = "/start";
	private static final String ACTIVE_PROCESS_INSTANCE_ENDPOINT = "/active-instances";
	
	private static final String TASK_ASSIGNED_TO_USER = "/user-tasks";
	
	@Autowired
	private ProcessService processService;
	
	@PostMapping(START_PROCESS_ENDPOINT)
	public APIResponse startProcess(@RequestHeader("processKey") String processKey, @RequestBody Map<String, Object> processVariables) {
		return processService.startProcess(processKey, processVariables);
	}
	
	@GetMapping(ACTIVE_PROCESS_INSTANCE_ENDPOINT)
	public APIResponse listActiveProcesses() {
		return processService.listInProgressInstances();
	}
	
	@GetMapping(TASK_ASSIGNED_TO_USER)
	public APIResponse listTaskForUser(@RequestHeader("userId") String userId) {
		return processService.listTaskForUser(userId);
	}
}
