package basic.classes.inheritances;

public class Car3 extends Car2 {	
	protected String param3 = "param3";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car3 myCar = new Car3();
		System.out.println(myCar.brand + " " + myCar.param1);
		System.out.println(myCar.brand + " " + myCar.param2);
	}
}
