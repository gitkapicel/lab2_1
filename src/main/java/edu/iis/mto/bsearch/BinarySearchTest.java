package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import java.util.Random;

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
	
	
	@Test
	public void IsFirstInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		
		SearchResult searchResult = BinarySearch.search(2, seq);
		assertEquals(1,searchResult.getPosition());
		
		
	}
	
	
	@Test
	public void IsLastInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		
		SearchResult searchResult = BinarySearch.search(56, seq);
		assertEquals(6,searchResult.getPosition());
		
		
	}
	
	
	@Test
	public void IsMidleInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		int pos = seq.length/2;
		
		
		SearchResult searchResult = BinarySearch.search(4, seq);
		assertEquals(pos,searchResult.getPosition());
		
		
	}

	
	@Test
	public void IsMidle2InSekq() {
		int[] seq = new int[] {2,3,4,7,10};
		int pos = seq.length/2+1;
		
		
		SearchResult searchResult = BinarySearch.search(4, seq);
		assertEquals(pos,searchResult.getPosition());
		
		
	}
	
	@Test
	public void IsNotInSekqMoreThenOne() {
		int[] seq = new int[] {2,3,4,7,10};
		
		
		SearchResult searchResult = BinarySearch.search(20, seq);
		assertFalse(searchResult.isFound());
		
		
	}



	
	
}
