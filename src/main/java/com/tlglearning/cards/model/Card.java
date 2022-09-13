package com.tlglearning.cards.model;

public class Card {

  private final Rank rank; // field declaration: modifiers, field , type
  private final Suit suit;

// Constructor
  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // Accessor (Methods)
  public Rank rank() {
    return rank;
  }

  public Suit suit() {
    return suit;
  }

  @Override
  public String toString() {
    return rank.symbol() + suit.symbol();
  }

  // TODO: 9/13/2022 Override equals method. 
  // TODO: 9/13/2022 Override hashCode method. 
}
