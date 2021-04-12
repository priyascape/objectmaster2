package com.codingdojo.java.objectmaster2;

public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Vidya");
		Human testHuman2 = new Human("Rajiv");
		Human testHuman3 = new Human("Prakash");
		Wizard testWizard1 = new Wizard("Merlin");
		Wizard testWizard2 = new Wizard("Merlin2");
		Wizard testWizard3 = new Wizard("Merlin3");
		Ninja testNinja1 = new Ninja("Bruce");
		Ninja testNinja2 = new Ninja("Lee");
		Ninja testNinja3 = new Ninja("Jackie");
		Samurai testSamurai1 = new Samurai("Lao");
		Samurai testSamurai2 = new Samurai("Han");
		Samurai testSamurai3 = new Samurai("Hang");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}