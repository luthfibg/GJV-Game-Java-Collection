package com.firstgame;

import com.cats.*;
import com.fields.*;
import com.obstacles.*;
import com.globalset.*;
import java.sql.*;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.*;
import java.lang.*;
import java.util.jar.JarEntry;

//import java.io.*;

public class Act {
    public static String player;
    public static int playerID;
    public static int getCommand;
    public static ArrayList<Integer> numberCollector = new ArrayList<>();
    public static int playerGuess;
    public static String playersCat;
    public static String obstacle1 = "blackSpot";
    public static String obstacle2 = "jumper";
    public static String obstacle3 = "staticEnemy";
    public static int catSouls = 9;
    public static int score = 0;
    public static int square = 0;
    public static int highestScore = 60;
    public static int getCat;
    public static int playerField;
    public static String exitOrNo;
    public static char crc = 'M';
    public static int numberLogin;
    public static Connection connector;
    public static PreparedStatement pst;


    public static void main(String[] args) {

        int menuAmount;
        SystemInfo.loadGameOpened();
//        delay(5000);
        Scanner input = new Scanner(System.in);
        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();

//        loginPlayer();
        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();

        SystemInfo.mainMenu();
        SystemInfo.lineSpacer();
        J.print("Input Command: ");
        menuAmount = input.nextInt();
        menuDirect(menuAmount);


        if (playerField == 1 || playerField == 2 || playerField == 3 || playerField == 4 || playerField == 5){
            SystemInfo.lineSpacer3();
            SystemInfo.lineSpacer3();
            SystemInfo.printCatList();
            J.print("Choose your cat code: ");
            getCat = input.nextInt();
        }

        switch (getCat) {
            case 1:
                new Amy();
                playersCat = Amy.getCatName();
                Amy.setInit();
                crc = Amy.init;
                break;
            case 2:
                new Alexa();
                playersCat = Alexa.getCatName();
                Alexa.setInit();
                crc = Alexa.init;
                break;
            case 3:
                new Bella();
                playersCat = Bella.getCatName();
                Bella.setInit();
                crc = Bella.init;
                break;
            case 4:
                new Dora();
                playersCat = Dora.getCatName();
                Dora.setInit();
                crc = Dora.init;
                break;
            case 5:
                new Elaine();
                playersCat = Elaine.getCatName();
                Elaine.setInit();
                crc = Elaine.init;
                break;
            case 6:
                new Fluffy();
                playersCat = Fluffy.getCatName();
                Fluffy.setInit();
                crc = Fluffy.init;
                catSouls = Fluffy.getHp();
                break;
            case 7:
                new Haiku();
                playersCat = Haiku.getCatName();
                Haiku.setInit();
                crc = Haiku.init;
                catSouls = Haiku.getHp();
                break;
            case 8:
                new Kiko();
                playersCat = Kiko.getCatName();
                Kiko.setInit();
                crc = Kiko.init;
                catSouls = Kiko.getHp();
                break;
            case 9:
                new Luga();
                playersCat = Luga.getCatName();
                Luga.setInit();
                crc = Luga.init;
                catSouls = Luga.getHp();
                break;
            case 10:
                new Mickey();
                playersCat = Mickey.getCatName();
                Mickey.setInit();
                crc = Mickey.init;
                catSouls = Mickey.getHp();
                break;
            case 11:
                new Peter();
                playersCat = Peter.getCatName();
                Peter.setInit();
                crc = Peter.init;
                catSouls = Peter.getHp();
                break;
            case 12:
                new Rax();
                playersCat = Rax.getCatName();
                Rax.setInit();
                crc = Rax.init;
                catSouls = Rax.getHp();
                break;
            case 13:
                new Sam();
                playersCat = Sam.getCatName();
                Sam.setInit();
                crc = Sam.init;
                catSouls = Sam.getHp();
                break;
            case 14:
                new Vikka();
                playersCat = Vikka.getCatName();
                Vikka.setInit();
                crc = Vikka.init;
                catSouls = Vikka.getHp();
                break;
            default:
                J.print("Choose your cat code: ");
                getCat = input.nextInt();
                break;
        }


    // Loading game to start
        doOpenLoad();
    // Loading finish


        do {

            SystemInfo.lineSpacer();
            if (playerField == 1){
                new BlackSpot();
                sessionHandler(BlackSpot.getDeadlyCode(), obstacle1);

                new FieldType1();
                FieldType1.logicFieldOperator();
            } else if (playerField == 2){
                new BlackSpot();
                sessionHandler(BlackSpot.getDeadlyCode(), obstacle1);

                new FieldType2();
                FieldType2.logicFieldOperator();
            } else if (playerField == 3){
                new BlackSpot();
                sessionHandler(BlackSpot.getDeadlyCode(), obstacle1);

                new FieldType3();
                FieldType3.logicFieldOperator();
                break;
            } else if (playerField == 4){
                //some code
            } else if (playerField == 5){
                //some code
            } else {
                J.println("Denied Commands! Getting Out...");
                System.exit(2);
            }

        } while (crc != 'X');
    }

    public static String printCatData(String cat, int souls) {
        return cat + " Health: " + souls;
    }

    public static void printData(int voidPlayerGuess, int voidBombNumber, String catCond) {
        J.println(catCond);
        J.println("Number guessed: " + voidPlayerGuess);
        J.println("Black spot: " + voidBombNumber);
    }
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connector = DriverManager.getConnection("jdbc:mysql://localhost/db_blackcat", "root", "");
            System.out.println("Success");
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static void loginPlayer(){
        Scanner input = new Scanner(System.in);
        String playerLogged;
        SystemInfo.pressedKeyLoginInfo();
        SystemInfo.lineSpacer();
        J.print("Login as(Name or ID): ");
        playerID = input.nextInt();
        J.print("Input Command: ");
        getCommand = input.nextInt();
        if (getCommand == 1){
            try {
                numberLogin += 1;
                //input temporary container and check DataBase validation
                //continue...
                for(int i=0; i<BlackSpot.collectNum.toArray().length; i++){

                }
            } catch (InputMismatchException ex){
                //check whether data type is String
                //check String DB name player validation
                //continue...
                playerLogged = String.valueOf(playerID);
            } catch (NoSuchFieldError ex){
                //sign up requirements popups
                //sign up handler
            } catch (NullPointerException ex){
                SystemInfo.lineSpacer();
                J.println("+-------------------------------+");
                J.println("|                               |");
                J.println("|      Input can't be empty     |");
                J.println("|                               |");
                J.println("+-------------------------------+");
                SystemInfo.lineSpacer3();
                SystemInfo.lineSpacer3();
                loginPlayer();
            }
        }
    }

    public static void doOpenLoad(){

        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();
        SystemInfo.requestServerLoad();
        delay(2000);

        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();
        SystemInfo.connectResourceLoad();
        delay(5000);

        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();
        SystemInfo.prepareLogicLoad();
        delay(1000);

        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();
        SystemInfo.mainLoad();
        delay(9000);

        SystemInfo.lineSpacer3();
        SystemInfo.lineSpacer3();
        SystemInfo.readyGame();
        delay(500);

    }
    public static int getPlayerNum(int guessed) {
        Scanner inputs = new Scanner(System.in);
        if (guessed > 2 || guessed < 1) {
            SystemInfo.overInputHandler1();
            SystemInfo.lineSpacer();
            J.print("Enter secret code(1 - 2): ");
            guessed = inputs.nextInt();
        }
        return guessed;
    }

    public static int getPlayerNum2(int guessed) {
        Scanner inputs = new Scanner(System.in);
        if (guessed > 5 || guessed < 1) {
            SystemInfo.overInputHandler2();
            SystemInfo.lineSpacer();
            J.print("Enter secret code(1 - 5): ");
            guessed = inputs.nextInt();
        }
        return guessed;
    }

    public static void sessionHandler(int target2, String target3) {
        if (target3.equals(playersCat)) {
            numberCollector.add(target2);
        } else if (target3.equalsIgnoreCase(obstacle1)) {
            BlackSpot.collectNum.add(target2);
        } else if (target3.equalsIgnoreCase(obstacle2)) {
            JumperSquare.collectNumJ.add(target2);
        }
    }
    public static void delay(int millis){
        try{
            Thread.sleep(millis);
        } catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
    public static void menuDirect(int m){
        Scanner input = new Scanner(System.in);
        switch (m) {
            case 1:
                SystemInfo.lineSpacer3();
                SystemInfo.lineSpacer3();
                SystemInfo.printCatList();
                J.print("Choose your cat code: ");
                getCat = input.nextInt();
                break;
            case 2:
                SystemInfo.lineSpacer3();
                SystemInfo.lineSpacer3();
                SystemInfo.storyMenu();
                SystemInfo.lineSpacer();
                J.print("Choose Field: ");
                playerField = input.nextInt();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                SystemInfo.lineSpacer3();
                SystemInfo.lineSpacer3();
                SystemInfo.exitWarn();
                J.println("Input Commands");
                exitOrNo = input.next();
                if(exitOrNo.equalsIgnoreCase("yes")){
                    System.exit(2);
                } else {
                    SystemInfo.lineSpacer3();
                    SystemInfo.lineSpacer3();
                    SystemInfo.mainMenu();
                    SystemInfo.lineSpacer();
                    J.print("Input Command: ");
                    m = input.nextInt();
                    menuDirect(m);
                }
                break;
            default:
                J.println("+--------------------------------------------------+");
                J.println("|                                                  |");
                J.println("|  The system can't find implication of command    |");
                J.println("|                                                  |");
                J.println("+--------------------------------------------------+");
        }
    }
}
