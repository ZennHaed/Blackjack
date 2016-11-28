package blackjack;

import guiBlackjack.IO;

public class Player {

	private static int count;//number of players
	private static boolean playersSet = false;//if players have been set already
	private int score;
	private boolean stand;
	private boolean bust;
	private double cash;//Amount of cash available
	Card [] hand = new Card [9];
	int handCount;
	
	public Player(){
		score = 0;
		stand = false;
		bust = false;
		cash = 200.0;
		handCount = 0;
	}
	
	public boolean getStand(){
		return (this.stand);
	}

	public double getCash(){
		return(this.cash);
	}

	public double getMin(){
		if (cash<10){
			return (cash);
		}
		return(10);
	}
	
	public boolean getBust() {
		return (bust);
	}

	public int getScore(){
		return (this.score);
	}

	public static void setPlayers(int players){
		if (!playersSet){
			count = players;
			playersSet = true;
		}
	}
	
	public void hit(Card c){
		score += c.getFace();
		hand[handCount] = c;
		c.flip();
		if (score > 21){
			Player.bust(this);
			return;
		}
		handCount++;
	}
	
	public void stand(){
		stand = true;
	}
	
	public static void bust (Player p){
		//Insert printBust method from main class here
		//Lines 38 - 41 is the printHand() method
		for (int i = 0; i < p.hand.length; i++){
			System.out.print(p.hand[i] + ",");
		}
		System.out.println("");
		for (int i = 0; i < p.hand.length; i++){
			p.hand[i] = null;
		}
		p.handCount = 0;
	}
	
	public double wage(double wager){
		while (wager<10){
			System.out.println ("You have entered an invalid amount");
			System.out.print ("Amount: $");
			wager = IO.readDouble();
		}
		if (wager>cash){
			wager = cash;
			cash = 0;
			return(wager);
		}
		this.cash -= wager;
		return (wager);
	}
	
	public void printHand(){
		for (int i = 0; i < hand.length; i++){
			System.out.print(hand[i] + ",");
		}
		System.out.println("");
	}
	
	public void resetRound(){
		//Resets players for next round
		score = 0;
		stand = false;
		handCount = 0;
		for (int i = 0; i < hand.length; i++){
			hand[i] = null;
		}
	}
	
}
