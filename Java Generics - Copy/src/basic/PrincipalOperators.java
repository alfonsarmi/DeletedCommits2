/*
 * 		file.Classes[0].Name	"PrincipalOperators"	string
+		file.Operands	Count = 171	System.Collections.Generic.List<string>
-		file.Operators	Count = 14	System.Collections.Generic.List<string>
		[0]	"="	string
		[1]	"+="	string
		[2]	"-="	string
		[3]	"*="	string
		[4]	"="	string
		[5]	"/="	string
		[6]	"%="	string
		[7]	"&="	string
		[8]	"|="	string
		[9]	"^="	string
		[10]	">>="	string
		[11]	"<<="	string
		[12]	"="	string
		[13]	"=="	string
+		Raw View		
		file.Node.EntityId	1358401344	long

		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	2	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	163	double
		BM_HalsteadNumOperators	14	double
		BM_HalsteadNumUniqueOperands	24	double
		BM_HalsteadNumUniqueOperators	12	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	29	int
		BM_LinesOfComments	4	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int
		BM_Size	505	long

 */
package basic;

public class PrincipalOperators {
	public static void main(String[] args) {
		/*
		 * .
		 */
		int x = 5;
	    System.out.println(x);
	    
	    x += 3;
	    System.out.println(x);
	    
	    x -= 3;
	    System.out.println(x);
	    
	    x *= 3;
	    System.out.println(x);
	    
	    double y = 5;
	    y /= 3;
	    System.out.println(y);
	    
	    x %= 3;
	    System.out.println(x);
	    
	    x &= 3;
	    System.out.println(x);
	    
	    x |= 3;
	    System.out.println(x);
	    
	    x ^= 3;
	    System.out.println(x);
	 
	    x >>= 3;
	    System.out.println(x);
	 
	    x <<= 3;
	    System.out.println(x);
	    
	    int z = 3;
	    System.out.println(x == z); // 	    
	}
}
