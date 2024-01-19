public class stringBook{

    public static String scroll(String w){
        String l = "";
        l+=w.substring(1);
        l += w.charAt(0);
        return l;
    }

    public static String convertName(String n){
        String a= "";
        String b="";
        int x =n.indexOf(",");
        a= n.substring(x+1).trim();
        b=n.substring(0,x).trim();
        return a+" "+b;
    }

    public  static String negative(String n){
        String x = n;
        String y= x.replace("0","x");
        y = y.replace("1","0" );
        y = y.replace("x","1" );
        return y;
    }

    public static String dateString(String n ){
        String month = n.substring(0,2);
        String day = n.substring(3, 5);
        String year = n.substring(6);
        String EUF = day + "-" + month + "-" + year;
        return EUF; 
    }

    public static String dateString2(String n){
        int a= n.indexOf("/");
        int b= n.lastIndexOf("/");
        String month= n.substring(0,a);
        String day=n.substring(a+1,b);
        String year=n.substring(b+1);
        if ((month.length())<2){
            month="0"+ month;
        }
        if ((day.length()<2)){
            day="0"+day;
        }
        return day+"-"+ month+"-"+year;
    }

    public static boolean startsWith(String s, String p){
        int a= p.length();
        if (a>s.length()){
            return false;
        }
        String l=s.substring(0,a);
        if(p.equals(l)){
            return true;
        }
        else{
            return false;
        }
    }


    public static  boolean endsWith(String s, String suffix){
        int b=suffix.length();
        int c=s.length();
        if (b>c){
            return false;
        }
        int d=c-b;
        String e= s.substring(d);    
        if (e.equals(suffix)){
            return true;
        }
        else{
            return false;
        }
    }

    public static String removeTag(String n, String w){
        int w1 = n.indexOf("<"+w+">");
        int w2 = n.indexOf("</"+w+">");
        if (w1 == -1||w2==-1){ 
            return n;
        }
        if (w1 >= w2){
            return n;
        }
        return n.substring(w1+w.length()+2, w2);
    }

    public static void main(String[] args) {
        System.out.println(scroll("Hello World"));
        System.out.println(scroll("happy"));
        System.out.println(scroll("h"));

        System.out.println(convertName(" Reubenstein, Lori Renee "));
        System.out.println(convertName("Biden,Joe"));
        System.out.println(convertName("the Clown, Bozo"));

        System.out.println(negative("0010111001"));
        System.out.println(negative("11111111"));

        System.out.println("04/20/2014 becomes " + dateString("04/20/2014"));

        System.out.println("04/20/2014 becomes " + dateString2("04/20/2014"));
        System.out.println("4/20/2014 becomes " + dateString2("4/20/2014"));
        System.out.println("04/2/2014 becomes " + dateString2("04/2/2014"));
        System.out.println("4/2/2024 becomes " + dateString2("4/2/2024"));

        System.out.println("\nstartsWith");
        System.out.println(startsWith("architecture", "arch"));
        System.out.println(startsWith("architecture", "a"));
        System.out.println(startsWith("arch", "architecture"));
        System.out.println(startsWith("architecture", "rch"));
        System.out.println(startsWith("architecture", "architecture"));
        
        System.out.println("\nendsWith");
        System.out.println(endsWith("astronomy", "nomy"));
        System.out.println(endsWith("astronomy", "y"));
        System.out.println(endsWith("astronomy", "nom"));
        System.out.println(endsWith("nomy", "astronomy"));
        System.out.println(endsWith("astronomy", "astronomy"));

        System.out.println("\nremoveTag");
        System.out.println(removeTag("<b>Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World</b>", "head"));
        System.out.println(removeTag("Hello World</b>", "b"));
        System.out.println(removeTag("<b>Hello World", "b"));
        System.out.println(removeTag("</img>Hello World<img>", "img"));
        System.out.println(removeTag("Happy Birthday <b>Hello World</b>", "b"));
        System.out.println(removeTag("<title>Hello World</title> Happy Birthday", "title"));
        System.out.println(removeTag("Happy <b>Hello World</b> Birthday", "b"));
    }
}