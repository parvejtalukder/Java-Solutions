package problemseven;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str_one, str_two;
        str_one = scn.nextLine();
        str_two = scn.nextLine();
        scn.close();
        // p = "abba"
        // s = "dog cat cat dog"
        // a = 'dog'
        // b = "cat"
        // a, a = a
        char[] arr_char = str_one.toCharArray();
        String[] arr_str = str_two.split(" ");
        int si_one = arr_char.length;
        int si_two = arr_str.length;
        Set<Character> char_set = new HashSet<>(); 
        Set<String> str_set = new HashSet<>();
        for(int i = 0; i < si_one; i++) {
            char_set.add(arr_char[i]);
        }
        for(int i = 0; i < si_two; i++) {
            str_set.add(arr_str[i]);
        }
        // a = dog
        // b = cat
        
        // System.out.println(char_set.size());
        // System.out.println(str_set.size());
    }
}