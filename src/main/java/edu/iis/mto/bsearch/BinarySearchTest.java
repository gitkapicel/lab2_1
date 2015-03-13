package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;

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
		assertThat(true, is(searchResult.isFound()));
		
		
	}
	
	@Test
	public void IsNotInSekq() {
		int[] seq = new int[1];
		int key =56;
		//seq[0] =key;
		SearchResult searchResult = BinarySearch.search(key, seq);
		assertThat(false, is(searchResult.isFound()));
		
		
	}
	
	
	@Test
	public void IsFirstInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		
		SearchResult searchResult = BinarySearch.search(2, seq);
		assertThat(1, is(searchResult.getPosition()));
		
		
	}
	
	
	@Test
	public void IsLastInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		
		SearchResult searchResult = BinarySearch.search(56, seq);
		assertThat(6, is(searchResult.getPosition()));
		
		
	}
	
	
	@Test
	public void IsMidleInSekq() {
		int[] seq = new int[] {2,3,4,7,10,56};
		int pos = seq.length/2;
		
		
		SearchResult searchResult = BinarySearch.search(4, seq);
		assertThat(pos, is(searchResult.getPosition()));
		
		
	}

	
	@Test
	public void IsMidle2InSekq() {
		int[] seq = new int[] {2,3,4,7,10};
		int pos = seq.length/2+1;
		
		
		SearchResult searchResult = BinarySearch.search(4, seq);
		assertThat(pos, is(searchResult.getPosition()));
		
		
	}
	
	@Test
	public void IsNotInSekqMoreThenOne() {
		int[] seq = new int[] {2,3,4,7,10};
		
		
		SearchResult searchResult = BinarySearch.search(20, seq);
		assertThat(false, is(searchResult.isFound()));
		
		
	}


	@Test(expected = IllegalArgumentException.class)
	public void seqIsEqNull()
	{
	 int[] seq = new int[0];
	 BinarySearch.search(1, seq);
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void seqIsNotSorted()
	{
	 int[] seq = {6,4,8,3,2,8};
	 BinarySearch.search(1, seq);
	}

	
	
}
