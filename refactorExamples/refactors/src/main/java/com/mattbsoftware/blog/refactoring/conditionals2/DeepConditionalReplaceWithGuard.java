/**
 * 
 */
package com.mattbsoftware.blog.refactoring.conditionals2;

/**
 * 
 * @author Matt Brown
 * 
 *         for blog - class that calculates which chemical process to follow
 * 
 */
public class DeepConditionalReplaceWithGuard {

	static final String GO_BACK_TO_THE_LAB = "go back to the lab";
	static final String MELT = "Melt";
	static final String CRUSHED_CANS = "Crushed Cans";
	static final String CRUSH_THEN_BUBBLE = "Crush then bubble";
	static final String BAUXITE = "Bauxite";
	static final String ELECTROLYTIC_W…HLER_PROCESS = "Electrolytic: Wšhler process";
	static final String ELECTROLYTIC_HALL_HEROULT = "Electrolytic: Hall-HŽroult";
	static final String ALUM = "Alum";
	static final String ALUMINUM = "Aluminum";

	static public String getProcessNameNested(String metal, String state, boolean haveEnergyDollarsToSpend) {
		if (ALUMINUM.equalsIgnoreCase(metal)) {
			if (ALUM.equalsIgnoreCase(state)) {
				if (haveEnergyDollarsToSpend) {
					return ELECTROLYTIC_HALL_HEROULT;
				} else {
					return ELECTROLYTIC_W…HLER_PROCESS;
				}
			} else if (BAUXITE.equals(state)) {
				return CRUSH_THEN_BUBBLE;
			} else if (CRUSHED_CANS.equals(state)) {
				return MELT;
			}
		}
		return GO_BACK_TO_THE_LAB;
	}

	
	
	static public String getProcessNameNestedRefactored(String metal, String state, boolean haveEnergyDollarsToSpend) {
		//pull out the outer indentation.
		if (!ALUMINUM.equalsIgnoreCase(metal)) {
			return GO_BACK_TO_THE_LAB;
		}
		
		//do the comparisons, simplest to most complex
		if (BAUXITE.equals(state)) {
			return CRUSH_THEN_BUBBLE;
		}
		
		if (CRUSHED_CANS.equals(state)) {
			return MELT;
		}
		
		if (!ALUM.equalsIgnoreCase(state)) {
			return GO_BACK_TO_THE_LAB;
		}
		
		//now the complex compare is simple to read.
		if (haveEnergyDollarsToSpend) {
			return ELECTROLYTIC_HALL_HEROULT;
		} else {
			return ELECTROLYTIC_W…HLER_PROCESS;
		}
	}

	
}