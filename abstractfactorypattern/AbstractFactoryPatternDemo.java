package com.creational.abstractfactorypattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractShapeColorFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("CIRCLE");
		shape3.draw();
		
		AbstractShapeColorFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill();	
	}

}
