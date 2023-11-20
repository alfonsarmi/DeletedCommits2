package basic.classes.inheritances;

public class Car4 extends Car3 {	
	protected String param4 = "param4";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car4 myCar = new Car4();
		System.out.println(myCar.brand + " " + myCar.param1);
		System.out.println(myCar.brand + " " + myCar.param2);
		System.out.println(myCar.brand + " " + myCar.param3);
	}
}
