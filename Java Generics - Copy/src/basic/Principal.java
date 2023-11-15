/*
 * 		BM_CognitiveComplexity	7	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	4	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	331	double
		BM_HalsteadNumOperators	38	double
		BM_HalsteadNumUniqueOperands	71	double
		BM_HalsteadNumUniqueOperators	6	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	0.5	double
		BM_LinesOfCode	50	int
		BM_LinesOfComments	28	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	1482	long

 */
package basic;

/*
 * 
 * //It is valid.
 * 
 */
public class Principal {
	final int myNum = 15;

	/*
	 * This is a method.
	 * 
	 * Example of a method.
	 */
	public static void main(String[] args) {/* Another one */
		// Another type of comment.
		System.out.println("Hello World");// This is a comment.

		String name = "John";
		System.out.println(name);
		int myNum = 15;
		System.out.println(myNum);
		int myNum2;
		myNum2 = 15;
		System.out.println(myNum2);

		// Variables:
		int myNum3 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println(myNum3 + "  " + myFloatNum + " " + myLetter + " " + myBool + " " + myText);

		// Widening casting is done automatically when passing a smaller size type to a
		// larger size type:
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		// Narrowing casting must be done manually by placing the type in parentheses in
		// front of the value:
		double myDouble2 = 9.78;
		int myInt2 = (int) myDouble2; // Manual casting: double to int
		System.out.println(myDouble2); // Outputs 9.78
		System.out.println(myInt2); // Outputs 9

		// Strings:
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"
		System.out.println(txt.indexOf("Y"));
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));
		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt.toLowerCase());
		txt = "It\'s alright.";
		System.out.println(txt.toLowerCase());

		// if else
		if (20 > 18) {//ND(1) CGC(2)
			System.out.println("20 is greater than 18");
		}
		if (1 > 2) {//ND(1) CGC(4)
			// block of code to be executed if condition1 is true
		} else if (1 < 2) {//ND(2) CGC(7)
			// block of code to be executed if the condition1 is false and condition2 is
			// true
		} else {
			// block of code to be executed if the condition1 is false and condition2 is
			// false
		}
		
		int time = 20;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
	}
}
