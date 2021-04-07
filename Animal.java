package com.overloading.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Animal {
	public void characterstics(String sound) throws FileNotFoundException //checked Exception
	{
		System.out.println("void return type = "+sound);
	}
	public int characterstics(int legs) throws Exception
	{
		System.out.println("int return type = "+legs);
		return legs;
	}
	public String characterstics(String name,boolean wings) throws IOException
	{
		System.out.println("String return type = "+name + ", "+wings);
		return "Ostrich";
	}
}
