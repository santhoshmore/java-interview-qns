package dp.factory_method;

/*
 just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
 */

public abstract class ShapeFactory {
	public static GeometricShape getShape(ShapeType name){
		GeometricShape shape = null;
		switch(name){
		case LINE :
			shape = new Line();
			break;
		case RECTANGLE :
			shape = new Rectangle();
			break;
		case CIRCLE :
			shape = new Circle();
			break;
		}
		return shape;
	}
}
