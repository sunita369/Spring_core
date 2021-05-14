package com.sunita;

import java.util.Set;
import java.util.List;
import java.util.Map;

public class Hello {
	
	private List<Question> List;
	
	public void getList() {
		for(Question q:List) {
			System.out.println(q.getAnswers());
			
		}
	}
	public void setList(List<Question> list) {
		this.List = list;
	}
	private Set<Question> set;
	
	public void getSet() {
		for(Question q: set) {
			System.out.println(q.getAnswers());
		}
	}
	public void setSet(Set<Question> set) {
		this.set = set;
	}
	private Map<Integer,Question> map;
	
	public void getMap() {
		for(Map.Entry<Integer,Question> q:map.entrySet()) {
			System.out.println(q.getKey()+", "+q.getValue().getAnswers());
		}
	}
	public void setMap(Map<Integer, Question> map) {
		this.map = map;
	}
}

