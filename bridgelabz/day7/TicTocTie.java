package com.bridgelabz.day7;

public class TicTocTie {
public static void main(String[] args) {
	System.out.println("Welcome To Tic TocTie Practice Problem");
       createEmptyBoard();
    }
    public static void createEmptyBoard(){
        char[] sizeOfBoard = new char[10];
         for (int i = 1; i <10; i++){
            System.out.print("|___");
            if (i % 3 == 0) {
                System.out.println("|");
            }

        }
       
    }
}
