import java.util.Arrays;

class program6 {
    public static void main(String[] args) {
        String[] arr = { "practice.geeksforgeeks.org", "www.geeksforgeeks.org", "code.geeksforgeeks.org" };
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

/*
import java.util.ArrayList;
import java.util.Collections;

public class SortStringExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("practice.geeksforgeeks.org");
        al.add("www.geeksforgeeks.org");
        al.add("code.geeksforgeeks.org");

        Collections.sort(al);
        System.out.println("Sorted ArrayList: " + al);
    }
}
*/

