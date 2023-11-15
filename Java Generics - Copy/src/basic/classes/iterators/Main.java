/*
 * 		BM_CognitiveComplexity	7	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	3	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	228	double
		BM_HalsteadNumOperators	24	double
		BM_HalsteadNumUniqueOperands	51	double
		BM_HalsteadNumUniqueOperators	5	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	33	int
		BM_LinesOfComments	5	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	799	long
 */
package basic.classes.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Make a collection
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		// Get the iterator
		Iterator<String> it = cars.iterator();

		// Print the first item
		System.out.println(it.next());

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it1 = numbers.iterator();
	    while(it1.hasNext()) {
	      Integer i = it1.next();
	      if(i < 10) {
	        it1.remove();
	      }
	    }
	    System.out.println(numbers);
	  
	    //Wrappers
	    Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());
	    
	}

}
