/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author srinivsi
 */
public class Card {
private static String suits;//diamonds,clubs,spades, hearts
  private static int value; // 1 to 13
public static String[] SUITS={"diamonds","clubs","spades","hearts"};
    public int getValue() {
        return value;
    }
    public Card(int value, String suits){
        this.value = value;
        this.suits = suits;
    }
    public Card(){
        
    }
    /**
     ;
     * @param value 
     */
    
    public static void setValue(int value) {
        Card.value = value;
    }
    
    public String getSuits(){
        return this.suits;
    }
    /**
     * 
     * @param suits
     */
    public static void setSuit(String suits){
        Card.suits = suits;
}}

