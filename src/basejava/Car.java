package basejava;


public class Car extends  partise1220{

	int speed=0;
	String brand;
	int wheel;
	private String driver;
	public Car(String drive2) {
		// TODO Auto-generated constructor stub
		driver=drive2;
	}
	public void speedUp(){
		int count=2;
		speed = speed + count;
	}
	
	
	public String look() {
		// TODO Auto-generated method stub
	return	driver+" is driving "+brand +"car";
	}
	
	
	
	
	
	
	
	
	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public int getWheel() {
		return wheel;
	}



	public void setWheel(int wheel) {
		this.wheel = wheel;
	}



}
