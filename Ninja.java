package com.codingdojo.java.objectmaster2;

public class Ninja extends Human {

	//Constructor
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja(String name) {
		this.stealth = 10;
		this.name = name;
	}
	
	//Methods
	public void steal(Human human) {
		human.setHealth(human.getHealth()-stealth);
		this.setHealth(this.getHealth()+stealth);
		System.out.println("Argh!");
		System.out.println("(" + human.getName() + " was taken by surprise " + stealth + " damage points!)");
	}
	public void runAway() {
		this.setHealth(-10);
	}
}