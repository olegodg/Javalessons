package ru.geekbrains.lesson4;
import java.util.Scanner;
import java.util.Random;
import java.nio.charset.Charset;
public class HomeWorkApp4 {
    private static final char element = 'X';
    private static Scanner scanner = new Scanner(System.in);
    private static char[][] field;
    public static final int SIZE = 3;
    public static final char FIELD_ELEMENT_EMPTY = '1';
    public static final char FIELD_ELEMENT_X = '2';
    public static final char FIELD_ELEMENT_0 = '3';
    private static Random random = new Random();
    private static boolean flag = true;

    public static void main(String[] args) {
        Charset currentCharset = Charset.defaultCharset();
        Charset cs = Charset.defaultCharset();
        System.out.println(cs.displayName());
        scanner = new Scanner(System.in);
        printField();
        initField();
        while (fullnessOfTheField()==false) {
            playersTurn();
            printField();
            if (fullnessOfTheField()){
                System.out.println("GAME OVER");
                break;
            }
            whoWonCheckLine(element);
            whoWonCheckColumn(element);
            whoWonCheckDiagonal(element);
            if (flag==false){
                System.out.println("YOU WIN");
                break;
            }
            comTurn();
            printField();
            if (fullnessOfTheField()){
                System.out.println("GAME OVER");
                break;
            }
        }
    }

    public static void initField() {
        field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = FIELD_ELEMENT_EMPTY;
            }
        }
    }

    public static boolean cellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE || field[x][y] != FIELD_ELEMENT_EMPTY) {
            return false;
        }
        return true;
    }

    public static void playersTurn() {
        int x, y;
        do {
            System.out.println("?????? ?????????? ??????");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (cellEmpty(x, y) != true);
        field[x][y] = FIELD_ELEMENT_X;
    }

    public static void comTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (cellEmpty(x, y) != true);
        field[x][y] = FIELD_ELEMENT_0;
    }

    public static boolean fullnessOfTheField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == FIELD_ELEMENT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean whoWonCheckLine(char newElement) {
        if (flag){
            for (int i = 0; i < SIZE; i++) {
                int count = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (field[i][j] == element) {
                        count += 1;
                    }
                }
                if (count == SIZE) {
                    flag=false;
                    break;
                }
                break;
            }
        }
        return flag;
    }
    public static boolean whoWonCheckColumn(char newElement){
        if (flag){
        for (int j=0; j<SIZE;j++){
            int count=0;
            for (int i=0;i<SIZE;i++){
                if (field[i][j]==element){
                    count+=1;
                }
            }
            if (count==SIZE){
                flag=false;
                break;
            }
            break;
        }
        }
        return flag;
    }
    public static boolean whoWonCheckDiagonal(char newElement) {
        if (flag){
        int count = 0;
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < SIZE; i++) {
                if (i==j && field[i][j] == element) {
                    count += 1;
                }
            }
            if (count == SIZE) {
                flag=false;
                break;
            }
            break;
        }
        }
        return flag;
    }
}

