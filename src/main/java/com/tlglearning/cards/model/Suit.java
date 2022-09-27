package com.tlglearning.cards.model;

public enum Suit {

  // unicode symbols
  CLUBS('\u2663', Color.BLACK), // Becomes public static final Suit CLUBS = new Suit('u\', Color.BLACK);
  DIAMONDS('\u2662', Color.RED),
  HEARTS('\u2661',Color.RED),
  SPADES('\u2660', Color.BLACK);

  private final char symbol;
  private final Color color;

  // Enum constructor (it's always private)
  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  // Getter Symbol Method...Accessor
  public char symbol() {
    return symbol;
  }

  public Color color() {
    return color;
  }

  //toString Method
  @Override
  public String toString() {
    String name = name(); // One of the methods we inherit from enum
    return name.charAt(0) + name.substring(1).toLowerCase(); // returns everything from position 1
    // to the end of the string

  }

  public enum Color {
    BLACK, RED
  }
}


