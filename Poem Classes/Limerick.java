public class Limerick extends Poem{
    public Limerick(){
        super(5);
    }

    public int getSyllables(int l){
        if(l == 1 || l == 2 || l == 5) return 9;
        else return 6;
    }

    public void printRhythm(){
        print_Rhythm(getSyllables(1));
        print_Rhythm(getSyllables(2));
        print_Rhythm(getSyllables(3));
        print_Rhythm(getSyllables(4));
        print_Rhythm(getSyllables(5));
    }
    
}