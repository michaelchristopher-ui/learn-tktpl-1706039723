package id.ac.ui.cs.mobileprogramming.michaelchristophermanullang.helloworld;

import android.app.Activity;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    private MainActivity mTestActivity;
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);


    //https://stackoverflow.com/questions/61953249/how-to-access-activity-from-activityscenariorule
    @Test
    public void testHelloWorldTextView() {
        ActivityScenario<MainActivity> scenario = rule.getScenario().onActivity(new ActivityScenario.ActivityAction() {
            @Override
            public void perform(Activity mainActivity) {
                TextView helloWorld = mainActivity.findViewById(R.id.helloWorld);
                assertEquals("Hello World!", helloWorld.getText());
            }
        });
    }
}