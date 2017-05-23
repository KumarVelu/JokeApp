package com.Velu.myapplication.backend;

/**
 * Created by Velu on 23/05/17.
 */

public class JokeBean {

    private String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }

    @Override
    public String toString() {
        return "JokeBean{" +
                "joke='" + joke + '\'' +
                '}';
    }
}
