package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTest {
	
	@BeforeClass
	public static void setUpBefforeClass() throws Exception{
	
	}
	
	
	
	@Test
	public void IsInSekq() {
		int[] seq = new int[1];
		int key =56;
		seq[0] =key;
		SearchResult searchResult = BinarySearch.search(key, seq);
		assertTrue(searchResult.isFound());
		
		
	}
	
	@Test
	public void IsNotInSekq() {
		int[] seq = new int[1];
		int key =56;
		//seq[0] =key;
		SearchResult searchResult = BinarySearch.search(key, seq);
		assertFalse(searchResult.isFound());
		
		
	}
	
	


	
	
}