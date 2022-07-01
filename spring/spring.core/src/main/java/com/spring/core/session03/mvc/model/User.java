package com.spring.core.session03.mvc.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:user.properties")
public class User {
	//@Value(value = "John")
	@Value("${user.username}")
	private String username;
	
	//@Value(value = "18")
	@Value("${user.age}")
	private Integer age;
	
	//@Value(value = "#{${nickname: {'foo', 'bar'}}}")
	@Value("${user.nickname}")
	private String[] nickname;
	
	//@Value(value = "#{${subjects: {'Java', 'Math'}}}")
	@Value("${user.subjects}")
	private Set<String> subjects;
	
	//@Value(value = "#{${scores: {100, 90}}}")
	@Value("#{'${user.scores}'.split(',')}")
	private List<String> scores;
	
	//@Value(value = "#{${hobbies: {'h1': 'Car', 'h2': 'Game'}}}")
	@Value("#{${user.hobbies}}")
	private Map<String, String> hobbies;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getNickname() {
		return nickname;
	}

	public void setNickname(String[] nickname) {
		this.nickname = nickname;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	public List<String> getScores() {
		return scores;
	}

	public void setScores(List<String> scores) {
		this.scores = scores;
	}

	public Map<String, String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Map<String, String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + ", nickname=" + Arrays.toString(nickname) + ", subjects="
				+ subjects + ", scores=" + scores + ", hobbies=" + hobbies + "]";
	}
}
