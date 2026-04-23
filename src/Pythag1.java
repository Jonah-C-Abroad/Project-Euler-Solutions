import java.util.ArrayList;
import java.lang.Math;
//Euler problem number 9 First Attempt: Special Pythagorean Triplet, description: https://projecteuler.net/problem=9

public class Pythag1 {
    static ArrayList<Integer> nums = new ArrayList<>();
    static void num1(int x){
        int c;
        for(int i = 1; i < 999; i++){
            c = (int) (Math.sqrt(x*x + i*i));
            //Verifying that c^2 isn't a truncated root and that the condition follows
            if (c*c == x*x + i*i && c + x + i == 1000) {
                nums.add(c);
                nums.add(x);
                nums.add(i);
                return;
            }
        }

    }
    public static void main(String[] args){

        for(int f = 1; f < 999; f++){
            //Making sure we don't add too many numbers to the
            if(nums.size() != 3) {
                num1(f);
            }
        }

        int a = nums.get(0);
        int b = nums.get(1);
        int c = nums.get(2);

        System.out.println(a * b * c);

    }
}
