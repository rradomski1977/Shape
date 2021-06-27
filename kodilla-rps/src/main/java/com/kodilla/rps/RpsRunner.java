package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        int round = 0;
        int score1 = 0;
        int score2 = 0;
        GameProcessor game = new GameProcessor();
        game.menu();
        System.out.print("Give your name: ");
        Scanner name = new Scanner(System.in);
        String nick = name.nextLine();
        Gamer gamer1 = new Gamer(nick);
        Gamer gamer2 = new Gamer("Computer");

        while(!end) {
            System.out.print("How many rounds do you want to play?: ");
            int howManyRounds = game.scanerInt();
            System.out.println();

            for(int i=0; i<howManyRounds;) {
                round++; i++;
                System.out.println("Round " + round);
                System.out.println("Plays: " + gamer1.getGamer());
                char number = game.scanerChar();
                Thing result = game.switchGame(number);
                System.out.println(result);

                System.out.println("Plays: " + gamer2.getGamer());
                Computer computer = new Computer(gamer2);
                int number2 = computer.random();
                System.out.println(game.choosen(number2).getThingName());

                int z = game.resultInt(number, number2);
                if(z>0) {
                    if(z==1) {
                        score1++;
                    } else score2++;
                }

                if (round<howManyRounds) {System.out.println("The result of the game: " + score1 + " to " + score2);}
                System.out.println();

            }
            game.result(score1, score2);
            round = 0; score1=0; score2 = 0;
            System.out.println();
            System.out.println("::::: New game - click 'z'");
            System.out.println("::::: End of the game - click 'x' ");
            System.out.println();
            char over;
            do {
                over = game.scanerChar();

            } while(over!=120 && over!=110);
            end = game.overX(over);
        }
    }
}
