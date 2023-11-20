/*
 * 		file.Classes[0].Name	"Car1"	string
-		file.Operands	Count = 64	System.Collections.Generic.List<string>
		[0]	"package"	string
		[1]	"basic"	string
		[2]	"."	string
		[3]	"classes"	string
		[4]	"."	string
		[5]	"inheritances"	string
		[6]	";"	string
		[7]	"public"	string
		[8]	"class"	string
		[9]	"Car1"	string
		[10]	"extends"	string
		[11]	"Vehicle"	string
		[12]	"{"	string
		[13]	"private"	string
		[14]	"String"	string
		[15]	"modelName"	string
		[16]	"\"Mustang\""	string
		[17]	";"	string
		[18]	"protected"	string
		[19]	"String"	string
		[20]	"param1"	string
		[21]	"\"param1\""	string
		[22]	";"	string
		[23]	"public"	string
		[24]	"static"	string
		[25]	"void"	string
		[26]	"main"	string
		[27]	"("	string
		[28]	"String"	string
		[29]	"["	string
		[30]	"]"	string
		[31]	"args"	string
		[32]	")"	string
		[33]	"{"	string
		[34]	"Car1"	string
		[35]	"myCar"	string
		[36]	"new"	string
		[37]	"Car1"	string
		[38]	"("	string
		[39]	")"	string
		[40]	";"	string
		[41]	"myCar"	string
		[42]	"."	string
		[43]	"honk"	string
		[44]	"("	string
		[45]	")"	string
		[46]	";"	string
		[47]	"System"	string
		[48]	"."	string
		[49]	"out"	string
		[50]	"."	string
		[51]	"println"	string
		[52]	"("	string
		[53]	"myCar"	string
		[54]	"."	string
		[55]	"brand"	string
		[56]	"\" \""	string
		[57]	"myCar"	string
		[58]	"."	string
		[59]	"modelName"	string
		[60]	")"	string
		[61]	";"	string
		[62]	"}"	string
		[63]	"}"	string
+		Raw View		
-		file.Operators	Count = 5	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"="	string
		[2]	"="	string
		[3]	"+"	string
		[4]	"+"	string
+		Raw View		
		file.Node.EntityId	-1782094751	long

		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	40	double
		BM_HalsteadNumOperators	3	double
		BM_HalsteadNumUniqueOperands	24	double
		BM_HalsteadNumUniqueOperators	2	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	9	int
		BM_LinesOfComments	5	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int
		BM_Size	281	long
		Binary	false	bool		
 */
package basic.classes.inheritances;

public class Car1 extends Vehicle {
	private String modelName = "Mustang";    // Car attribute
	protected String param1 = "param1";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car1 myCar = new Car1();

		// Call the honk() method (from the Vehicle class) on the myCar object
		myCar.honk();

		// Display the value of the brand attribute (from the Vehicle class) and the
		// value of the modelName from the Car class
		System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
