package com.obstacles;

import com.fields.FieldType2;
import com.fields.Fields;
import com.firstgame.Act;
import com.firstgame.SystemInfo;
import com.globalset.J;

import java.util.ArrayList;
import java.util.Collections;


public class JumperSquare extends Obstacles {
    public static int jumpCode1;
    public static int jumpCode2;
    public static ArrayList<Integer> collectNumJ = new ArrayList<>();
    public static ArrayList<Integer> pos = new ArrayList<>();
    public static ArrayList<Integer> allIndexType2 = new ArrayList<>();

    public static void alertJumper() {
        SystemInfo.lineSpacer2();
        J.println("-----------------------------------");
        J.println("          Jumper Time!             ");
        J.println("-----------------------------------");
        SystemInfo.lineSpacer();
    }

    public static void jumpHandler(int w, int x, int y, int z) {
        if (Act.playerField == 2){
            if (x == 1 || x == 5) {
                inputIndexContent();
                getRandomPos();
                if (z == selectPos1() || z == selectPos2()) {
                    alertJumper();
                    new JumperSquare();
                    jumpBack(Act.playerGuess, jumpCode1, jumpCode2, x);
                }
                if (Act.catSouls <= 1) {
                    Act.crc = 'X';
                }
                if (y >= 4) {
                    FieldType2.fieldCreatorType2[x][y - 4] = Fields.deleteContent;
                } else if(x == 5 && y == 3){
                    FieldType2.fieldCreatorType2[3][3] = Fields.deleteContent;
                }
                FieldType2.fieldCreatorType2[x][y] = Act.crc;
            } else if (x == 3 || x == 7){
                if (Act.catSouls <= 1) {
                    Act.crc = 'X';
                }
                if (y <= 35) {
                    FieldType2.fieldCreatorType2[x][y + 4] = Fields.deleteContent;
                } else if (x == 3 && y == w) {
                    FieldType2.fieldCreatorType2[1][w] = Fields.deleteContent;
                } else if (x == 7 && y == w) {
                    FieldType2.fieldCreatorType2[5][w] = Fields.deleteContent;
                }

                FieldType2.fieldCreatorType2[x][y] = Act.crc;
            }
        } else if(Act.playerField == 3) {
            J.println("//some code haven't been finish");
        }

        /*
        jumpHandler(m, n, square);*/
    }

    public JumperSquare() {
        attackPoint = 0;
        if (Act.playerField == 2){
            jumpCode1 = rand.nextInt(5) + 1;
            jumpCode2 = avoidDuplicate(rand.nextInt(5) + 1, jumpCode1, 5);
        } else if(Act.playerField == 3){
            jumpCode1 = rand.nextInt(6) + 1;
            jumpCode2 = avoidDuplicate(rand.nextInt(6) + 1, jumpCode1, 6);
        } else if(Act.playerField == 4){
            jumpCode1 = rand.nextInt(10) + 1;
            jumpCode2 = avoidDuplicate(rand.nextInt(10) + 1, jumpCode1, 10);
        } else if(Act.playerField == 5){
            jumpCode1 = rand.nextInt(10) + 1;
            jumpCode2 = avoidDuplicate(rand.nextInt(10) + 1, jumpCode1, 10);
        }
    }
    public static int avoidDuplicate(int x, int y, int z){
        if(x != y){
            jumpCode2 = x;
        } else {
            if(x == z){
                jumpCode2 = y-4;
            } else {
                jumpCode2 = y+1;
            }
        }
        return jumpCode2;
    }
    public static void inputIndexContent(){
        int num = 0;
        for(int i=0; i<=39; i++){
            num += 1;
            allIndexType2.add(i, num);
        }
    }
    public static void getRandomPos(){
        int counter = 3;
        Collections.shuffle(allIndexType2);
        for(int c=1; c<counter; c++){
            pos.add(allIndexType2.get(c));
        }
    }
    public static void main(String[] args){
        inputIndexContent();
        getRandomPos();
//        double sortedArray = new double(size(pos));
        SystemInfo.lineSpacer2();
        System.out.println(pos);
        J.printlIn(selectPos1());
        J.printlIn(selectPos2());
    }
    public static int selectPos1(){
        int intPos1;
        intPos1 = pos.get(0);
        return intPos1;
    }
    public static int selectPos2(){
        int intPos2;
        intPos2 = pos.get(1);
        return intPos2;
    }
    public static void jumpBack(int val1, int val2, int val3, int m) {
        if (val1 == val2 || val1 == val3) {
            FieldType2.fieldCreatorType2[m][3] = Act.crc;
            Act.catSouls -= attackPoint;
        }
    }
}
