package com.overloading.java;

public class German {

	public void apps(String name) {
		System.out.println("void return type = " + name);
	}

	public String apps(int rating, String name) {
		System.out.println("String return type= " + rating + "," + name);
		return "ABC";
	}

	public int apps(int rating) {
		System.out.println("int return type= " + rating);
		return 888;
	}

	public Deutsch apps(Deutsch d) {
		System.out.println("Object Deutsch return type= ");
		System.out.println(d.getId());
		System.out.println(d.getAddress());
		return d;
	}

}
