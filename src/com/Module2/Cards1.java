package com.Module2;

import java.util.*;

public class Cards1 {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}
class Cards {
        int value;
        String suit;


    public void setCards(String suit, int r) {
            this.value = r;
            this.suit = suit;
        }

         public int getValue() {
              return value;
         }

         public void setValue(int value) {
           this.value = value;
          }

         public String getSuit() {
             return suit;
         }

         public void setSuit(String suit) {
           this.suit = suit;
        }



        int getSuitPriority(String suitString) {

            //Write your code here.

            switch(suitString){
                case "spades" :
                    return 4;
                case "diamond" :
                    return 3;
                case "hearts" :
                    return 2;
                case "clubs":
                    return 1;
                default :
                    return 0;

            }

        }


    }
class ClassicGame {
        int points1 = 0;
        int points2 = 0;

        public void game(Cards c1, Cards c2) {

            //Write your code here.
            int c1suit = c1.getSuitPriority(c1.suit);
            int c2suit = c2.getSuitPriority(c2.suit);
            if(c1.value == c2.value){
                if(c1suit>c2suit){
                    points1++;
                }
                else if(c2suit>c1suit){
                    points2++;
                }
            }
            else if(c1.value > c2.value){
                points1++;
            }
            else {
                points2++;
            }


            System.out.println("points of player 1 :" + " " + points1);
            System.out.println("points of player 2 :" + " " + points2);
        }

    }



