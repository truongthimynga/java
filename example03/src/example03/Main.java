package example03;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle recta=new Rectangle(3,4);
		Rectangle rectb=new Rectangle(5,6);
		rectb=recta;
		System.out.println("rect a:"+recta.area());
		System.out.println("rect b:"+rectb.area());

	}

}
