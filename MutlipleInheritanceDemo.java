package com.practice;
interface Vehicle {
	void start();
	void stop();

}
interface Chargeable {
	void charge();
}
public class MutlipleInheritanceDemo implements Vehicle,Chargeable {
	public void start() {
		System.out.println("Electric Vehicle is Starting");
	}
	public void stop() {
		System.out.println("Electric Vehicle is Stop");
	}
	public void charge() {
		System.out.println("Electric Vehicle is Charging");
	}
	public static void main(String[] args) {
		MutlipleInheritanceDemo d = new MutlipleInheritanceDemo();
		d.start();
		d.stop();
		d.charge();
	}

}
