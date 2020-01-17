package dp.factory_pattern;

public class Test {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape shape1 = factory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = factory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = factory.getShape("CIRCLE");
		shape3.draw();
	}
}
