/*
 * 		file.Classes[0].Name	"Principal3"	string
+		file.Operands	Count = 1830	System.Collections.Generic.List<string>
-		file.Operators	Count = 25	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"for"	string
		[2]	"="	string
		[3]	"="	string
		[4]	"="	string
		[5]	"for"	string
		[6]	"="	string
		[7]	"<"	string
		[8]	"++"	string
		[9]	"for"	string
		[10]	"="	string
		[11]	"<"	string
		[12]	"++"	string
		[13]	"="	string
		[14]	"="	string
		[15]	"+"	string
		[16]	"+"	string
		[17]	"+"	string
		[18]	"+"	string
		[19]	"+"	string
		[20]	"+"	string
		[21]	"if"	string
		[22]	"<"	string
		[23]	"+"	string
		[24]	"+"	string
+		Raw View		
		file.Node.EntityId	-331740088	long

		BM_CognitiveComplexity	6.523668639053255	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	2.798816568047337	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	1560.1775147928995	double
		BM_HalsteadNumOperators	15.837278106508876	double
		BM_HalsteadNumUniqueOperands	54.80177514792899	double
		BM_HalsteadNumUniqueOperators	4.715976331360947	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	340	int
		BM_LinesOfComments	5	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	6004	long
		Binary	false	bool

 */
package basic;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars.length);
		for (String i : cars) {//ND(1) CGC(2)
			System.out.println(i);
		}

		int[][] myNumbers1 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		int x = myNumbers1[1][2];
		System.out.println(x);

		int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		for (int i = 0; i < myNumbers.length; ++i) {//ND(1) CGC(4)
			for (int j = 0; j < myNumbers[i].length; ++j) {//ND(2) CGC(7)
				System.out.println(myNumbers[i][j]);
			}
		}

		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod();
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam");
		myMethod("Jenny");
		myMethod("Anja");
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);
		System.out.println(myMethod(3));
		System.out.println(myMethod(4));
		System.out.println(myMethod(5));
		System.out.println(myMethod(6));
		System.out.println(myMethod(7));
		System.out.println(myMethod(8));
		System.out.println(myMethod(9));
		checkAge(2);
		checkAge(20);
		checkAge(200);
		checkAge(10);
		checkAge(2);
		checkAge(20);
		checkAge(200);
		checkAge(10);
		checkAge(2);
		checkAge(20);
		checkAge(200);
		checkAge(10);
		
		//Overloading methods:
		int myNum1 = plusMethod(8, 5);
		double myNum2 = plusMethod(4.3, 6.26);
		System.out.println("int: " + myNum1);
		System.out.println("double: " + myNum2);
	}

	static void myMethod() {
		System.out.println("I just got executed!");
	}

	static void myMethod(String fname) {
		System.out.println(fname + " Refsnes");
	}

	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	static int myMethod(int x) {
		return 5 + x;
	}

	// Create a checkAge() method with an integer variable called age
	static void checkAge(int age) {

		// If age is less than 18, print "access denied"
		if (age < 18) {
			System.out.println("Access denied - You are not old enough!");

			// If age is greater than, or equal to, 18, print "access granted"
		} else {
			System.out.println("Access granted - You are old enough!");
		}

	}

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}
}
