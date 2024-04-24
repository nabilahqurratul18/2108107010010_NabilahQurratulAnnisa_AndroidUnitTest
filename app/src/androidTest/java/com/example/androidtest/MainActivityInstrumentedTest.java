package com.example.androidtest; // Sesuaikan dengan nama paket proyek Anda

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentedTest {

    @Test
    public void testInputEditText() {
        // Mulai aktivitas
        ActivityScenario<MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);

        // Ketik teks ke dalam EditText
        onView(withId(R.id.editTextName)).perform(typeText("Nabilah"));

        // Tutup keyboard on-screen
        onView(withId(R.id.editTextName)).perform(ViewActions.closeSoftKeyboard());

        // Klik tombol
        onView(withId(R.id.buttonGreet)).perform(click());

        // Periksa apakah pesan sapaan ditampilkan dengan benar
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Halo, Nabilah!")));

        // Tutup aktivitas
        activityScenario.close();
    }

    // Pengujian untuk memeriksa apakah tombol menampilkan pesan sapaan default
    @Test
    public void testKlikTombol() {
        // Mulai aktivitas
        ActivityScenario<MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);

        // Klik tombol tanpa memasukkan teks ke dalam EditText
        onView(withId(R.id.buttonGreet)).perform(click());

        // Periksa apakah pesan sapaan default ditampilkan dengan benar
        onView(withId(R.id.textViewGreeting)).check(matches(withText("Halo, !")));

        // Tutup aktivitas
        activityScenario.close();
    }
}
