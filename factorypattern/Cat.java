package com.creational.factorypattern;

public class Cat extends Animal
{

	@Override
	protected void speak()
	{
		System.out.println("meow");
	}
}
