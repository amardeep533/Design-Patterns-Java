package com.creational.factorypattern;

public class TestFactoryPattern
{

	public static void main(String[] args)
	{
		Animal animal = new Animal();
		Dog dog = (Dog) animal.getAnimal("dog");
		dog.speak();
		Cat cat = (Cat) animal.getAnimal("cat");
		cat.speak();
		Lion lion = (Lion) animal.getAnimal("lion");
		lion.speak();
	}
}
