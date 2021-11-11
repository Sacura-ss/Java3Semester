package Practice7;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Game {
    private Stack<Integer> firstGamer = new Stack<Integer>();
    private Stack<Integer> secondGamer = new Stack<Integer>();
    private int c1 = 5;//кол-во карт первого игрока
    private int c2 = 5;//кол-во карт второго игрока
    private int counter = 0;
    public Game() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 card for first gamer ");
        for (int j = 0; j < 5; j++) {
            firstGamer.push(in.nextInt());
        }
        System.out.print("Enter 5 card for second gamer ");
        for (int j = 0; j < 5; j++) {
            secondGamer.push(in.nextInt());
        }
    }
    public void startGame(){
        while(c1!= 0 && c2!=0) {
            int fCard, sCard;
            fCard = firstGamer.pop();
            sCard = secondGamer.pop();
            if((fCard == 0 && sCard == 9) || fCard == 9 && sCard ==0){
                int temp = fCard;
                fCard = sCard;
                sCard = temp;
            }
            if(fCard == sCard) {
                firstGamer.push(fCard);
                secondGamer.push(sCard);
            }
            if(fCard>sCard){
                firstGamer.push(fCard);
                firstGamer.push(sCard);
                c1++;
                c2--;
                counter++;
            }
            else {
                secondGamer.push(fCard);
                secondGamer.push(sCard);
                c2++;
                c1--;
                counter++;
            }
        }
        if (c1>c2)
            System.out.println("First gamer win");
        else
            System.out.println("Second gamer win");
        System.out.println(counter);
    }

}
