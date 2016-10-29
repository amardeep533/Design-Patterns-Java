package com.creational.abstractfactorypattern;

public class ShapeFactory extends AbstractShapeColorFactory {

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
