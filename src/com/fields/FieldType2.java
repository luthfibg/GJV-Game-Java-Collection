package com.fields;

import com.firstgame.Act;
import com.firstgame.SystemInfo;
import com.globalset.J;
import com.obstacles.BlackSpot;
import com.obstacles.JumperSquare;

public class FieldType2 extends Fields {
    public FieldType2() {
        fieldCreatorType2 = new char[][]{
                {n, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p},
                {s, b, n, n, n, c, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, c, n, n, n, y},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, w, m, p},
                {n, b, n, n, n, d, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, d, n, n, n, y},
                {n, p, m, w, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p},
                {n, b, n, n, n, c, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, c, n, n, n, y},
                {n, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, m, m, p, m, w, m, p},
                {f, b, n, n, n, d, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, b, n, n, n, d, n, n, n, y},
                {n, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p, e, e, e, p},
        };
    }

    public static void logicFieldOperator() {
        for (int m = 1; m <= 7; m += 2) {
            if(m==1) {
                for (int n = 3; n <= 39; n += 4) {
                    Act.square += 1;
                    SystemInfo.lineSpacer();
                    J.print("Enter secret code(1 - 5): ");
                    Act.playerGuess = input.nextInt();
                    Act.sessionHandler(Act.getPlayerNum2(Act.playerGuess), Act.playersCat);

                    new BlackSpot();
                    Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);
                    BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                    BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);

                    JumperSquare.jumpHandler(39, m, n, Act.square);

                    Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                    Fields.printCreator(FieldType2.fieldCreatorType2);
                    SystemInfo.lineSpacer2();

                    SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);
                }
            } else if (m == 3) {
                for (int o = 39; o >= 3; o -= 4) {
                    Act.square += 1;
                    SystemInfo.lineSpacer();
                    J.print("Enter secret code(1 - 5): ");
                    Act.playerGuess = input.nextInt();
                    Act.sessionHandler(Act.getPlayerNum2(Act.playerGuess), Act.playersCat);

                    new BlackSpot();
                    Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);
                    BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                    BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);

                    JumperSquare.jumpHandler(39, m, o, Act.square);

                    Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                    Fields.printCreator(FieldType1.fieldCreatorType2);
                    SystemInfo.lineSpacer2();

                    SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);
                }
            } else if (m == 5) {
                for (int p = 3; p <= 39; p += 4) {
                    Act.square += 1;
//                    if (Act.catSouls <= 1) {
//                        Act.crc = 'X';
//                    }
//                    if (p >= 4) {
//                        fieldCreatorType2[m][p - 4] = deleteContent;
//                    } else if(p == 3){
//                        fieldCreatorType2[3][3] = deleteContent;
//                    }
//
//                    fieldCreatorType2[m][p] = Act.crc;
                    SystemInfo.lineSpacer();
                    J.print("Enter secret code(1 - 5): ");
                    Act.playerGuess = input.nextInt();
                    Act.sessionHandler(Act.getPlayerNum2(Act.playerGuess), Act.playersCat);

                    new BlackSpot();
                    Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);
                    BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                    BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);

                    JumperSquare.jumpHandler(39, m, p, Act.square);

                    Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                    Fields.printCreator(FieldType1.fieldCreatorType2);
                    SystemInfo.lineSpacer2();

                    SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);
                }
            } else if(m==7){
                for (int q = 39; q >= 3; q-= 4){
                    Act.square += 1;
//                    if (Act.catSouls <= 1) {
//                        Act.crc = 'X';
//                    }
//                    if (q <= 35) {
//                        fieldCreatorType2[m][q + 4] = deleteContent;
//                    } else if (q == 39) {
//                        fieldCreatorType2[5][39] = deleteContent;
//                    }
//
//                    fieldCreatorType2[m][q] = Act.crc;
                    SystemInfo.lineSpacer();
                    J.print("Enter secret code(1 - 5): ");
                    Act.playerGuess = input.nextInt();
                    Act.sessionHandler(Act.getPlayerNum2(Act.playerGuess), Act.playersCat);

                    new BlackSpot();
                    Act.sessionHandler(BlackSpot.getDeadlyCode(), Act.obstacle1);
                    BlackSpot.soulsEffect(Act.playerGuess, BlackSpot.deadlyCode);
                    BlackSpot.scoreEffect(Act.playerGuess, BlackSpot.deadlyCode);

                    JumperSquare.jumpHandler(39, m, q, Act.square);

                    Act.printData(Act.playerGuess, BlackSpot.deadlyCode, Act.printCatData(Act.playersCat, Act.catSouls));
                    Fields.printCreator(FieldType1.fieldCreatorType2);
                    SystemInfo.lineSpacer2();

                    SystemInfo.showWinData2(FieldType2.fieldCreatorType2, Act.catSouls, Act.score, Act.highestScore);
                    SystemInfo.showLostData(Act.catSouls, Act.square, Act.score);

                }
            }
        }
    }
}
