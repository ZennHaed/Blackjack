

public class Card {
	// Card suits (provided for your convenience - use is optional)
		public static final int SPADES   = 0;
		public static final int HEARTS   = 1;
		public static final int CLUBS    = 2;
		public static final int DIAMONDS = 3;

		// Card faces (provided for your convenience - use is optional)
		public static final int ACE      = 1;
		public static final int TWO      = 2;
		public static final int THREE    = 3;
		public static final int FOUR     = 4;
		public static final int FIVE     = 5;
		public static final int SIX      = 6;
		public static final int SEVEN    = 7;
		public static final int EIGHT    = 8;
		public static final int NINE     = 9;
		public static final int TEN      = 10;
		public static final int JACK     = 11;
		public static final int QUEEN    = 12;
		public static final int KING     = 13;


		// define fields here
		private int suit;
		private int face;
		private boolean down;
		private boolean dealt;
		
		// This constructor builds a card with the given suit and face, turned face down.
		public Card(int cardSuit, int cardFace)
		{
			if (cardSuit >= 0 && cardSuit <= 3){
				this.suit = cardSuit;
			}
			if (cardFace >= 1 && cardFace <= 13){
				this.face = cardFace;
			}
			down = true;
			dealt = false;
		}
		
		public Card(){
			this.suit = -1;
			this.face = -1;
			down = true;
			dealt = false;
		}

		// This method retrieves the suit (spades, hearts, etc.) of this card.
		public int getSuit()
		{
			if (this.suit == 0){
				return(SPADES);
			}
			if (this.suit == 1){
				return (HEARTS);
			}
			if (this.suit == 2){
				return (CLUBS);
			}
			if (this.suit == 3){
				return (DIAMONDS);
			}
			return(-1);
		}
		
		// This method retrieves the face (ace through king) of this card.
		public int getFace()
		{
			return (this.face);
		}
		
		// This method retrieves the numerical value of this card
		// (usually same as card face, except 1 for ace and 10 for jack/queen/king)
		public int getValue()
		{
			if (this.face >= 1 && this.face < 11){
				return(this.face);
			}
			if (this.face == 11 || this.face == 12 || this.face == 13){
				return(10);
			}
			return(0);
		}
		
		public boolean getDealt(){
			return(dealt);
		}
		
		public void setDealt(boolean deal){
			dealt = deal;
		}
		
		public void flip(){
			this.down = !this.down;
		}
		
		public void copyFrom(Card c){
			this.suit = c.suit;
			this.face = c.face;
			this.down = c.down;
			this.dealt = c.dealt;
		}
		
		public String toString(){
			switch(suit){
				case(0):{
					if (this.face == 1){
						return("Ace Spades");
					}
					if (face == 2){
						return("2 Spades");
					}
					if (face == 3){
						return("3 Spades");
					}
					if (face == 4){
						return("4 Spades");
					}
					if (face == 5){
						return("5 Spades");
					}
					if (face == 6){
						return("6 Spades");
					}
					if (face == 7){
						return("7 Spades");
					}
					if (face == 8){
						return("8 Spades");
					}
					if (face == 9){
						return("9 Spades");
					}
					if (face == 10){
						return("10 Spades");
					}
					if (face == 11){
						return("Jack Spades");
					}
					if (face == 12){
						return("Queen Spades");
					}
					if (face == 13){
						return("King Spades");
					}
					break;
				}
				case(1):{
					if (face == 1){
						return("Ace Hearts");
					}
					if (face == 2){
						return("2 Hearts");
					}
					if (face == 3){
						return("3 Hearts");
					}
					if (face == 4){
						return("4 Hearts");
					}
					if (face == 5){
						return("5 Hearts");
					}
					if (face == 6){
						return("6 Hearts");
					}
					if (face == 7){
						return("7 Hearts");
					}
					if (face == 8){
						return("8 Hearts");
					}
					if (face == 9){
						return("9 Hearts");
					}
					if (face == 10){
						return("10 Hearts");
					}
					if (face == 11){
						return("Jack Hearts");
					}
					if (face == 12){
						return("Queen Hearts");
					}
					if (face == 13){
						return("King Hearts");
					}
					break;
				}
				case(2):{
					if (face == 1){
						return("Ace Clubs");
					}
					if (face == 2){
						return("2 Clubs");
					}
					if (face == 3){
						return("3 Clubs");
					}
					if (face == 4){
						return("4 Clubs");
					}
					if (face == 5){
						return("5 Clubs");
					}
					if (face == 6){
						return("6 Clubs");
					}
					if (face == 7){
						return("7 Clubs");
					}
					if (face == 8){
						return("8 Clubs");
					}
					if (face == 9){
						return("9 Clubs");
					}
					if (face == 10){
						return("10 Clubs");
					}
					if (face == 11){
						return("Jack Clubs");
					}
					if (face == 12){
						return("Queen Clubs");
					}
					if (face == 13){
						return("King Clubs");
					}
					break;
				}
				case(3):{
					if (face == 1){
						return("Ace Diamonds");
					}
					if (face == 2){
						return("2 Diamonds");
					}
					if (face == 3){
						return("3 Diamonds");
					}
					if (face == 4){
						return("4 Diamonds");
					}
					if (face == 5){
						return("5 Diamonds");
					}
					if (face == 6){
						return("6 Diamonds");
					}
					if (face == 7){
						return("7 Diamonds");
					}
					if (face == 8){
						return("8 Diamonds");
					}
					if (face == 9){
						return("9 Diamonds");
					}
					if (face == 10){
						return("10 Diamonds");
					}
					if (face == 11){
						return("Jack Diamonds");
					}
					if (face == 12){
						return("Queen Diamonds");
					}
					if (face == 13){
						return("King Diamonds");
					}
					break;
				}
			}
			return("");
		}
}
