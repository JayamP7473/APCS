public class CondEx{
    public boolean isLeapYear(int year){
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 !=0)){
            return true;
        }
        return false;
    }

    public boolean isSooner(int month1, int day1, int year1, int month2, int day2, int year2){
        if (year1 < year2){
            return true;
        }
        else if (year1 > year2){
            return false;
        }
        else if (month1 < month2){
            return true;
        }
        else if (day1 < day2){
            return true;
        }
        else{
            return false;
        }
    } 

    public int findBestFit(int space, int size1, int size2){
        if (size1 > space && size2 > space){
            return 0;
        }
        else if (size1 == size2){
            if ((size1 && size2) ==space)
            return 1;
        }
        else if (size 1)
    }
    public static void main(String [] args){
        CondEx ce = new CondEx();
        // leap year
        System.out.println("2000 " + ce.isLeapYear(2000));
        System.out.println("2004 " + ce.isLeapYear(2004));
        System.out.println("2003 " + ce.isLeapYear(2003));
        System.out.println("2100 " + ce.isLeapYear(2100));

        // is sooner
        System.out.println("isSooner");
        System.out.println("1/2/2010 is sooner than 1/2/2011 " + ce.isSooner(1,2,2010, 1,2,2011));
        System.out.println("2/1/2011 is sooner than 2/2/2010 " + ce.isSooner(2,1,2011, 2,2,2010));
        System.out.println("1/2/2011 is sooner than 2/2/2010 " + ce.isSooner(1,2,2011, 2,2,2010));
        System.out.println("1/5/2010 is sooner than 3/2/2010 " + ce.isSooner(1,5,2010, 3,2,2010));
        System.out.println("3/2/2010 is sooner than 1/2/2010 " + ce.isSooner(3,2,2010, 1,2,2010));
        System.out.println("1/3/2010 is sooner than 1/2/2010 " + ce.isSooner(1,3,2010, 1,2,2010));
        System.out.println("5/2/2010 is sooner than 1/3/2011 " + ce.isSooner(5,2,2010, 1,3,2011));
        System.out.println("1/2/2010 is sooner than 1/2/2010 " + ce.isSooner(1,2,2010, 1,2,2010));
        System.out.println("4/8/2010 is sooner than 1/2/2010 " + ce.isSooner(4,8,2010, 1,2,2010));

    }

}