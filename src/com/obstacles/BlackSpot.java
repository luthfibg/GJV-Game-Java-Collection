package com.obstacles;

import java.util.ArrayList;
import com.firstgame.Act;

public class BlackSpot extends Obstacles {
    public static ArrayList<Integer> collectNum = new ArrayList<>();
    public static int deadlyCode;

    public static int getDeadlyCode() {
        return deadlyCode;
    }

    public static void soulsEffect(int val1, int val2) {
        if (val1 == val2) {
            setAttackPoint();
            Act.catSouls -= getAttackPoint();
        }
    }
    public static void scoreEffect(int val1, int val2) {
        if (val1 == val2) {
            Act.score += 1;
        }
    }

//    public static void BlackSpot1() {
//        deadlyCode = rand.nextInt(2) + 1;
//    }
//    public static void BlackSpot2() {
//        deadlyCode = rand.nextInt(5) + 1;
//    }
    public BlackSpot(){
        if (Act.playerField == 1){
            deadlyCode = rand.nextInt(2) + 1;
        } else if(Act.playerField == 2){
            deadlyCode = rand.nextInt(5) + 1;
        } else if(Act.playerField == 3){
            deadlyCode = rand.nextInt(6) + 1;
        } else if(Act.playerField == 4){
            deadlyCode = rand.nextInt(10) + 1;
        } else if(Act.playerField == 5){
            deadlyCode = rand.nextInt(10) + 1;
        }
    }
}
