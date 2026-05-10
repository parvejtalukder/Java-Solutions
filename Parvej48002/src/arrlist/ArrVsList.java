package arrlist;
import java.util.ArrayList;

public class ArrVsList {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4};
        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int value: arr) {
            list.add(value);
            list.add(value);
        }
        System.out.println(arr.length);
        System.out.println(list.size());
    }

}