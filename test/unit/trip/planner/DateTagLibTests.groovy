package trip.planner

import grails.test.*

class DateTagLibTests extends TagLibUnitTestCase {

    def dateTagLib;

    protected void setUp() {
        super.setUp()

        dateTagLib = new DateTagLib();
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testThisYear() {
            String expected = Calendar.getInstance().get(Calendar.YEAR)
            assertEquals("the years don't match", expected, (String)dateTagLib.thisYear())
    }
}
