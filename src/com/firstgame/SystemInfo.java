package com.firstgame;

import com.cats.Cat;
import com.globalset.J;

import java.util.Scanner;

public class SystemInfo {
    public static void loadGameOpened() {
        J.println("+=================== .` =====================+");
        J.println("|+===============  /y ======================+|");
        J.println("||+------------ `+y- ----------------------+||");
        J.println("|||+---------  :d+  ----------------------+|||");
        J.println("||||+```````` .N+  ``````````````````````+||||");
        J.println("|||||         `M/                        |||||");
        J.println("|||||          mmo/::--.`       ``       |||||");
        J.println("|||||         :MMMMMMMNmmdyssoshdd`      |||||");
        J.println("|||||         sMMMMNMMMMMMMMMMMmNM/      |||||");
        J.println("|||||         dMMNNNdddNMMMMMm:..-.      |||||");
        J.println("|||||        /MMsMM+```.yMNMd.           |||||");
        J.println("|||||        my. oM/    od-dm`           |||||");
        J.println("|||||        ho   -yo  -s- .No           |||||");
        J.println("|||||    `:`    `       ./.              |||||");
        J.println("|||||          ----BLACKCAT----          |||||");
        J.println("|||||          ---By Luthfi---          |||||");
        J.println("||||+````````````````````````````````````+||||");
        J.println("|||+--------------------------------------+|||");
        J.println("||+----------------------------------------+||");
        J.println("|+==========================================+|");
        J.println("+============================================+");
    }
    public static void lineSpacer() {
        System.out.println(" ");
    }
    public static void lineSpacer2() {
        J.println(" ");
        J.println(" ");
    }
    public static void lineSpacer3() {
        J.println(" ");
        J.println(" ");
        J.println(" ");
    }
    public static void pressedKeyLoginInfo(){
        J.println("+===============================================+");
        J.println("|                                               |");
        J.println("|                                               |");
        J.println("|           Press key 1 to Login or,            |");
        J.println("|            Press key 2 to Sign Up             |");
        J.println("|                                               |");
        J.println("|                                               |");
        J.println("+===============================================+");
    }
    public static void mainMenu() {
        J.println("+===============================================+");
        J.println("|                                               |");
        J.println("+===============================================+");
        J.println("|   1. New Game                                 |");
        J.println("|   2. Story Mode                               |");
        J.println("|   3. Scores                                   |");
        J.println("|   4. Catalog                                  |");
        J.println("|   5. Help                                     |");
        J.println("|   6. Settings                                 |");
        J.println("|   7. Exit                                     |");
        J.println("+===============================================+");
        J.println("|                                               |");
        J.println("+===============================================+");
    }

    public static void storyMenu(){
        J.println("+=====================================================================================+");
        J.println("|                                                                                     |");
        J.println("| +===========+ +===========+ +===========+ +===========+ +===========+ +===========+ |");
        J.println("| |           | |           | |           | |           | |           | |           | |");
        J.println("| |           | |           | |           | |           | |           | |           | |");
        J.println("| |    [1]    | |    [2]    | |    [3]    | |    [4]    | |    [5]    | |    [?]    | |");
        J.println("| |           | |           | |           | |           | |           | |           | |");
        J.println("| |           | |           | |           | |           | |           | |           | |");
        J.println("| |           | |           | |           | |           | |           | |           | |");
        J.println("| +-----------+ +-----------+ +-----------+ +-----------+ +-----------+ +-----------+ |");
        J.println("| |  Field 1  | |  Field 2  | |  Field 3  | |  Field 4  | |  Field 5  | |  Coming S | |");
        J.println("| +===========+ +===========+ +===========+ +===========+ +===========+ +===========+ |");
        J.println("|                                                                                     |");
        J.println("+=====================================================================================+");
    }
    public static String[][] catList = {

            {"+","---","+","----------------------------","+"},
            {"|"," C ","|"," Which is your cat?         ","|"},
            {"+","---","+","-----------","+","---","+","------------","+"},
            {"|"," 1 ","|"," Amy       ","|"," 8 ","|"," Kiko       ","|"},
            {"|"," 2 ","|"," Alexa     ","|"," 9 ","|"," Luga       ","|"},
            {"|"," 3 ","|"," Bella     ","|"," 10","|"," Mickey     ","|"},
            {"|"," 4 ","|"," Dora      ","|"," 11","|"," Peter      ","|"},
            {"|"," 5 ","|"," Elaine    ","|"," 12","|"," Rax        ","|"},
            {"|"," 6 ","|"," Fluffy    ","|"," 13","|"," Sam        ","|"},
            {"|"," 7 ","|"," Haiku     ","|"," 14","|"," Vikka      ","|"},
            {"|","   ","|","           ","|","   ","|","            ","|"},
            {"+","---","+","-----------","+","---","+","------------","+"},
    };
    public static void printCatList() {
        for (String[] x : catList) {
            for (String y : x) {
                J.print(y);
            }
            J.println(" ");
        }
    }
    public static void requestServerLoad(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|            [5%] Call Request...            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void connectResourceLoad(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|       [25%] Connecting Resource...         |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void prepareLogicLoad(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|          [50%] Prepare Logic...            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void mainLoad(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|             [80%] Loading...               |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void readyGame(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|               [98%] Ready!                 |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void overInputHandler1(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|    Please input number between 1 or 2      |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void overInputHandler2(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|    Please input number between 1 till 5    |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("|                                            |");
        J.println("+============================================+");
    }
    public static void winGame() {
        J.println("************** You Win The Game *************");
        J.println("============= ****************** ============");
        J.println("=============================================");
    }
    public static void lostGame(){
        J.println("***************** Game Over *****************");
        J.println("============= ****************** ============");
        J.println("=============================================");
    }
    public static void showLostData(int cS, int sq, int sc){
        if (cS < 1) {
            lostGame();
            lineSpacer3();
            J.println("Position               : Square " + sq);
            J.println("Your score             : " + cSc(sc));
            J.println("Your highest           : " + 60);
            System.exit(1);
        } else if (cS <= 1) {
            J.println("+=======================================+");
            J.println("|                                       |");
            J.println("|          Oops " + Act.playersCat + " almost die,         |");
            J.println("|         Be careful on the way!        |");
            J.println("|                                       |");
            J.println("+=======================================+");
        }
    }
    public static void showWinData(char[][] x, int cs, int sc, int hsc){
        if (x[3][3] == 'M' && cs > 0) {
            winGame();
            lineSpacer3();
            J.println("Your cat health remains: " + cs);
            J.println("Your score             : " + cSc(sc));
            if (cSc(sc) > hsc) {
                hsc = cSc(sc);
            }
            J.println("Your highest score     : " + hsc);
            System.exit(1);
        }
    }
    public static void showWinData2(char[][] x, int cs, int sc, int hsc){
        if (x[7][3] == Cat.init && cs > 0) {
            winGame();
            lineSpacer3();
            J.println("Your cat health remains: " + cs);
            J.println("Your score             : " + cSc(sc));
            if (cSc(sc) > hsc) {
                hsc = cSc(sc);
            }
            J.println("Your highest score     : " + hsc);
            System.exit(1);
        }
    }

    private static int cSc(int sc) {
        return sc*5;
    }
    public static void exitWarn(){
        J.println("+============================================+");
        J.println("|                                            |");
        J.println("|          Are you sure, exit game?          |");
        J.println("|                                            |");
        J.println("+=====================+======================+");
        J.println("|                     |                      |");
        J.println("|                     |                      |");
        J.println("|        Yes          |          No          |");
        J.println("|                     |                      |");
        J.println("|                     |                      |");
        J.println("+=====================+======================+");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        String alph;
//        J.println("Input String: ");
//        alph = in.next();
        J.println("Input Integers: ");
        num = in.nextInt();


    }
}

