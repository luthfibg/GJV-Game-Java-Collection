package com.cats;

public class Alexa extends Cat {
    public static int slideToCount = 3;
    public static int getSlideToCount(){
        return slideToCount;
    }
    public static void slideToF(int i, int x, int y, char[][] arr, char z) {
        if(x==y){
            arr[1][i + 4] = z;
        }
    }
    public static void slideToR(int i, int x, int y, char[][] arr, char z) {
        if(x==y){
            arr[3][i - 4] = z;
        }
    }

    public static void setInit() {
        init = '@';
    }

    public Alexa() {
        setCatName("Alexa");
    }
}
