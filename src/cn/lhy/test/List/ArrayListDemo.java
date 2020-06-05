package cn.lhy.test.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE+1);
        List<String> arrays = new ArrayList<>();
        arrays.add("1");
        arrays.add("2");
        arrays.add("3");
        arrays.add("4");
        System.out.println(Arrays.toString(arrays.toArray()));
        int[] a = new int[]{};
        a[Integer.MAX_VALUE+1] = 0;
//        List<String> lists = new ArrayList<>(arrays);
//        System.out.println(Arrays.toString(lists.toArray()));
    }
}
