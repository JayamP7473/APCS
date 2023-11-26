public class Die {
    private int numbdots;

    public void roll(){
        numbdots = (int) (Math.random() * 6)+ 1;
    }

    public int getNumDots(){
        return numbdots;
    }

    public static void main(String[] args) {
        Die die = new Die();
        die.roll();
       System.out.println(die.getNumDots());
    }

}
