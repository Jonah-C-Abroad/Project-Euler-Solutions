import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

//Algorithm that allows you to calculate sin values via Taylor series approximations to the 15th derivative.

public class TaylorSeries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> start = new ArrayList<>();
        System.out.print("Please input a sin DEGREE value you would like to calculate: ");
        double degreeValue = input.nextDouble();
        double value = Math.toRadians(degreeValue);
        int i = 0;
        //Taylor Series summation loop. Can increase or decrease how high you want i to go, for a more in depth or less in depth approximation
        while (i <= 15){
            int z = 1;
            double fact=1;
            int number=((2*i)+1);
            for(z=1;z<=number;z++){
                fact=fact*z;
            }
            if (i == 0){
                fact = 1;
            }
            double sin = ((Math.pow(-1,i))/fact)*Math.pow(value,(2*i)+1);
            start.add(sin);
            System.out.println(i);
            i++;
        }
        double finalNum = 0;
        for (double f: start) {
             finalNum = finalNum + f;
        }
        System.out.println("This value of sin equates to: " + finalNum + ".");

    }
}
