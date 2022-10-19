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
