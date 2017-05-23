package com.velu.testing;

import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Velu on 23/05/17.
 */

public class Echo {

    @Test
    public void addition_isCorrect() throws Exception {
        Log.i("Hello", "addition_isCorrect: ");
        assertEquals(4, 2 + 2);
    }
}
