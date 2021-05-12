package com.ngn.activiti.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskPojo {

	private String id;
	private String assignee;
	private String taskName;
	private String createdDate;
	private Object taskVariables;
}
