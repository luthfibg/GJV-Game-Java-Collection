package com.fields;

import java.util.*;
import com.firstgame.Act;
import com.firstgame.SystemInfo;
import com.globalset.J;
import com.obstacles.BlackSpot;

/*************** Define Type Field Subclass ***************/

public class FieldType1 extends Fields {

    public static Scanner input = new Scanner(System.in);
     public FieldType1() {
        fieldCreatorType1 = new char[][]{
                {n, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p},
                {s, b, n, n, n, c, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, c, n, n, n, y},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, w, m, p},
                {f, b, n, n, n, d, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, d, n, n, n, y},
                {n, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p}
        };
    }
    public static void logicFieldOperator() {
        for (int u = 1; u <= 3; u += 2) {
            if (u == 3) {
                for (int w = 39; w >= 3; w -= 4) {
                    Act.square += 1;
                    if (Act.catSouls <= 1) {
                        Act.crc = 'X';
                    }
                    if (w <= 35) {
                        fieldCreatorType1[u][w + 4] = deleteContent;
                    } else if (w == 39){
                        fieldCreatorType1[1][39] = deleteContent;
                    }
                    fieldCreatorType1[u][w] = Act.crc;
                    SystemInfo.lineSpacer();
                    J.print("Enter secret code(1 or 2): ");
                    Act.playerGuess = input.nextInt();
                    Act.sessionHandler(Act.getPlayerNum(Act.playerGuess), Act.playersCat);

                    new BlackSpot();
                    Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);
                    BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                    BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);

                    Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                    Fields.printCreator(FieldType1.fieldCreatorType1);
                    SystemInfo.lineSpacer2();

                    SystemInfo.showWinData(FieldType1.fieldCreatorType1, Act.catSouls, Act.score, Act.highestScore);
                    SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);
                }
            }
            for (int v = 3; v <= 39; v += 4) {
                Act.square += 1;
                if (Act.catSouls <= 1) {
                    Act.crc = 'X';
                }
                if (v >= 4) {
                    fieldCreatorType1[u][v - 4] = deleteContent;
                }
                fieldCreatorType1[u][v] = Act.crc;
                SystemInfo.lineSpacer();
                J.print("Enter secret code(1 or 2): ");
                Act.playerGuess = input.nextInt();
                Act.sessionHandler(Act.getPlayerNum(Act.playerGuess), Act.playersCat);

                new BlackSpot();
                Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);

                BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);
                Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                Fields.printCreator(FieldType1.fieldCreatorType1);
                SystemInfo.lineSpacer2();

                SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);

            }
        }
    }
}
