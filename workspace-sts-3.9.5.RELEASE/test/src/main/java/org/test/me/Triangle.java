package org.test.me;



public class Triangle extends Shpae{
	
	Point x;
	Point y;
	Point z;
	
	public Triangle(Point x,Point y, Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
	}

	public void trianglePoint() {
		System.out.printf("x :(%d,%d)",x.x,x.y);
		System.out.printf("y : (%d,%d)",y.x,y.y);
		System.out.printf("z :(%d%d)",z.x,z.y);
	}
	
	
	
}
