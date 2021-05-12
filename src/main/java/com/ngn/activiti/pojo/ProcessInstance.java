package com.ngn.activiti.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProcessInstance {
	
	private String id;
	private String name;
	private String processDefinitionId;
	private String processDefinitionName;
}
