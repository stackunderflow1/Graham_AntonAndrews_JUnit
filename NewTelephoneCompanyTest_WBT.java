package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	NewTelephoneCompany sample1;

	@Before
	public void setUp() throws Exception {
		sample1 = new NewTelephoneCompany();
		
	}

	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidStartTime() {
	    sample1.setStartTime(1161);
	    sample1.setDuration(10);
	    sample1.computeCharge();
		
	}
	
	@Test(expected=UnsupportedOperationException.class)
	  public void testComputeCharge_InvalidDuration() {
	    sample1.setStartTime(1800);
	    sample1.setDuration(0);
	    sample1.computeCharge();
		
	}

	@Test
	  public void testComputeCharge_DiscountedStartTimeAndDuration() {
	    sample1.setStartTime(1959);
	    sample1.setDuration(61);
	    sample1.computeCharge();
	    double expResult = 1078.48;
	    assertTrue("A call starting at " + sample1.getStartTime() + " for a duration of " + sample1.getDuration()+ expResult,expResult==sample1.computeCharge());  
		
	}

	@Test
	  public void testComputeCharge_DiscountedStartTime() {
	    sample1.setStartTime(500);
	    sample1.setDuration(100);
	    sample1.computeCharge();
	    double expResult = 1768.0;
	    assertTrue("A call starting at " + sample1.getStartTime() + " for a duration of " + sample1.getDuration()+ expResult,expResult==sample1.computeCharge());  
		
	}


	@Test
	  public void testComputeCharge_DiscountedDuration() {
	    sample1.setStartTime(900);
	    sample1.setDuration(61);
	    sample1.computeCharge();
	    double expResult = 2156.96;
	    assertTrue("A call starting at " + sample1.getStartTime() + " for a duration of " + sample1.getDuration()+ expResult,expResult==sample1.computeCharge());  
		
	}

	@Test
	  public void testComputeCharge_NoDiscounts() {
	    sample1.setStartTime(800);
	    sample1.setDuration(1);
	    sample1.computeCharge();
	    double expResult = 41.6;
	    assertTrue("A call starting at " + sample1.getStartTime() + " for a duration of " + sample1.getDuration()+ expResult,expResult==sample1.computeCharge());  
		
	}

}
