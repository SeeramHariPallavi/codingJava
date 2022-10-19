//QUESTION:
//Given an array A of positive integers. Your task is to find the leaders in the array. 
//An element of an array is leader if it is greater than or equal to all the elements to its right side.
//The rightmost element is always a leader.

//EXAMPLE
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2


package codes;

import java.util.ArrayList;


public class Problem1 {
	public ArrayList<Integer> ans(int n, ArrayList<Integer> arr){
		int c=arr.get(n-1);
		ArrayList<Integer> arr_ans=new ArrayList<Integer>();
		for(int i=n-1;i>=0;i--) {
			if(arr.get(i)>c) {
				arr_ans.add(c);
				c=arr.get(i);
			}
		}
		arr_ans.add(c);
		return arr_ans;
		
	}
//	public static void main(String[] args) {
//		ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(16, 17, 4, 3, 5, 2));
//		System.out.println(ans(arr));
//	}
}
