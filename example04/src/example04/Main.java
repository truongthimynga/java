package example04;

public class Main {

	public static void main(String[] args) {
		CRectangle recta=new CRectangle(3, 4);
		CRectangle rectb=new CRectangle(5, 6);
		rectb=recta;
		System.out.println("rect a:"+ recta.area());
		System.out.println("rect b:"+ rectb.area());
		
		

	}

}
