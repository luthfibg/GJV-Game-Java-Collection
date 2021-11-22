package com.fields;

import com.firstgame.SystemInfo;
import com.globalset.J;
import java.util.Scanner;

public class Fields {
    /******************** Method For Tester *****************/
    public static void main(String[] args){
        //some code to be execute
        new FieldType1();
        new FieldType2();
        new FieldType3();

        test(FieldType1.fieldCreatorType1, FieldType2.fieldCreatorType2, FieldType3.fieldCreatorType3);

    }
    /********************************************************/

    //Define character field creator
    public static char n = ' ';
    public static char e = '=';
    public static char p = '+';
    public static char m = '-';
    public static char b = '|';
    public static char c = '>';
    public static char d = '<';
    public static char w = 'v';
    public static char s = 'S';
    public static char f = 'F';
    public static char y = ']';
    public static char deleteContent = ' ';
    public static Scanner input = new Scanner(System.in);

    //create field initial
    public static char[][] fieldCreatorType1;
    public static char[][] fieldCreatorType2;
    public static char[][] fieldCreatorType3;
    public static char[][] fieldCreatorType4;
    public static char[][] fieldCreatorType5;

    //print fields
    public static void printCreator(char[][] array){
        for (char[] lines : array) {
            for (char val : lines) {
                J.printc(val);
            }
            J.println(" ");
        }
    }

    //Field Behavior
    public static void fieldMethod(){
        //some code to be action
    }

    //Field Access
    public static void fieldAccess(){
        //some code to be action
    }

//    Tester fieldCreator
    public static void test(char[][] arr1, char[][] arr2, char[][] arr3){
        J.println("Field Level 1:");
        printCreator(arr1);
        SystemInfo.lineSpacer();

        J.println("Field level 2:");
        printCreator(arr2);
        SystemInfo.lineSpacer();

        J.println("Field level 3:");
        printCreator(arr3);
        SystemInfo.lineSpacer();
    }
}

