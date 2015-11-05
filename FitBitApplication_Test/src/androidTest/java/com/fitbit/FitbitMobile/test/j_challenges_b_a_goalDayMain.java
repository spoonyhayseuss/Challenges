package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class j_challenges_b_a_goalDayMain extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public j_challenges_b_a_goalDayMain() throws ClassNotFoundException {
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


        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));

        //Click on Challenges
        solo.clickOnText("Challenges");

        //Click on Goal Day
        //solo.clickOnText("Goal Day");
        solo.clickOnView(solo.getView("challenge_type"));
        //Wait for activity: 'com.fitbit.challenges.ui.OutgoingInvitationActivity'
        //assertTrue("OutgoingInvitationActivity is not found!", solo.waitForActivity("OutgoingInvitationActivity"));

        solo.clickOnText("Goal Day");

        solo.clickOnText("Get your game face on and commit to fit");

        solo.goBack();



    }
}
