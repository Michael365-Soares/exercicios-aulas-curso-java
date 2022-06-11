package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
    	TreeSet<Integer> nums=new TreeSet<>();
    	
    	nums.add(12);
    	nums.add(90);
    	nums.add(-13);
    	nums.add(123);
    	nums.add(19);
    	nums.add(999);
    	nums.add(786);
    	nums.add(235);
    	
    	for(Integer n:nums) {
    		System.out.println(n);
    	}
    }
}
