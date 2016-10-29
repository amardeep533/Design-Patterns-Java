package com.creational.factorypattern;

//In Factory pattern, we create object without 
//exposing the creation logic to the client and refer 
//to newly created object using a common interface.

//In Simple words if we have a super class and some sub-classes, and based on the data provided 
//we have to return the object of the sub classes , then we use factory pattern.

//If the object creation code is spread is present in the whole application and we need
//to change the process of object creation Then we need to go to each and every place to 
//make the necessary changes and therefore we can avoid this by using factory pattern.
public class Animal
{

	protected void speak()
	{
	}

	public Animal getAnimal(String animalType)
	{
		Animal animal = null;
		if (animalType == "dog")
		{
			animal = new Dog();
		}
		else if (animalType == "cat")
		{
			animal = new Cat();
		}
		else if (animalType == "lion")
		{
			animal = new Lion();
		}
		return animal;
	}
}
