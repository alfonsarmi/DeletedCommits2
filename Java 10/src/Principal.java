/*
 * -		Operands	Count = 48	System.Collections.Generic.List<string>
		[0]	"import"	string
		[1]	"java"	string
		[2]	"."	string
		[3]	"util"	string
		[4]	"."	string
		[5]	"List"	string
		[6]	";"	string
		[7]	"public"	string
		[8]	"class"	string
		[9]	"Principal"	string
		[10]	"{"	string
		[11]	"public"	string
		[12]	"static"	string
		[13]	"void"	string
		[14]	"main"	string
		[15]	"("	string
		[16]	"String"	string
		[17]	"["	string
		[18]	"]"	string
		[19]	"args"	string
		[20]	")"	string
		[21]	"{"	string
		[22]	"var"	string
		[23]	"list"	string
		[24]	"List"	string
		[25]	"."	string
		[26]	"of"	string
		[27]	"("	string
		[28]	"1"	string
		[29]	","	string
		[30]	"2"	string
		[31]	","	string
		[32]	"3"	string
		[33]	")"	string
		[34]	";"	string
		[35]	"var"	string
		[36]	"example"	string
		[37]	"\"example\""	string
		[38]	";"	string
		[39]	"var"	string
		[40]	"team"	string
		[41]	"new"	string
		[42]	"Team"	string
		[43]	"("	string
		[44]	")"	string
		[45]	";"	string
		[46]	"}"	string
		[47]	"}"	string
+		Raw View		
-		Operators	Count = 3	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"="	string
		[2]	"="	string

		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	36	double
		BM_HalsteadNumOperators	3	double
		BM_HalsteadNumUniqueOperands	27	double
		BM_HalsteadNumUniqueOperators	1	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	7	int
		BM_LinesOfComments	1	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int
		BM_Size	171	long

 */
import java.util.List;

public class Principal {

	public static void main(String[] args) {	
		//We can use var to create objects
		var list = List.of(1, 2, 3);
		var example = "example";
		var team = new Team();
		
		
	}

}
