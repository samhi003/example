public class Shapeacess {
  //using access specifier public
	public static void main(String[] args) {
		Shapes shape = new Shapes();
		shape.name = "circle";
		shape.radius = 7.5;
		System.out.println("shape name:" + shape.name);
		System.out.println("Shape radius:" + shape.radius);
		shape.area = shape.radius * shape.radius * 3.14;
		System.out.println("shape area" + shape.area);
		shape.perimeter = 2 * 3.14 * shape.radius;
		System.out.println("shape perimeter:" + shape.perimeter);
		
		Shapes polygon=new Shapes();
		polygon.name="rectangle";
		polygon.length=5;
		polygon.breadth=5;
		//polygon.sides=4;
		//(not visible to this class as it is private)
		polygon.area=polygon.length*polygon.breadth;
		polygon.perimeter=2*(polygon.length+polygon.breadth);
		System.out.println("area & perimeter are"+polygon.area+"&"+polygon.perimeter);
		
		
		
		
		

	}

}
