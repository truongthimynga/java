package example01;

public class Main {

	public static void main (String []args){
		Rectangle rect=new Rectangle();
		Rectangle rectb=new Rectangle();
		rect.SetValues(3, 4);
		rect.SetValues(5, 6);
		System.out.println("rect a:"+ rect.area());
		System.out.println("rect b:"+ rectb.area());
		
	}
}

