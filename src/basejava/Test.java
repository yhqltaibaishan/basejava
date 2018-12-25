package basejava;

public class Test {


	public static void main(String[] args) {
		String de = "dee";
		Car car=new Car(de);
		partise1220   pt=new partise1220();
		pt.setBrand("abc");
		pt.wheel=456;
		pt.speedUp();
		car.speedUp();
		
		System.out.println("pt.speed="+pt.getSpeed());
		System.out.println("car.speed="+car.getSpeed());
		System.out.println("car.look="+car.look());
        
		
	}
}
