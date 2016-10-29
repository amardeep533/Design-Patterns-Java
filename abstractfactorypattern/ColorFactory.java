package com.creational.abstractfactorypattern;

public class ColorFactory extends AbstractShapeColorFactory {

	@Override
	Color getColor(String color) {
		if (color.equalsIgnoreCase("RED")) {
			return new Red();

		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();

		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
