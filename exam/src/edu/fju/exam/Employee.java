package edu.fju.exam;

public class Employee {
	String name;
	int dollar;
	int bonus;
	public Employee(String name,int dollar){
		this.name=name;
		this.dollar=dollar;
		this.bonus=bonus;
		
		
		}
	public void print(){
		System.out.println(name+"\t"+dollar);
	}
}
