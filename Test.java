package com.overloading.java;

public class Test {

	public static void main(String[] args) {
		German germ = new German();
		Deutsch d = new Deutsch(44,"Europe");
		germ.apps(d);
		germ.apps(99);
		germ.apps("Bee Lingua");
		germ.apps(1879, "Linguarani");
		

	}

}
