package main;

public class Main {
    public static void main(String[] args) {
        System.out.println("StringBuffer:-");
        StringBuffer one = new StringBuffer("Dhaka");
        System.out.println("Initial       : " + one);
        one.append(": Capital");
        System.out.println("After Append  : " + one);
        one.deleteCharAt(5);
        System.out.println("After Delete  : " + one);
        one.insert(6, "is the ");
        System.out.println("After Insert  : " + one);
        one.replace(9, 12, "Our");
        System.out.println("After Replace : " + one);
        one.reverse();
        System.out.println("After Reverse : " + one);
        System.out.println("Comparing Res : " + one.equals("Hello"));
        System.out.println("Capacity of S : " + one.capacity());
        System.out.println("Current Size  : " + one.length());
        one.reverse();
        System.out.println("Final String  : " + one + " [R]");
    }
}
