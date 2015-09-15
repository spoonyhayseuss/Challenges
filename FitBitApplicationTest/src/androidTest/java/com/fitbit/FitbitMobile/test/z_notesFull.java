package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notesFull extends ActivityInstrumentationTestCase2 {
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
    public z_notesFull() throws ClassNotFoundException {
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
        //Sleep for 2949 milliseconds
		solo.sleep(2949);
        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for 3590 milliseconds
		solo.sleep(3590);
        //Enter the text: 'exercise@android.com'
		solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
		solo.enterText((android.widget.EditText) solo.getView("login_email"), "exercise@android.com");
        //Sleep for 955 milliseconds
		solo.sleep(955);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("login_password"));
        //Sleep for 5815 milliseconds
		solo.sleep(5815);
        //Enter the text: 'exercise'
		solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
		solo.enterText((android.widget.EditText) solo.getView("login_password"), "exercise");
        //Sleep for 1330 milliseconds
		solo.sleep(1330);
        //Click on Log in
		solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 2073 milliseconds
		solo.sleep(2073);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1611 milliseconds
		solo.sleep(1611);
        //Click on Challenges
		solo.clickInList(2, 2);
        //Sleep for 6425 milliseconds
		solo.sleep(6425);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 3676 milliseconds
		solo.sleep(3676);
        //Click on Goal Day
		solo.clickOnView(solo.getView("challenge_type"));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 1180 milliseconds
		solo.sleep(1180);
        //Click on Rules
		solo.clickOnView(solo.getView("rules"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 2879 milliseconds
		solo.sleep(2879);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 2190 milliseconds
		solo.sleep(2190);
        //Click on Start Tomorrow
		solo.clickOnText(java.util.regex.Pattern.quote("Start Tomorrow"));
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 3820 milliseconds
		solo.sleep(3820);
        //Click on Only friends with the Fitbit App and a Fitbit tracker or MobileTrack will b
		solo.clickOnText(java.util.regex.Pattern.quote("Only friends with the Fitbit App and a Fitbit tracker or MobileTrack will be able to join challenges at this time."));
        //Sleep for 1860 milliseconds
		solo.sleep(1860);
        //Click on Show Inactive People
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 4851 milliseconds
		solo.sleep(4851);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("check_choose", 1));
        //Sleep for 2706 milliseconds
		solo.sleep(2706);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity'
		assertTrue("ChallengeActivity is not found!", solo.waitForActivity("ChallengeActivity"));
        //Sleep for 4597 milliseconds
		solo.sleep(4597);
        //Click on Exercisea joined with a 1000K step goal
		solo.clickOnView(solo.getView("message_text"));
        //Sleep for 2186 milliseconds
		solo.sleep(2186);
        //Click on View
		solo.clickOnView(solo.getView("drag_handle"));
        //Sleep for 4528 milliseconds
		solo.sleep(4528);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 4));
        //Sleep for 1536 milliseconds
		solo.sleep(1536);
        //Click on Gameplay & Rules
		solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 2859 milliseconds
		solo.sleep(2859);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1065 milliseconds
		solo.sleep(1065);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 4));
        //Sleep for 1180 milliseconds
		solo.sleep(1180);
        //Click on Invite More People
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 1427 milliseconds
		solo.sleep(1427);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("check_choose"));
        //Sleep for 1882 milliseconds
		solo.sleep(1882);
        //Click on Show Inactive People
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 1766 milliseconds
		solo.sleep(1766);
        //Click on Only friends with the Fitbit App and a Fitbit tracker or MobileTrack will b
		solo.clickOnText(java.util.regex.Pattern.quote("Only friends with the Fitbit App and a Fitbit tracker or MobileTrack will be able to join challenges at this time."));
        //Sleep for 1295 milliseconds
		solo.sleep(1295);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Sleep for 4401 milliseconds
		solo.sleep(4401);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 4));
        //Sleep for 3234 milliseconds
		solo.sleep(3234);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("send_message_txt"));
        //Sleep for 2563 milliseconds
		solo.sleep(2563);
        //Enter the text: 'oye'
		solo.clearEditText((android.widget.EditText) solo.getView("send_message_txt"));
		solo.enterText((android.widget.EditText) solo.getView("send_message_txt"), "oye");
        //Sleep for 1040 milliseconds
		solo.sleep(1040);
        //Click on View
		solo.clickOnView(solo.getView("send_message_btn"));
        //Sleep for 2251 milliseconds
		solo.sleep(2251);
        //Click on oye
		solo.clickOnView(solo.getView("message_text", 2));
        //Sleep for 1252 milliseconds
		solo.sleep(1252);
        //Click on oye
		solo.clickOnView(solo.getView("message_text", 2));
        //Sleep for 604 milliseconds
		solo.sleep(604);
        //Click on Cheer
		solo.clickOnView(solo.getView("cheer_button", 2));
        //Sleep for 3471 milliseconds
		solo.sleep(3471);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 6));
        //Sleep for 1557 milliseconds
		solo.sleep(1557);
        //Click on Options
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeOptionsActivity_'
		assertTrue("ChallengeOptionsActivity_ is not found!", solo.waitForActivity("ChallengeOptionsActivity_"));
        //Sleep for 1791 milliseconds
		solo.sleep(1791);
        //Click on Aaron W No recent activity
		solo.clickOnView(solo.getView("content", 3));
        //Wait for activity: 'com.fitbit.settings.ui.ProfileActivity'
		assertTrue("ProfileActivity is not found!", solo.waitForActivity("ProfileActivity"));
        //Sleep for 3716 milliseconds
		solo.sleep(3716);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("m_person_chat"));
        //Wait for activity: 'com.fitbit.friends.ui.ConversationActivity_'
		assertTrue("ConversationActivity_ is not found!", solo.waitForActivity("ConversationActivity_"));
        //Sleep for 1417 milliseconds
		solo.sleep(1417);
        //Enter the text: 'hi'
		solo.clearEditText((android.widget.EditText) solo.getView("input"));
		solo.enterText((android.widget.EditText) solo.getView("input"), "hi");
        //Sleep for 1163 milliseconds
		solo.sleep(1163);
        //Click on Send
		solo.clickOnView(solo.getView("actionbar_button_ok"));
        //Sleep for 3916 milliseconds
		solo.sleep(3916);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("m_person_cheer"));
        //Sleep for 1695 milliseconds
		solo.sleep(1695);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 14));
        //Sleep for 880 milliseconds
		solo.sleep(880);
        //Click on Taunt
		solo.clickInList(1, 0);
        //Sleep for 1354 milliseconds
		solo.sleep(1354);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 4137 milliseconds
		solo.sleep(4137);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("check"));
        //Sleep for 5963 milliseconds
		solo.sleep(5963);
        //Click on Quit This Challenge
		solo.clickOnView(solo.getView("quit_challenge"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1853 milliseconds
		solo.sleep(1853);
        //Click on Cancel
		solo.clickOnView(solo.getView(android.R.id.button2));
        //Sleep for 977 milliseconds
		solo.sleep(977);
        //Click on Quit This Challenge
		solo.clickOnView(solo.getView("quit_challenge"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1203 milliseconds
		solo.sleep(1203);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 1581 milliseconds
		solo.sleep(1581);
        //Click on Weekend Warrior
		solo.clickOnView(solo.getView("challenge_type", 1));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 2226 milliseconds
		solo.sleep(2226);
        //Click on Rules
		solo.clickOnView(solo.getView("rules"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 1002 milliseconds
		solo.sleep(1002);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 3221 milliseconds
		solo.sleep(3221);
        //Assert that: 'Add a little winning to your relaxing weekend by taking the most ste' is shown
		assertTrue("'Add a little winning to your relaxing weekend by taking the most ste' is not shown!", solo.waitForView(solo.getView("detail")));
        //Sleep for 1863 milliseconds
		solo.sleep(1863);
        //Click on Start Saturday
		solo.clickOnText(java.util.regex.Pattern.quote("Start Saturday"));
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 2434 milliseconds
		solo.sleep(2434);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 4606 milliseconds
		solo.sleep(4606);
        //Click on Start Anyway
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity'
		assertTrue("ChallengeActivity is not found!", solo.waitForActivity("ChallengeActivity"));
        //Sleep for 7503 milliseconds
		solo.sleep(7503);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 2));
        //Sleep for 1018 milliseconds
		solo.sleep(1018);
        //Click on Options
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeOptionsActivity_'
		assertTrue("ChallengeOptionsActivity_ is not found!", solo.waitForActivity("ChallengeOptionsActivity_"));
        //Sleep for 1661 milliseconds
		solo.sleep(1661);
        //Click on Quit This Challenge
		solo.clickOnView(solo.getView("quit_challenge"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1212 milliseconds
		solo.sleep(1212);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 1357 milliseconds
		solo.sleep(1357);
        //Click on Daily Showdown
		solo.clickOnView(solo.getView("challenge_type", 2));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 1497 milliseconds
		solo.sleep(1497);
        //Click on Rules
		solo.clickOnView(solo.getView("rules"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 2602 milliseconds
		solo.sleep(2602);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1265 milliseconds
		solo.sleep(1265);
        //Click on Start Tomorrow
		solo.clickOnText(java.util.regex.Pattern.quote("Start Tomorrow"));
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 3111 milliseconds
		solo.sleep(3111);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1281 milliseconds
		solo.sleep(1281);
        //Click on Add Players
		solo.clickOnView(solo.getView(android.R.id.button2));
        //Sleep for 976 milliseconds
		solo.sleep(976);
        //Click on Show Inactive People
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 1357 milliseconds
		solo.sleep(1357);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("check_choose", 1));
        //Sleep for 3989 milliseconds
		solo.sleep(3989);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity'
		assertTrue("ChallengeActivity is not found!", solo.waitForActivity("ChallengeActivity"));
        //Sleep for 4175 milliseconds
		solo.sleep(4175);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 2));
        //Sleep for 1974 milliseconds
		solo.sleep(1974);
        //Click on Options
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeOptionsActivity_'
		assertTrue("ChallengeOptionsActivity_ is not found!", solo.waitForActivity("ChallengeOptionsActivity_"));
        //Sleep for 5018 milliseconds
		solo.sleep(5018);
        //Click on Quit This Challenge
		solo.clickOnView(solo.getView("quit_challenge"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 909 milliseconds
		solo.sleep(909);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 2340 milliseconds
		solo.sleep(2340);
        //Scroll to Workweek Hustle
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 0);
        //Click on Workweek Hustle
		solo.clickOnView(solo.getView("challenge_type", 3));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 879 milliseconds
		solo.sleep(879);
        //Click on Rules
		solo.clickOnView(solo.getView("rules"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeGameplayActivity_'
		assertTrue("ChallengeGameplayActivity_ is not found!", solo.waitForActivity("ChallengeGameplayActivity_"));
        //Sleep for 1028 milliseconds
		solo.sleep(1028);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 981 milliseconds
		solo.sleep(981);
        //Click on Start Next Monday
		solo.clickOnText(java.util.regex.Pattern.quote("Start Next Monday"));
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 1766 milliseconds
		solo.sleep(1766);
        //Click on Show Inactive People
		solo.clickOnView(solo.getView("show_inactive"));
        //Sleep for 607 milliseconds
		solo.sleep(607);
        //Click on Empty Text View
		solo.clickOnView(solo.getView("check_choose", 1));
        //Sleep for 546 milliseconds
		solo.sleep(546);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity'
		assertTrue("ChallengeActivity is not found!", solo.waitForActivity("ChallengeActivity"));
        //Sleep for 12568 milliseconds
		solo.sleep(12568);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 1841 milliseconds
		solo.sleep(1841);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 1133 milliseconds
		solo.sleep(1133);
        //Click on Challenges
		solo.clickInList(2, 2);
        //Sleep for 1365 milliseconds
		solo.sleep(1365);
        //Click on Workweek Hustle
		solo.clickOnView(solo.getView("challenge_type", 3));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
		assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));
        //Sleep for 1120 milliseconds
		solo.sleep(1120);
        //Click on Start Now
		solo.clickOnText(java.util.regex.Pattern.quote("Start Now"));
        //Wait for activity: 'com.fitbit.challenges.ui.AddPlayersActivity_'
		assertTrue("AddPlayersActivity_ is not found!", solo.waitForActivity("AddPlayersActivity_"));
        //Sleep for 2292 milliseconds
		solo.sleep(2292);
        //Click on Done
		solo.clickOnView(solo.getView("done"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 1091 milliseconds
		solo.sleep(1091);
        //Click on Start Anyway
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeActivity'
		assertTrue("ChallengeActivity is not found!", solo.waitForActivity("ChallengeActivity"));
        //Sleep for 5748 milliseconds
		solo.sleep(5748);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageView.class, 2));
        //Sleep for 877 milliseconds
		solo.sleep(877);
        //Click on Options
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.challenges.ui.ChallengeOptionsActivity_'
		assertTrue("ChallengeOptionsActivity_ is not found!", solo.waitForActivity("ChallengeOptionsActivity_"));
        //Sleep for 1034 milliseconds
		solo.sleep(1034);
        //Click on Quit This Challenge
		solo.clickOnView(solo.getView("quit_challenge"));
        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for 922 milliseconds
		solo.sleep(922);
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
	}
}
