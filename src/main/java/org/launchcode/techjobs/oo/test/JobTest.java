package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


import java.util.Comparator;
import static org.junit.Assert.*;


/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    Job job1;
    @Test
    public void testSettingJobId() {
        Job jobID1 = new Job();
        Job jobID2 = new Job();
        assertNotEquals(jobID1, jobID2);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
      job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
      assertTrue(job1.getName() == "Product Tester");
      assertTrue(job1.getEmployer().getValue() == "ACME");
      assertTrue(job1.getLocation().getValue() == "Desert");
      assertTrue(job1.getPositionType().getValue() == "Quality Control");
      assertTrue(job1.getCoreCompetency().getValue() == "Persistence");

        assertEquals(job1.getName(), "Product Tester");
        assertEquals(job1.getEmployer().getValue(), "ACME");
        assertEquals(job1.getLocation().getValue(),"Desert");
        assertEquals(job1.getPositionType().getValue(),"Quality Control");
        assertEquals(job1.getCoreCompetency().getValue(),"Persistence");

    }


    @Test
    public void testJobsForEquality(){
        Job job2 = new Job( "Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job( "Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
         assertFalse(job2.equals(job3));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String actualString = job1.toString();
        String expectedString = "\nID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";

        assertEquals(expectedString, actualString);
        assertEquals('\n', '\n');
        assertEquals('\n', '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String actualString = job1.toString();
        String expectedString = "\nID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n";

        assertEquals(expectedString, actualString);

    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job job2 = new Job( "", new Employer(""), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
    String actualString = job2.toString();
    String expectedString = "\nID: " + job2.getId() + "\n" +
            "Name: " + "Data not available" + "\n" +
            "Employer: " + "Data not available" + "\n" +
            "Location: " + job2.getLocation() + "\n" +
            "Position Type: " + job2.getPositionType() + "\n" +
            "Core Competency: " + job2.getCoreCompetency() + "\n";

        assertEquals(expectedString, actualString);
    }
}