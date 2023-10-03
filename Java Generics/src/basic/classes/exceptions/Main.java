/*
 * 		BM_CognitiveComplexity	5	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	2	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	122	double
		BM_HalsteadNumOperators	6	double
		BM_HalsteadNumUniqueOperands	44	double
		BM_HalsteadNumUniqueOperators	3	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	20	int
		BM_LinesOfComments	1	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	564	long
 */
package basic.classes.exceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {			
			Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("Visit W3Schools!");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
		    
		    int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
			
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
	}

}
