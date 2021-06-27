package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {

    public void menu() {
        System.out.println();
        System.out.println("........ >> PAPER, STONE, SCISSORS GAME << ........");
        System.out.println();
        System.out.println("- stone --> button '1'");
        System.out.println("- paper --> button '2'");
        System.out.println("- scissors --> button '3'");
        System.out.println("- new game --> button 'n'");
        System.out.println("- exit game --> button 'x' ");
        System.out.println();
    }

    public Thing switchGame(char b) {

        while(b!=49 && b!=50 && b!=51) {
            System.out.println("Wrong button !");
            b = scanerChar();
        }
        switch(b) {
            case 49:
            case 50:
            case 51:{
                return choosen1(b);
            }
            default: {
                return null;
            }
        }
    }

    public boolean overX(char over) {
        boolean m = false;
        if (over == 120) {
            System.out.println("Are you sure you want to exit game ? " + " y/n");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Press y or n");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println("Do you want to play again ? " + " y/n");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Press y or n");
                } while (over != 116 && over != 110);
                if (over == 110) m = true;
                else m = false;
            } else m = true;
        }
        if (over == 110) {
            System.out.println("Do you want to start a new game? " + " y/n");
            do {
                over = scanerChar();
                if (over != 116 && over != 110) System.out.println("Press y or n");
            } while (over != 116 && over != 110);
            if (over == 110) {
                System.out.println("Are you sure you want to exit game ? " + " y/n");
                do {
                    over = scanerChar();
                    if (over != 116 && over != 110) System.out.println("Press y or n");
                } while (over != 116 && over != 110);
                if (over == 110) m = false;
                else m = true;
            } else m = false;
        }
        return m;
    }

    public int scanerInt() {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        return x;
    }

    public char scanerChar() {
        Scanner scaner = new Scanner(System.in);
        char a = scaner.next().charAt(0);
        return a;
    }

    public Thing choosen(int liczba) {
        Thing object;
        if(liczba == 1) {
            object = new Stone();
        } else if(liczba == 2) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public Thing choosen1(char liczba) {
        Thing object;
        if(liczba == 49) {
            object = new Stone();
        } else if(liczba == 50) {
            object = new Paper();
        } else {
            object = new Scissors();
        }
        return object;
    }

    public int resultInt(char gamer1, int gamer2) {
        int gamer3 = gamer1-'0';
        if (gamer3 == gamer2) {
            System.out.println("Draw");
            return 0;
        } else if ((gamer3 == 3 && gamer2 == 2) || (gamer3 == 2 && gamer2 == 1)
                || gamer3 == 1 && gamer2 == 3) {
            System.out.println("You win !");
            return 1;
        } else {
            System.out.println("You lose !");
            return 2;}
    }

    public void result(int sco1, int sco2) {
        if(sco1 > sco2) {
            System.out.println("You win: " + sco1 + " to " + sco2);
        } else if (sco1 < sco2) {
            System.out.println("You lose: " + sco1 + " to " + sco2);
        } else {
            System.out.println("Draw: " + sco1 + " to " + sco2);
        }
        System.out.println();
    }
}
