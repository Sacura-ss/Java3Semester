package Practice7;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

//Исправила код: добавила переворот стеков при создании и при выигрыше.

public class Game {
    private Stack<Integer> firstGamer = new Stack<Integer>();
    private Stack<Integer> secondGamer = new Stack<Integer>();
    Stack<Integer> helper = new Stack<Integer>(); //вспомогательный стек для поворота
    private int c1 = 5;//кол-во карт первого игрока
    private int c2 = 5;//кол-во карт второго игрока
    private int counter = 0;
    public Game() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 card for first gamer ");
        for (int j = 0; j < 5; j++) {
            helper.push(in.nextInt());
        }
        //записываем карты первого игрока в обратном порядке
        while(!helper.empty()) {
            firstGamer.push(helper.pop());
        }
        System.out.print("Enter 5 card for second gamer ");
        for (int j = 0; j < 5; j++) {
            helper.push(in.nextInt());
        }
        //записываем карты второго игрока в обратном порядке
        while(!helper.empty()) {
            secondGamer.push(helper.pop());
        }

    }
    public void startGame(){
        while(c1!= 0 && c2!=0) {
            int fCard, sCard;
            fCard = firstGamer.pop();
            sCard = secondGamer.pop();
            if( fCard == 0 && sCard == 9){
                //делаем махинации со стеком чтобы полученные карты отправить "вниз"
                while(!firstGamer.empty()) {
                    helper.push(firstGamer.pop());
                }
                firstGamer.push(sCard);
                firstGamer.push(fCard);
                while(!helper.empty()) {
                    firstGamer.push(helper.pop());
                }
                c1++;
                c2--;
                counter++;
            }
            else if(fCard == 9 && sCard ==0) {
                    while(!secondGamer.empty()) {
                        helper.push(secondGamer.pop());
                    }
                    secondGamer.push(sCard);
                    secondGamer.push(fCard);
                    while(!helper.empty()) {
                        secondGamer.push(helper.pop());
                    }
                    c2++;
                    c1--;
                    counter++;
                }
            else if(fCard == sCard) {
                    firstGamer.push(fCard);
                    secondGamer.push(sCard);
                    counter++;
                }
            else if(fCard>sCard){
                    while(!firstGamer.empty()) {
                        helper.push(firstGamer.pop());
                    }
                    firstGamer.push(sCard);
                    firstGamer.push(fCard);
                    while(!helper.empty()) {
                        firstGamer.push(helper.pop());
                    }
                    c1++;
                    c2--;
                    counter++;
                }
                else {
                    while(!secondGamer.empty()) {
                        helper.push(secondGamer.pop());
                    }
                    secondGamer.push(sCard);
                    secondGamer.push(fCard);
                    while(!helper.empty()) {
                        secondGamer.push(helper.pop());
                    }
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
