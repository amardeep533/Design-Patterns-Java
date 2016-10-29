package com.creational.abstractfactorypattern;

public abstract class AbstractShapeColorFactory
{
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
