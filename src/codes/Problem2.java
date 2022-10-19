//Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount with you. 
//Your task is to find the maximum number of toys you can buy with K amount. 

//EXAMPLE
//Input: 
//N = 7 
//K = 50
//arr[] = {1, 12, 5, 111, 200, 1000, 10}

//Output: 4

//Explanation: The costs of the toys you can buy are 1, 12, 5 and 10.

package codes;

import java.util.Arrays;

public class Problem2 {
	public int countOfItems(int[] array, int n, int k) {
		Arrays.sort(array);
		int summ=0,i=0;
		while(i<n && summ+array[i]<=k) {
			summ+=array[i];
			i+=1;
		}
		return i;
	}
	
	}
