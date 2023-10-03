/*
		BM_CognitiveComplexity	1.5384615384615385	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0.7692307692307693	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	52.07692307692308	double
		BM_HalsteadNumOperators	4.076923076923077	double
		BM_HalsteadNumUniqueOperands	21.307692307692307	double
		BM_HalsteadNumUniqueOperators	3.3076923076923075	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	16	int
		BM_LinesOfComments	2	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	1	int
		BM_Size	347	long
		Binary	false	bool
*/
package basic.classes.threads;

public class Main3 {

	public static int amount = 0;

	public static void main(String[] args) {
		Main1 thread = new Main1();
		thread.start();
		// Wait for the thread to finish
		while (thread.isAlive()) {
			System.out.println("Waiting...");
		}
		// Update amount and print its value
		System.out.println("Main: " + amount);
		amount++;
		System.out.println("Main: " + amount);
	}

	public void run() {
		amount++;
	}

}
