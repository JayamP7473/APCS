public class TwoSpinners {
    /** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/

 	public int spin(int min, int max)
 	{
     	    int r =0;
            r = (int) (Math.random()*(max-min))+min;
    	    return r;
 	}
    
    /** Simulates one round of the game as described in part (b).
  	*/
    public void playRound() {
        int player = spin(1,10); 
        int computer = spin(2,8);

        System.out.println( "Player scored: " + player + "\n");
        System.out.println( "Computer scored: " +  computer + "\n");

        if(player > computer){
            System.out.println("Player Won: " + (player - computer) + " points \n"); 
        } 
        else if(player < computer){ 
            System.out.println("Player lost: " + (player - computer) + " points \n "); 
        } 
        else{ 
            int player2 = spin(1,10);
            int computer2 = spin(2,8);
            System.out.println( "Player scored: "+ player2 + "\n");
            System.out.println( "Computer scored: " + computer2 + "\n");
            if ((player+player2) > (computer+computer2)){
                System.out.println( "Player won: 1 point \n");
            }
            else if ((player+player2) < (computer+computer2)){
                System.out.println( "Player lost: -1 point \n");
            }
            else{ System.out.println( "Draw \n" );}
        }
    }

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    
         		ds.playRound();
     	      }
 	  }

}

