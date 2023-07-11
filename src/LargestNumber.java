import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner large = new Scanner(System.in);
        System.out.println("enter first number");
        Double k = large.nextDouble();
        System.out.println("enter second number");
        Double m = large.nextDouble();
        System.out.println("enter third number");
        Double t = large.nextDouble();
        if (k>m) if (k>t){
            System.out.println("number"+ k);

        }
        if (m>k) if (m>t){
            System.out.println("number" + m);
        }
        if (t>k) if (t>m){
            System.out.println("number" + t);
        }


    }
}
