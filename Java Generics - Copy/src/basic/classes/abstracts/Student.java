/*
 * 		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	16	double
		BM_HalsteadNumOperators	0	double
		BM_HalsteadNumUniqueOperands	13	double
		BM_HalsteadNumUniqueOperators	0	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	6	int
		BM_LinesOfComments	1	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int
		BM_Size	168	long

 */
package basic.classes.abstracts;

public class Student extends Main {
	public int graduationYear = 2018;

	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}
