package com.overloading.java;

public class Deutsch {
	private int id;
	private String address;
	
	Deutsch(int id, String address)
	{
		this.id = id;
		this.address = address;
	}
	public int getId()
	{
		return this.id;
	}
	public String getAddress()
	{
		return this.address;
	}
}
