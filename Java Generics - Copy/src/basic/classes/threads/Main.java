/*
 * 		BM_CognitiveComplexity	0	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	52	double
		BM_HalsteadNumOperators	2.25	double
		BM_HalsteadNumUniqueOperands	23.5	double
		BM_HalsteadNumUniqueOperators	0.75	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	14	int
		BM_LinesOfComments	0	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	0	int
		BM_Size	405	long
 */
package basic.classes.threads;

public class Main {

	public static void main(String[] args) {
		Main1 thread = new Main1();
		thread.start();
		System.out.println("This code is outside of the thread1");		
		
		Main2 obj = new Main2();
	    Thread thread1 = new Thread(obj);
	    thread1.start();
	    System.out.println("This code is outside of the thread2");
	}

	public void run() {
		System.out.println("This code is running in a thread");
	}
}
