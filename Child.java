package com.overriding.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {
	public int age(int age) throws FileNotFoundException
	{
		return 100;
	}
}
