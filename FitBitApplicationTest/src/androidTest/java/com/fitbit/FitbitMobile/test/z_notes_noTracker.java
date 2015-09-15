package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes_noTracker extends ActivityInstrumentationTestCase2 {
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
    public z_notes_noTracker() throws ClassNotFoundException {
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
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 8210 milliseconds
		solo.sleep(8210);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1474 milliseconds
		solo.sleep(1474);
        //Click on Challenges
		solo.clickInList(2, 2);
        //Sleep for 7829 milliseconds
		solo.sleep(7829);
        //Click on Goal Day
		solo.clickOnView(solo.getView("challenge_type"));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 3062 milliseconds
		solo.sleep(3062);
        //Click on Rules
		solo.clickOnView(solo.getView("rules"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 1778 milliseconds
		solo.sleep(1778);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 2242 milliseconds
		solo.sleep(2242);
        //Click on Start Tomorrow
		solo.clickOnText(java.util.regex.Pattern.quote("Start Tomorrow"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 4774 milliseconds
		solo.sleep(4774);
        //Click on Cancel
		solo.clickOnView(solo.getView("text", 1));
        //Sleep for 2083 milliseconds
		solo.sleep(2083);
        //Click on Start Now
		solo.clickOnText(java.util.regex.Pattern.quote("Start Now"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 3039 milliseconds
		solo.sleep(3039);
        //Click on Set Up a New Fitbit Device
		solo.clickOnView(solo.getView("text"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
		assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep for 8723 milliseconds
		solo.sleep(8723);
        //Click on Charge Wireless activity + sleep wristband with display
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
		assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));
	}
}
