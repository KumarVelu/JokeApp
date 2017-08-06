package com.velu.testing;

import android.support.test.runner.AndroidJUnit4;

import com.velu.gradle.builditbigger.JokeAsyncTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Velu on 23/05/17.
 */
@RunWith(AndroidJUnit4.class)
public class FetchJokeTest {

    @Test
    public void testNonEmptyJoke(){
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask();
        jokeAsyncTask.execute();

        try {
           String joke = jokeAsyncTask.get();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
