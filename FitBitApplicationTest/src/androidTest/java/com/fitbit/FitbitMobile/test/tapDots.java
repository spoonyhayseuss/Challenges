package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class tapDots extends ActivityInstrumentationTestCase2 {
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
    public tapDots() throws ClassNotFoundException {
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
        //Sleep for 5621 milliseconds
		solo.sleep(5621);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1509 milliseconds
		solo.sleep(1509);
        //Click on Challenges
		solo.clickInList(2, 2);
        //Sleep for 3241 milliseconds
		solo.sleep(3241);
        //Click on Daily Showdown 1123 steps behind Greg 7 hours left
		solo.clickOnView(solo.getView("challenge"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity_'
		assertTrue("ChallengeActivity_ is not found!", solo.waitForActivity("ChallengeActivity_"));
        //Sleep for 1588 milliseconds
		solo.sleep(1588);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 25));
        //Sleep for 2614 milliseconds
		solo.sleep(2614);
        //Click on Gameplay & Rules
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
	}
}
