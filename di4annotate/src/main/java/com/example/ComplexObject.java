package com.example;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {
	private Properties adminEmails;
	private List someList;
	private Map someMap;
	private Set someSet;
	
	public ComplexObject() {
		super();
	}

	public ComplexObject(Properties adminEmails, List someList, Map someMap, Set someSet) {
		super();
		this.adminEmails = adminEmails;
		this.someList = someList;
		this.someMap = someMap;
		this.someSet = someSet;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public void setSomeList(List someList) {
		this.someList = someList;
	}

	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}

	@Override
	public String toString() {
		return "ComplexObject [adminEmails=" + adminEmails + ", someList=" + someList + ", someMap=" + someMap
				+ ", someSet=" + someSet + "]";
	}

}
