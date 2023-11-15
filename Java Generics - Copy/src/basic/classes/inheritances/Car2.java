/*
 * 		file.Classes[0].Name	"Car2"	string
-		file.Operands	Count = 53	System.Collections.Generic.List<string>
		[0]	"package"	string
		[1]	"basic"	string
		[2]	"."	string
		[3]	"classes"	string
		[4]	"."	string
		[5]	"inheritances"	string
		[6]	";"	string
		[7]	"public"	string
		[8]	"class"	string
		[9]	"Car2"	string
		[10]	"extends"	string
		[11]	"Car1"	string
		[12]	"{"	string
		[13]	"protected"	string
		[14]	"String"	string
		[15]	"param2"	string
		[16]	"\"param2\""	string
		[17]	";"	string
		[18]	"public"	string
		[19]	"static"	string
		[20]	"void"	string
		[21]	"main"	string
		[22]	"("	string
		[23]	"String"	string
		[24]	"["	string
		[25]	"]"	string
		[26]	"args"	string
		[27]	")"	string
		[28]	"{"	string
		[29]	"Car2"	string
		[30]	"myCar"	string
		[31]	"new"	string
		[32]	"Car2"	string
		[33]	"("	string
		[34]	")"	string
		[35]	";"	string
		[36]	"System"	string
		[37]	"."	string
		[38]	"out"	string
		[39]	"."	string
		[40]	"println"	string
		[41]	"("	string
		[42]	"myCar"	string
		[43]	"."	string
		[44]	"brand"	string
		[45]	"\" \""	string
		[46]	"myCar"	string
		[47]	"."	string
		[48]	"param1"	string
		[49]	")"	string
		[50]	";"	string
		[51]	"}"	string
		[52]	"}"	string
+		Raw View		
-		file.Operators	Count = 4	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"="	string
		[2]	"+"	string
		[3]	"+"	string
+		Raw View		
		file.Node.EntityId	-1782089500	long

		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	34	double
		BM_HalsteadNumOperators	3	double
		BM_HalsteadNumUniqueOperands	23	double
		BM_HalsteadNumUniqueOperators	2	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	7	int
		BM_LinesOfComments	1	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int			
 */
package basic.classes.inheritances;

public class Car2 extends Car1 {	
	protected String param2 = "param2";
	
	public static void main(String[] args) {

		// Create a myCar object
		Car2 myCar = new Car2();
		System.out.println(myCar.brand + " " + myCar.param1);
	}
}
