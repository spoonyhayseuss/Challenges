package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class tapDots2 extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public tapDots2() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
		solo.waitForActivity("LandingActivity_", 2000);
        //Sleep for 2171 milliseconds
		solo.sleep(2171);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 3231 milliseconds
		solo.sleep(3231);
        //Click on Friends
		solo.clickInList(3, 2);
        //Sleep for 3744 milliseconds
		solo.sleep(3744);
        //Scroll to Aaron W. Unranked
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 16);
        //Click on Aaron W. Unranked
		solo.clickOnText(java.util.regex.Pattern.quote("Aaron W."));
        //Wait for activity: 'com.fitbit.friends.ui.PersonActivity_'
		assertTrue("PersonActivity_ is not found!", solo.waitForActivity("PersonActivity_"));
        //Sleep for 1739 milliseconds
		solo.sleep(1739);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 13));
        //Sleep for 5134 milliseconds
		solo.sleep(5134);
        //Click on Message
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.friends.ui.ConversationActivity_'
		assertTrue("ConversationActivity_ is not found!", solo.waitForActivity("ConversationActivity_"));
	}
}
