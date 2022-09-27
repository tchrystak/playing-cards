package com.tlglearning.cards;

import com.tlglearning.cards.model.Card;
import com.tlglearning.cards.model.Deck;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Comparator<Card> comparator = new Comparator<>() {

      @Override
      public int compare(Card card1, Card card2) {
        int comparison = card1.suit().color().compareTo(card2.suit().color());
        if (comparison == 0) {
          comparison = card1.suit().compareTo(card2.suit());
          if (comparison == 0) {
            comparison = -card1.rank().compareTo(card2.rank());
          }
        }
        return comparison;
      }
    };

    Deck deck = new Deck();
    System.out.println(deck);
    Random rng = new SecureRandom();
    deck.shuffle(rng);
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    deck.sort(comparator);
    System.out.println(deck);
  }

}


