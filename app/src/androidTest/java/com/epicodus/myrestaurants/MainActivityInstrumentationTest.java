package com.epicodus.myrestaurants;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurants.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.enterZip)).perform(typeText("97214"))
                .check(matches(withText("97214")));
    }

//    @Test
//    public void locationIsSentToRestaurantsActivity() {
//        String zip = "97214";
//        onView(withId(R.id.enterZip)).perform(typeText(zip));
//        onView(withId(R.id.emberButton)).perform(click());
//        onView(withId(R.id.locationTextView)).check(matches
//                (withText("Yo, dawg. Here are all the donuts near "  + zip)));
//    }
}
