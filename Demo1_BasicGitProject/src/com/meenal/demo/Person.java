package com.meenal.demo;

public class Person {
	
private String personName;
private Integer personAge;
private Double personScore;


public Person() {
	super();
}
public Person(String personName, Integer personAge, Double personScore) {
	super();
	this.personName = personName;
	this.personAge = personAge;
	this.personScore = personScore;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public Integer getPersonAge() {
	return personAge;
}
public void setPersonAge(Integer personAge) {
	this.personAge = personAge;
}
public Double getPersonScore() {
	return personScore;
}
public void setPersonScore(Double personScore) {
	this.personScore = personScore;
}
@Override
public String toString() {
	return "Person [personName=" + personName + ", personAge=" + personAge + ", personScore=" + personScore + "]";
}




}
