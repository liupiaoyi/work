package com.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private Integer id;
	private String name;
	private List list;
	private Set set;
	private Map mapList;
	private Properties prosss;

	public Person() {
		super();
	}
	public Person(Integer id, String name, List list, Set set, Map mapList, Properties pros) {
		super();
		this.id = id;
		this.name = name;
		this.list = list;
		this.set = set;
		this.mapList = mapList;
		this.prosss = pros;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Set getSet() {
		return set;
	}
	public void setSet(Set set) {
		this.set = set;
	}
	public Map getMapList() {
		return mapList;
	}
	public void setMapList(Map mapList) {
		this.mapList = mapList;
	}
	public Properties getPros() {
		return prosss;
	}
	public void setProsss(Properties pros) {
		this.prosss = pros;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", list=" + list + ", set=" + set + ", mapList=" + mapList
				+ ", pros=" + prosss + "]";
	}

	
	

}
