package com.obstacles;

import com.firstgame.SystemInfo;
import com.globalset.J;

import java.util.ArrayList;

class BigBlackSpot extends Obstacles {
    public static ArrayList<Integer> collectNumb = new ArrayList<>();
    public static int mostDeadlyCode;

    public static void alertBBS() {
        SystemInfo.lineSpacer2();
        J.println("===================================");
        J.println("   Warning: Big Black Spot Coming  ");
        J.println("===================================");
        SystemInfo.lineSpacer();
    }

    public static void bbsEffect() {
        //some code to be action
    }

    public BigBlackSpot() {
        mostDeadlyCode = rand.nextInt(3) + 1;
    }
}
