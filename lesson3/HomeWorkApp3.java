package lesson3;
import java.util.Arrays;
public class HomeWorkApp3 {

    private static int[] myArrayInt = {0,1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args){
        zeroAndOne();
        System.out.println();
        System.out.println("**********");
        emptyArray();
        System.out.println();
        System.out.println("**********");
        numbersLessSix();
        System.out.println();
        System.out.println("**********");
        Diagonal();
        System.out.println("**********");
        System.out.println(Arrays.toString(lenAndValue(5, 10)));
        System.out.println("**********");
        System.out.println("Max = " + fMax(myArrayInt));
        System.out.println("Min = " + fMin(myArrayInt));
    }

    public static void zeroAndOne(){
        int[] myArrayInt = {1,1,0,0,1,0,1,1,0,0};
        for (int i = 0; i < myArrayInt.length; i++) {
            if (myArrayInt[i] == 1){
                myArrayInt[i] = 0;
            } else {
                myArrayInt[i] = 1;
            }
        }
        for (int i = 0; i < myArrayInt.length; i++) {
            System.out.print(myArrayInt[i] + " | ");
        }
    }

    public static void emptyArray(){
        int[] myArrayInt = new int[100];
        for (int i = 0; i < myArrayInt.length; i++) {
            myArrayInt[i] = i + 1;
            System.out.print(myArrayInt[i]  + " | ");
        }
    }

    public static void numbersLessSix(){
        int[] myArrayInt = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < myArrayInt.length; i++){
            if (myArrayInt[i] < 6){
                System.out.print(myArrayInt[i] * 2 + " | ");
            } else {System.out.print(myArrayInt[i] + " | ");
            }
        }
    }

    public static void Diagonal(){
        int[][] myArrayInt = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (i == j || myArrayInt.length - i - 1 == j){
                   System.out.print( 1 + "\t");
                }
                else {
                    System.out.print(myArrayInt[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public static int[] lenAndValue(int len, int initialValue){
        int[] myArrayInt = new int[len];
        for (int i=0; i < myArrayInt.length; i++ ){
            myArrayInt[i] = initialValue;
        }
        return myArrayInt;
    }

    public static int fMin(int[] myArrayInt){
        int min = myArrayInt[0];
        for (int i = 0; i < myArrayInt.length; i++){
            if (myArrayInt[i] < min){
                min = myArrayInt[i];
            }
        }
        return min;
    }

    public static int fMax(int[] myArrayInt){
        int max = myArrayInt[0];
        for (int i = 0; i < myArrayInt.length; i++){
            if (myArrayInt[i] > max){
                max = myArrayInt[i];
            }
        }
        return max;
    }
}
