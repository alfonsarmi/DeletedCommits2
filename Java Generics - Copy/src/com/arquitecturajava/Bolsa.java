/*
 * 		BM_CognitiveComplexity	1	double
		BM_CouplingBetweenObjectClasses	0	double
		BM_CyclomaticComplexity	0.5	double
		BM_DepthOfInheritance	0	int
		BM_EffectiveComplexityScoreLogicalComplexity	0	double
		BM_EffectiveComplexityScoreRelations	0	double
		BM_EffectiveComplexityScoreSoftwareScience	0	double
		BM_HalsteadNumOperands	26.071428571428573	double
		BM_HalsteadNumOperators	1.7142857142857142	double
		BM_HalsteadNumUniqueOperands	15.5	double
		BM_HalsteadNumUniqueOperators	1.7142857142857142	double
		BM_InherentComplexityScoreLogicalComplexity	0	double
		BM_InherentComplexityScoreRelations	0	double
		BM_InherentComplexityScoreSoftwareScience	0	double
		BM_LackOfCohesion	1	double
		BM_LinesOfCode	18	int
		BM_LinesOfComments	0	int
		BM_LinesPseudoDeleted	0	int
		BM_NestingDepth	1	int
		BM_Size	385	long
		Binary	false	bool
 */
package com.arquitecturajava;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {
	private ArrayList<T> lista = new ArrayList<T>();
	private int tope;

	public Bolsa(int tope) {
		super();
		this.tope = tope;
	}

	public void add(T objeto) {
		if (lista.size() >= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("no caben mas");
		}
	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}
}