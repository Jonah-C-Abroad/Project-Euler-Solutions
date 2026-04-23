import java.lang.Math;

//Reattempt at Euler problem 9 with cleaner code. Description: https://projecteuler.net/problem=9

public class Pythag2 {

    public static double Pythag(){
        for (int i = 1; i <= 1000; i++){
            int A = (int) Math.pow(i, 2);
            for (int b = 1; b <= 1000; b++){
                int B = (int) Math.pow(b, 2);
                int C = B + A;
                if ((i + b + (Math.sqrt(C))) == 1000){
                    return (i * b * Math.sqrt(C));
                }
            }
        }
        return 0;
    }

    public static void main(String[] args){
        double Answer = Pythag();
        System.out.println("The product of abc, where a + b + c = 1000, is: " + Answer + ".");
    }
}
