package com.sot.exercise.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContributionUtilityTest {
    private Contribution contribution;
    private Contribution contribution2;
    private ContributionUtility contributionUtility;

    @Before
    public void setup(){
        contribution = new Contribution("2/7/2022",10000.0);
        contribution2 = new Contribution("2/8/2022",15000.0);
        contributionUtility = new ContributionUtility();
    }

    @Test
    public void getContributionListEmptyTest(){
        contributionUtility.addContribution(contribution);
        assertNotNull(contributionUtility.getContributionList());
//        assertNotEquals(0,contributionUtility.getContributionList().size());
    }

    @Test
    public void addOneContributionTest(){
        contributionUtility.addContribution(contribution);
        assertEquals(1,contributionUtility.getContributionList().size());
    }

    @Test
    public void addTwoContributionTest(){
        contributionUtility.addContribution(contribution);
        contributionUtility.addContribution(contribution2);
        assertEquals(2,contributionUtility.getContributionList().size());
    }

    @Test
    public void updateOneContributionTest(){
        contributionUtility.addContribution(contribution);
        contributionUtility.updateContribution("2/7/2022",contribution2);
        assertEquals("2/8/2022",contributionUtility.getContributionList().get(0).getContributionDate());
        assertEquals(15000.0,contributionUtility.getContributionList().get(0).getContributionAmount(),0.0001);
    }

    @After
    public void tearDown(){
        contribution = null;
        contribution2 = null;
        contributionUtility = null;
    }
}
