package org.eureka.pinty;

import org.junit.Test;

import org.eureka.pinty.data.utils.Calendar;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants viewutils.
 */
public class ExampleUnitTest {
    @Test
    public void verifyClass_Calendar() {
        Calendar calTest = new Calendar("2016-9-5");
        System.out.println(calTest.getCalendarAsString());
    }
}