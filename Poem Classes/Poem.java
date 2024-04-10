public class Poem{
    private int numLines;
    
    public Poem(int numLines){
        this.numLines = numLines;
    }
    
    public int getNumlines(){
        return numLines;
    }

    public void printRhythm(){
        System.out.println("Free Verse");
    }

    public void print_Rhythm(int syl){
        for(int i = 1; i<= syl; i++){
            if(i != syl){
                System.out.print("ta-");
            }
            else{
                System.out.print("ta");
            }
        }
        System.out.println();

    }
}