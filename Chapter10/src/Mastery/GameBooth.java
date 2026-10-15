package Mastery;


/**
public class GameBooth {

    private int cost;
    private String firstPrize;
    private String consolationPrize;

    
    public GameBooth()
    {
    	
    }
    
    public GameBooth(int cost, String p1, String p2) 
    {

        this.cost = cost;
        firstPrize = p1;
        consolationPrize = p2;
    }

    public String start() {

        int plays = 0;

        // The player gets three plays
        for (int i = 0; i < 3; i++) {

            int number = (int)(Math.random() * 2);

            if (number == 1) {
                plays++;
            }
        }

        // If all three plays succeed, award first prize
        if (plays == 3) {
            return tiger;
        }

        // Otherwise award consolation prize
        return consolationPrize;
    }

    public int getCost() {
        return cost;
    }
}
*/

/**
 * GameBooth class.
 */

import java.lang.Math;

public class GameBooth {
	private double cost;
	private String firstPrize, consolationPrize;


	/**
	 * constructor
	 * pre: none
	 * post: A GameBooth object created. The cost and prizes are set.
	 */
	public GameBooth(double charge, String p1, String p2) {
		cost = charge;
		firstPrize = p1;
		consolationPrize = p2;
	}


	/**
	 * Game is played and prize awarded.
	 * pre: none
	 * post: Player had three tries. Player successful all
	 * three times received the first prize. A consolation
	 * prize has been awarded otherwise.
	 */
	public String start() {
		int toss;
		int successes = 0;

	 	/* play game */
	 	for (int i = 0; i < 3; i++) {	//player gets three tries
	 		toss = (int)(Math.random() + 0.5);	//0 or 1
	 		if (toss == 1) {
	 			successes += 1;			//a successful toss is equal to 1
	 		}
	 	}

	 	/* award prize */
	 	if (successes == 3) {
	 		return(firstPrize);
	 	} else {
	 		return(consolationPrize);
	 	}
	}


	/**
	 * Returns the cost to  play the game.
	 * pre: none
	 * post: Cost of the game has been returned.
	 */
	public double getCost() {
	 	return(cost);
	}

}
