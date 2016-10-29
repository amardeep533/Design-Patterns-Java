package com.creational.abstractfactorypattern;

public class FactoryProducer
{
	public static AbstractShapeColorFactory getFactory(String choice)
	{
		if (choice.equalsIgnoreCase("SHAPE"))
		{
			return new ShapeFactory();

		}
		else if (choice.equalsIgnoreCase("COLOR"))
		{
			return new ColorFactory();
		}

		return null;
	}
}
