package com.ngn.activiti.service;

import java.util.Map;

import com.ngn.activiti.pojo.APIResponse;

public interface ProcessService {

	public APIResponse startProcess(String processKey, Map<String, Object> processVariables);
	public APIResponse listInProgressInstances();
	public APIResponse listTaskForUser(String assignee);
}
