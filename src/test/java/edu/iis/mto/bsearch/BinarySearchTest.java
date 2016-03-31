package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void canFoundElementInSingleElementSequence() {
		int[] seq = new int[]{5};
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.isFound(), is(true));
	}
	
	@Test
	public void cannotFoundElementInSingleElementSequence() {
		int[] seq = new int[]{5};
		SearchResult result = BinarySearch.search(4, seq);
		assertThat(result.isFound(),is(false));
	}
	

}
