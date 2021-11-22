package com.fields;

import com.firstgame.SystemInfo;
import com.globalset.J;

public class FieldType3 extends Fields {
//    public static char n = ' ';
//    public static char e = '=';
//    public static char p = '+';
//    public static char m = '-';
//    public static char b = '|';
//    public static char c = '>';
//    public static char d = '<';
//    public static char w = 'v';
//    public static char s = 'S';
//    public static char f = 'F';
//    public static char y = ']';
    public FieldType3(){
        fieldCreatorType3 = new char[][]{
                {n, n, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, n, n},
                {n, n, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, n, n},
                {n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n, n, n, p, e, e, e, p, n},
                {s, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, n},
                {n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n},
                {n, n, n, n, n, p, e, e, e, p, n, n, n, n, n, n, n, n, n, n, n, p, e, e, e, p, n, n, n, n, n, n, n, n, n, n, n, p, e, e, e, p, n, n, n, n, n},
                {n, n, n, n, n, b, n, n, n, b, n, n, n, n, n, n, n, n, n, n, n, b, n, n, n, b, n, n, n, n, n, n, n, n, n, n, n, b, n, n, n, b, n, n, n, n, n},
                {n, p, e, e, e, p, n, n, n, p, e, e, e, p, e, e, e, p, e, e, e, p, n, n, n, p, e, e, e, p, e, e, e, p, e, e, e, p, n, n, n, p, e, e, e, p, n},
                {n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, n},
                {n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n},
                {n, n, n, n, n, n, n, n, n, n, n, n, n, p, e, e, e, p, n, n, n, n, n, n, n, n, n, n, n, p, e, e, e, p, n, n, n, n, n, n, n, n, n, n, n, n, n},
                {n, n, n, n, n, n, n, n, n, n, n, n, n, b, n, n, n, b, n, n, n, n, n, n, n, n, n, n, n, b, n, n, n, b, n, n, n, n, n, n, n, n, n, n, n, n, n},
                {n, p, e, e, e, p, e, e, e, p, e, e, e, p, n, n, n, p, e, e, e, p, e, e, e, p, e, e, e, p, n, n, n, p, e, e, e, p, e, e, e, p, e, e, e, p, n},
                {n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, f},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, n},
                {n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n, n},
        };
    }
    public static void logicFieldOperator(){
        J.println("The Field is under development ;)");
        SystemInfo.lineSpacer();
        printCreator(FieldType3.fieldCreatorType3);
    }
}
