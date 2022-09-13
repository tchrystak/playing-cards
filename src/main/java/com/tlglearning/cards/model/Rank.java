package com.tlglearning.cards.model;

public enum Rank {

  // double quotes because it's a string not a char
  ACE("A"),
  TWO("2"),
  THREE("3"),
  FOUR("4"),
  FIVE("5"),
  SIX("6"),
  SEVEN("7"),
  EIGHT("8"),
  NINE("9"),
  TEN("10"),
  JACK("J"),
  QUEEN("Q"),
  KING("K");

  private final String symbol;

  // enum constructor
  Rank(String symbol) {
    this.symbol = symbol;
  }

  // Accessor for Symbol
  public String symbol() {
    return symbol;
  }

  // toString
  @Override
  public String toString() {
    String name = name(); // One of the methods we inherit from enum
    return name.charAt(0) + name.substring(1).toLowerCase(); /* returns everything from position 1
     to the end of the string */

  }

}
