package com.eable.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        play();
    }

    static void play(){
        char[][] arr = createField();

        while (true) {
            if (!checkNextUserStep(arr))
                return;

            if (!checkNextAIMove(arr))
                return;
        }
    }

    static char[][] createField(){
        char[][] field = new char[][]{{'-', '-', '-'},{'-', '-', '-'},{'-', '-', '-'}};
        return field;
    }

    static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void playerStep(char[][] field) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        do {
            x = checkCoordinate(sc, 'X');
            y = checkCoordinate(sc, 'Y');
        } while (isCellFree(field, x, y));
        field[x][y] = 'X';
    }

    static void pcStep(char[][] field) {
        Random rndm = new Random();
        int x, y;
        do {
            x = rndm.nextInt(field.length);
            y = rndm.nextInt(field.length);
        } while (isCellFree(field, x, y));
        field[x][y] = '0';
    }

    static int checkCoordinate(Scanner sc, char sign) {
        int val;
        do {
            System.out.printf("Please input %s -coordinate in range [1-3]...\n", sign);
            val = sc.nextInt() - 1;
        } while (val < 0 || val > 2);
        return val;
    }

    static boolean isCellFree(char[][] field, int x, int y){
        return field[x][y] != '-';
    }

    static boolean checkNextUserStep (char[][] field) {
        playerStep(field);
        printField(field);
        return isNextStepAvailable(field, 'X', "WIN");
    }
    static boolean checkNextAIMove(char[][] field) {
        pcStep(field);
        printField(field);
        return isNextStepAvailable(field, 'O', "Sorry, AI is winner!");
    }

    static boolean isWin(char[][] field, char sign) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == sign && field[i][1] == sign && field[i][2] == sign) {
                return true;
            }
        }

        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == sign && field[1][i] == sign && field[2][i] == sign) {
                return true;
            }
        }

        if (field[0][0] == sign && field[1][1] == sign && field[2][2] == sign) {
            return true;
        }
        if (field[0][2] == sign && field[1][1] == sign && field[2][0] == sign) {
            return true;
        }

        return false;
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isNextStepAvailable(char[][] fild, char cr, String str) {
        if (isDraw(fild)) {
            System.out.println("There is draw detected. Finish!");
            return false;
        }
        if (isWin(fild, cr)) {
            System.out.println(str);
            return false;
        }
        return true;
    }
}




