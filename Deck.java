package blackjack;
import java.util.Random;
public class Deck {
	// define fields here
		Card[] cards;
		
		// This constructor builds a deck of 52 cards.
		public Deck()
		{
			int ind=0;
			cards = new Card[52];
			for (int i = 0; i<4; i++){
				for (int j = 1; j<=13; j++){
					cards[ind] = new Card (i,j);
					ind++;
				}
			}
		}

		
		// This method takes the top card off the deck and returns it.
		public Card deal()
		{
			int index = -1;
			for (int i=0; i<cards.length; i++){
				if (!cards[i].getDealt()){
					cards[i].setDealt(true);
					index = i;
					return (cards[index]);
				}
			}
			return(cards[index]);
		}
		
		
		// this method returns true if there are no more cards to deal, false otherwise
		public boolean isEmpty()
		{
			for (int i=0; i<cards.length; i++){
				if (cards[i].getDealt() != true){
					return(false);
				}
			}
			return (true);
		}
		
		//this method puts the deck int some random order
		public void shuffle(){
			Random gen = new Random ();
			Card temp = new Card();
			int index;
			for (int i = 0; i<cards.length; i++){
				index = gen.nextInt(cards.length);
				temp.copyFrom(cards[index]);
				cards[index].copyFrom(cards[i]);
				cards[i].copyFrom(temp);
			}
		}
		
		public String toString(){
			String total = "";
			for (int i = 0; i<cards.length; i++){
				if (cards[i] == null){
					total = total + "null \n";
				}
				else if (!cards[i].getDealt()){
					total = total + cards[i] + " \n";
				}
			}
			return(total);
			
		}
}
