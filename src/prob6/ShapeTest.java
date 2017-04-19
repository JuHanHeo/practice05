package prob6;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> shape = new ArrayList<Shape>();
		
		shape.add(new Rectangle(5, 6));
		shape.add(new RectTriangle(6, 2));
		
		for(int i=0;i<shape.size();i++){
			System.out.println("area: " + shape.get(i).getArea());
			System.out.println("perimeter: " + shape.get(i).getPerimeter());
			
			if(shape.get(i) instanceof Resizable){
				Resizable re = (Resizable)shape.get(i);
				re.resize(0.5);
				System.out.println("new area: " + shape.get(i).getArea());
				System.out.println("new perimeter: " + shape.get(i).getPerimeter());
			}
		}
	}

}
