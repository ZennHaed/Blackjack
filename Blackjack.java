package blackjack;

import guiBlackjack.IO;

public class Blackjack {
	
	public static void main (String[] args){
		int rep = 0;//Continue marker
		int players = IO.readInt();
		int choice;
		double pot = 0;
		Player [] play = new Player [players];
		for (int i = 0; i < players; i++){
			play[i] = new Player();
		}
		Player.setPlayers(players);
		do{
			Deck deck = new Deck();
			deck.shuffle();
			for (int i = 0; i < play.length; i++){//For every player
				play[i].hit(deck.deal());
				play[i].hit(deck.deal());
				System.out.println ("How much will you wager, Player " + i + "?");
				System.out.println("Minimum $" + play[i].getMin() + "\n"
							+ "Maximum $" + play[i].getCash());
				pot += play[i].wage(IO.readDouble());
				do{
					System.out.println ("Hit (0) or Stand (1)?");
					choice = IO.readInt();
					if (choice == 0){
						play[i].hit(deck.deal());
						play[i].printHand();
						System.out.println("Current Score: " + play[i].getScore());
					}
					else{
						play[i].stand();
					}
				}while(!play[i].getStand());
				System.out.println ("How much will you wager, Player " + i + "?");
				System.out.println("Minimum $" + play[i].getMin() + "\n"
							+ "Maximum $" + play[i].getCash());
				pot += play[i].wage(IO.readDouble());
				System.out.println("");
			}
			//Complete Dealer section and Winnings
			
		}while(rep == 0);//Players decide to continue
	}
	
	public static void printBust(int playIndex){//Don't know where to pass parameter
		System.out.println("Player " + playIndex + " has busted!");
	}
	
	
}
