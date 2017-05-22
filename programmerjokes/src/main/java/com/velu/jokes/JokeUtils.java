package com.velu.jokes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Velu on 22/05/17.
 */

public class JokeUtils {

    private List<String> mJokeList;

    public JokeUtils(){
        mJokeList = new ArrayList<>();
        mJokeList.add("How many programmers does it take to change a light bulb? \n " +
                "None – It’s a hardware problem");
        mJokeList.add("There are only 10 kinds of people in this world: those who know binary and those who don’t.");
        mJokeList.add("Why do programmers always mix up Halloween and Christmas? \n" +
                "Because Oct 31 equals Dec 25.");
        mJokeList.add("A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"");
        mJokeList.add("Q: \"Whats the object-oriented way to become wealthy?\" \n" +
                "A: Inheritance");
        mJokeList.add("To understand what recursion is, you must first understand recursion.");
        mJokeList.add("Why programmers like UNIX: \n" +
                " unzip, strip, touch, finger, grep, mount, fsck, more, yes, fsck, fsck, fsck, umount, sleep");
        mJokeList.add("Why do Java programmers wear glasses? \n" +
                " Because they don’t C#!");
        mJokeList.add("If you like infinite loop jokes, check this one out.");
        mJokeList.add("Q: What do you call a collection that has no methods and doesn’t do anything? \\n\n" +
                " A: A listless list");
    }

    public List<String> getmJokeList() {
        return mJokeList;
    }

    public void setmJokeList(List<String> mJokeList) {
        this.mJokeList = mJokeList;
    }
}
