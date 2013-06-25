package com.mattbsoftware.blog.refactoring.conditionals2;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static com.mattbsoftware.blog.refactoring.conditionals2.DeepConditionalReplaceWithGuard.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Matt Brown
 *
 */
public class DeepConditionalReplaceWithGuardTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.mattbsoftware.blog.refactoring.conditionals2.#getProcessNameNested(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void shouldGetProcess() {
		//Wohler
		String result = getProcessNameNested(ALUMINUM, ALUM, false);
		assertThat(result, is(ELECTROLYTIC_W…HLER_PROCESS));

		//Hall
		result = getProcessNameNested(ALUMINUM, ALUM, true);
		assertThat(result, is(ELECTROLYTIC_HALL_HEROULT));
		
		//Crush & float
		result = getProcessNameNested(ALUMINUM, BAUXITE, false);
		assertThat(result, is(CRUSH_THEN_BUBBLE));	

		//Go back to the lab
		result = getProcessNameNested("silver", "argentite", false);
		assertThat(result, is(GO_BACK_TO_THE_LAB));	

	}

	@Test
	public void shouldGetProcessRefactored() {
		//Wohler
		String result = getProcessNameNestedRefactored(ALUMINUM, ALUM, false);
		assertThat(result, is(ELECTROLYTIC_W…HLER_PROCESS));

		//Hall
		result = getProcessNameNestedRefactored(ALUMINUM, ALUM, true);
		assertThat(result, is(ELECTROLYTIC_HALL_HEROULT));
		
		//Crush & float
		result = getProcessNameNestedRefactored(ALUMINUM, BAUXITE, false);
		assertThat(result, is(CRUSH_THEN_BUBBLE));	

		//Go back to the lab
		result = getProcessNameNestedRefactored("silver", "argentite", false);
		assertThat(result, is(GO_BACK_TO_THE_LAB));	

	}



}
