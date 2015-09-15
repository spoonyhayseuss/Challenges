package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class z_friends_notes extends ActivityInstrumentationTestCase2 {
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
    public z_friends_notes() throws ClassNotFoundException {
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

		solo.sleep(500);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep
		solo.sleep(500);
        //Click on Friends
		solo.clickInList(3, 2);
        //Sleep
		solo.sleep(500);
        //Click on 3 Aaron W. 3,373
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity'
		assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));
        //Sleep
		solo.sleep(500);
        //Click on FRIENDS
		solo.clickOnView(solo.getView(0x6ca96c6));
        //Sleep for 6792 milliseconds
		solo.sleep(6792);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("m_person_chat"));
        //Wait for activity: 'com.fitbit.friends.ui.ConversationActivity_'
		assertTrue("ConversationActivity_ is not found!", solo.waitForActivity("ConversationActivity_"));
        //Sleep for 3589 milliseconds
		solo.sleep(3589);
        //Enter the text: 'dude'
		solo.clearEditText((android.widget.EditText) solo.getView("input"));
		solo.enterText((android.widget.EditText) solo.getView("input"), "dude");
        //Sleep for 1424 milliseconds
		solo.sleep(1424);
        //Click on Send
		solo.clickOnView(solo.getView("actionbar_button_ok"));
        //Sleep for 2062 milliseconds
		solo.sleep(2062);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 14));
        //Sleep for 2316 milliseconds
		solo.sleep(2316);
        //Click on Taunt
		solo.clickInList(1, 0);
        //Sleep for 3717 milliseconds
		solo.sleep(3717);
        //Click on Show Inactive Friends
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 10061 milliseconds
		solo.sleep(10061);
        //Scroll to ImageView
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView0, 5);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 3609 milliseconds
		solo.sleep(3609);
        //Click on Show Inactive Friends
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 4658 milliseconds
		solo.sleep(4658);
        //Click on MESSAGES
		solo.clickOnView(solo.getView(0x43a326d0));
        //Sleep for 1155 milliseconds
		solo.sleep(1155);
        //Click on Aaron taunted you.   24 mins ago
		solo.clickOnView(solo.getView("title", 1));
        //Sleep for 4952 milliseconds
		solo.sleep(4952);
        //Click on Aaron said  what's up dude 24 mins ago
		solo.clickOnView(solo.getView("title"));
        //Wait for activity: 'com.fitbit.friends.ui.ConversationActivity_'
		assertTrue("ConversationActivity_ is not found!", solo.waitForActivity("ConversationActivity_"));
        //Sleep for 3130 milliseconds
		solo.sleep(3130);
        //Enter the text: 'dude'
		solo.clearEditText((android.widget.EditText) solo.getView("input"));
		solo.enterText((android.widget.EditText) solo.getView("input"), "dude");
        //Sleep for 1851 milliseconds
		solo.sleep(1851);
        //Click on Send
		solo.clickOnView(solo.getView("actionbar_button_ok"));
        //Sleep for 3542 milliseconds
		solo.sleep(3542);
        //Press menu back key
		solo.goBack();
	}
}
