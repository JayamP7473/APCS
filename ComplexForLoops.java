public class ComplexForLoops{
    public void eights(){
        for (int i = 8; i>=2; i-=2){
            for (int j = i; j<=6; j+=2){
                System.out.print(" ");
            }            
            for (int j = 0; j<i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void alternate(int n){
        for(int i = 0; i<=n; i++){
            if(i%2 !=0){
                for(int j = 1; j<=i; j++){
                    System.out.print(j);
                }
            }
            else{
                for(int k = i; k>=1; k--){
                    System.out.print(k);
                }
            }
            System.out.println();
        }

    }

    public void isosceles(int n){
        for(int i = 1; i <=n; i++){
            for(int j=1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void upSideDown(int n, int m){
        for (int i = 0; i<=n-m; i++){
            for (int j = 0; j<=i; j++){
                System.out.print(" ");
            }            
            for(int j = n-i; j>=m; j--){
                System.out.print(j);
            }
            for(int j=m+1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }



    public static void main (String[] args){
        ComplexForLoops Fl = new ComplexForLoops();
        Fl.eights();
        System.out.println(" ");
        Fl.alternate(6);
        Fl.alternate(5);
        System.out.println(" ");
        Fl.isosceles(5);
        Fl.isosceles(6);
        System.out.println(" ");
        Fl.upSideDown(9, 5);
        Fl.upSideDown(8, 6);
        Fl.upSideDown(7, 4);
        Fl.upSideDown(3, 2);
    }

}