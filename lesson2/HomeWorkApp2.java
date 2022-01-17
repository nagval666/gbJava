package lesson2;

public class HomeWorkApp2 {

    public static void main(String[] args){
        System.out.println("N1**********");
        System.out.println(sumTwoNum(10,10));
        System.out.println("N2**********");
        posOrNeg(-1);
        System.out.println("N3**********");
        System.out.println(negative(-1));
        System.out.println("N4**********");
        numAndString("Hello!", 3);
        System.out.println("N5**********");
        System.out.println(leapYear(400));

    }

    public static boolean sumTwoNum(int a, int b){
        return a+b >= 10 & a+b <= 20;
//      if (a+b >= 10 & a+b <= 20){
//          return true;
//      } else {
//          return false;
//      }
    }

    public static void posOrNeg(int a){
        if (a>=0){
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    public static boolean negative(int a){
        return a < 0;
//        if (a < 0){
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void numAndString(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }
    }

    public static boolean leapYear(int a){
        return (a % 4 == 0) & (a % 100 != 0) || (a % 400 ==0);
//        if (a % 4 == 0 && a % 100 > 0){
//            return true;
//        } else if (a % 400 == 0){
//            return true;
//        } else {
//            return false;
//        }
    }

}
