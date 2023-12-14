package com.csc.api.entity;

import java.util.List;
import java.util.Map;

import com.csc.api.service.UserService;

import lombok.Data;
@Data
public class CollectionConfig {
	private List<UserService> servers;
	private Map<String,Employee> employee;
	private String[] names;

}
