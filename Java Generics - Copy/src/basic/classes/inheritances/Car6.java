package basic.classes.inheritances;

public class Car6 extends Car5 {	
	protected String param6 = "param6";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car6 myCar = new Car6();
		System.out.println(myCar.brand + " " + myCar.param1);
		System.out.println(myCar.brand + " " + myCar.param2);
		System.out.println(myCar.brand + " " + myCar.param3);
		System.out.println(myCar.brand + " " + myCar.param4);
		System.out.println(myCar.brand + " " + myCar.param5);
	}
}
