//Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("inut number");
        Scanner positive = new Scanner(System.in);
        int n = positive.nextInt();
        if (n>0){
            System.out.println("even numbers");
        } else if (n<0) {
            System.out.println("odd number");

        }else {
            System.out.println("zero");
        }



    }
}