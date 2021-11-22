package com.cats;


import com.firstgame.Act;

public class Cat {
    public static String catName;
    public static char init;
    public static int hp;
    public static int getInit(){ return init; }
    public static int getHp() {
        return hp;
    }
    public static void setHp(int x) {
        hp = x;
    }
    public static String getCatName() {
        return catName;
    }
    public static void setCatName(String y) {
        catName = y;
    }
    Cat() {
        setHp(9);
    }

    /******************** Method For Tester *****************/
    public static void main(String[] args){
        //some code to be execute
//        Amy.setCatName("Amy");
        new Alexa();
//        J.println(getCatName());
    }
}

