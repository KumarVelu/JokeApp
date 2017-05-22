package com.velu.jokes;

public class Joke {

    // Return random joke from the array
    public String getJoke(){
        int randomNo = (int) (Math.random() * 10);

        JokeUtils jokeUtils = new JokeUtils();
        return jokeUtils.getmJokeList().get(randomNo);
    }
}
