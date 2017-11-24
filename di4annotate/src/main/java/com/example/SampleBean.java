package com.example;

import org.springframework.stereotype.Component;

//到合适的地方找代码装配成bean （思考：什么时候用@Component，什么时候用@Configuration）
@Component
public class SampleBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SampleBean [name=" + name + "]";
	}
	
}
