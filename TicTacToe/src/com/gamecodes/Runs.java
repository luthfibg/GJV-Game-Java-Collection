package com.gamecodes;

import java.util.*;
import java.lang.*;

public class Runs {
    static ArrayList<Integer> playerPost = new ArrayList<>();
    static ArrayList<Integer> computerPost = new ArrayList<>();

    public static void main(String[] args) {
        char[][] board = {
                {'+','-','-','-','+','-','-','-','+','-','-','-','+'},
                {'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                {'+','-','-','-','+','-','-','-','+','-','-','-','+'},
                {'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                {'+','-','-','-','+','-','-','-','+','-','-','-','+'},
                {'|',' ',' ',' ','|',' ',' ',' ','|',' ',' ',' ','|'},
                {'+','-','-','-','+','-','-','-','+','-','-','-','+'}
        };
        printBoard(board);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String player = input.next();
            System.out.print("Choose square (1-9): ");
            int plyPost = input.nextInt();
            while (playerPost.contains(plyPost) || computerPost.contains(plyPost)) {
                System.out.println("Square is full!");
                System.out.print("Please rechoose square: ");
                plyPost = input.nextInt();
            }
            turn(board, plyPost, player);
            printBoard(board);
            String matchResult = winCondition();
            if (matchResult.length() > 0) {
                System.out.println(matchResult);
                break;
            }
            System.out.println(" ");

            Random rdCpu = new Random();
            player = "cpu";
            System.out.println("Now, cpu's turn");
            int cpuPost = rdCpu.nextInt(9) + 1;
            while (playerPost.contains(cpuPost) || computerPost.contains(cpuPost)) {
                cpuPost = rdCpu.nextInt(9)+1;
            }
            System.out.println("Now, cpu's choose square " + cpuPost);
            turn(board, cpuPost, player);
            printBoard(board);
            matchResult = winCondition();
            if (matchResult.length() > 0) {
                System.out.println(matchResult);
                break;
            }
        }
    }
    public static void printBoard(char[][] thing) {
        for (char[] x : thing) {
            for (char y : x) {
                System.out.print(y);
            }
            System.out.println(" ");
        }
    }
    public static void turn(char[][] emtTarget1, int emtTarget2, String emtTarget3) {
        char symbol = ' ';
        if (emtTarget3.equalsIgnoreCase("player")) {
            symbol = 'X';
            playerPost.add(emtTarget2);
        } else if (emtTarget3.equalsIgnoreCase("cpu")) {
            symbol = 'O';
            computerPost.add(emtTarget2);
        }
        switch (emtTarget2) {
            case 1:
                emtTarget1[1][2] = symbol;
                break;
            case 2:
                emtTarget1[1][6] = symbol;
                break;
            case 3:
                emtTarget1[1][10] = symbol;
                break;
            case 4:
                emtTarget1[3][2] = symbol;
                break;
            case 5:
                emtTarget1[3][6] = symbol;
                break;
            case 6:
                emtTarget1[3][10] = symbol;
                break;
            case 7:
                emtTarget1[5][2] = symbol;
                break;
            case 8:
                emtTarget1[5][6] = symbol;
                break;
            case 9:
                emtTarget1[5][10] = symbol;
                break;
            default:
                break;
        }
    }
    public static String winCondition() {

        List <Object> topRow = Arrays.asList(1,2,3);
        List <Object> ctrRow = Arrays.asList(4,5,6);
        List <Object> btmRow = Arrays.asList(7,8,9);
        List <Object> leftCol = Arrays.asList(1,4,7);
        List <Object> ctrCol = Arrays.asList(2,5,8);
        List <Object> rightCol= Arrays.asList(3,6,9);
        List <Object> diagFrLeft = Arrays.asList(1,5,9);
        List <Object> diagFrRight = Arrays.asList(3,5,7);

        List <Object> winCollection = new ArrayList<>();
        winCollection.add(topRow);
        winCollection.add(ctrRow);
        winCollection.add(btmRow);
        winCollection.add(leftCol);
        winCollection.add(ctrCol);
        winCollection.add(rightCol);
        winCollection.add(diagFrLeft);
        winCollection.add(diagFrRight);


        for (Object z : winCollection) {
            if (playerPost.containsAll((Collection<Objects>) z)) {
                return "Congratulation you win!";
            } else if (computerPost.containsAll((Collection<Objects>) z)) {
                return "Sorry you lose for this chance T.T";
            } else if (playerPost.size() + computerPost.size() == 9) {
                return "Match result is 50:50!";
            }
        }
        return "";
    }
}
