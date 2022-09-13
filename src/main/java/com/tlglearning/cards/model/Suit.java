package com.tlglearning.cards.model;

import java.util.Locale;

public enum Suit {

  // unicode symbols
  CLUBS('\u2663'),
  DIAMONDS('\u2662'),
  HEARTS('\u2661'),
  SPADES('\u2660');

  private final char symbol;

  // Enum constructor (it's always private)
  Suit(char symbol) {
    this.symbol = symbol;
  }

  // Getter Symbol Method...Accessor
  public char symbol() {
    return symbol;
  }

  //toString Method
  @Override
  public String toString() {
    String name = name(); // One of the methods we inherit from enum
    return name.charAt(0) + name.substring(1).toLowerCase(); // returns everything from position 1
    // to the end of the string

  }
}


