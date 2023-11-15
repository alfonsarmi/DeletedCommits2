/*
 * 		BM_CognitiveComplexity	13	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	6	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	384	double
		BM_HalsteadNumOperators	42	double
		BM_HalsteadNumUniqueOperands	65	double
		BM_HalsteadNumUniqueOperators	8	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	50	int
		BM_LinesOfComments	13	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	2	int
		BM_Size	1367	long
		Binary	false	bool
 */
package basic.classes.listsmapshashes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// LinkedList
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		
		//HashMap
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }
	    
	    // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    
	    // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    // Create a HashMap object called people
	    HashMap<String, Integer> people = new HashMap<String, Integer>();


	    // Add keys and values (Name, Age)
	    people.put("John", 32);
	    people.put("Steve", 30);
	    people.put("Angie", 33);

	    for (String i : people.keySet()) {
	      System.out.println("key: " + i + " value: " + people.get(i));
	    }
	    
	    //HashSet
	    HashSet<String> cars1 = new HashSet<String>();
	    cars1.add("Volvo");
	    cars1.add("BMW");
	    cars1.add("Ford");
	    cars1.add("BMW");
	    cars1.add("Mazda");
	    System.out.println(cars1);
	    
	 // Create a HashSet object called numbers
	    HashSet<Integer> numbers = new HashSet<Integer>();

	    // Add values to the set
	    numbers.add(4);
	    numbers.add(7);
	    numbers.add(8);

	    // Show which numbers between 1 and 10 are in the set
	    for(int i = 1; i <= 10; i++) {
	      if(numbers.contains(i)) {
	        System.out.println(i + " was found in the set.");
	      } else {
	        System.out.println(i + " was not found in the set.");
	      }
	    }
	}

}
