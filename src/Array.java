//Write a Java program to sort a numeric array and a string array
import java.util.Arrays;
public class Array {
    public void main(String[] args) {
        int[] numerical = {
                1, 2, 4, 5, 6, 7, 8, 9,};
        String[] letters = {"number", "num", "nu"};


        System.out.println("number" + Arrays.toString(numerical));
        Arrays.sort(numerical);
    }
}


//
//public class Array {
//    public static void main(String[] args){
//
//        int[] my_array1 = {
//                1789, 2035, 1899, 1456, 2013,
//                1458, 2458, 1254, 1472, 2365,
//                1456, 2165, 1457, 2456};
//
//        String[] my_array2 = {
//                "Java",
//
//                "Python",
//                "PHP",
//                "C#",
//                "C Programming",
//                "C++"
//        };
//        System.out.println("Original numeric array : "+Arrays.toString(my_array1));
//        Arrays.sort(my_array1);
//        System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
//
//        System.out.println("Original string array : "+Arrays.toString(my_array2));
//        Arrays.sort(my_array2);
//        System.out.println("Sorted string array : "+Arrays.toString(my_array2));
//    }
//}
//
//
//
//



