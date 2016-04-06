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
		SearchResult result = BinarySearch.search(3, seq);
		assertThat(result.isFound(),is(false));
	}
	
	@Test
	public void isFirstElement() {
		int[] seq = new int[]{1,2,3,4,5};
		SearchResult result = BinarySearch.search(1, seq);
		assertThat(result.getPosition(),is(1));
	}
	
	@Test
	public void isLastElement() {
		int[] seq = new int[]{1,2,3,4,5};
		SearchResult result = BinarySearch.search(5, seq);
		assertThat(result.getPosition(),is(seq.length));
	}
	
	@Test
	public void isMiddleElementInOddSequence() {
		int[] seq = new int[]{1,2,3,4,5};
		SearchResult result = BinarySearch.search(3, seq);
		assertThat(result.getPosition(),is(seq.length/2+1));
	}
	
	@Test
	public void noElement() {
		int[] seq = new int[]{1,2,3,4,5};
		SearchResult result = BinarySearch.search(6, seq);
		assertThat(result.isFound(),is(false));
	}
	
    @Test
    public void cannotFindElementInEmptySequence() {
        int[] seq = new int[] {};
        SearchResult searchResult = BinarySearch.search(5, seq);

        assertThat(searchResult.isFound(), is(false));
    }

    @Test
    public void cannotFindElementInDisorderedSequence() {
        int[] seq = new int[] {9, 4, 2, 1, 0};
        SearchResult searchResult = BinarySearch.search(1, seq);

        assertThat(searchResult.isFound(), is(false));
    }

}
