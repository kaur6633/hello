/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class Hand {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int cardNum;
        String cardSuite;
        System.out.println("Enter your card number(1 to 13):");
        cardNum = input.nextInt();
        System.out.println("Enter your card suite(diamonds, clubs, spades, hearts):");
        cardSuite = input.next();
        Card handy[] = new Card[7];
    for(int i=0; i<=6; i++) {
        int rand = ((int)(Math.random() * 13)) + 1;
      //Card.setValue(rand);
      String color = Card.SUITS[(int)(Math.random() * 4)];
      System.out.println(color + " " +rand);
      handy[i] = new Card(rand, color); 
}
          for(int j=0; j<=6; j++){
          if(handy[j].getSuits()==(cardSuite) && 
                  handy[j].getValue()==(cardNum)) {
              System.out.println("Congrats, you win!!!");
              break;
          }
          else
          {System.out.println("Sorry, you lose!!!");
          break;}
              
          }}
}
