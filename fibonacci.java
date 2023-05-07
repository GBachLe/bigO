package bigO;

import java.util.Iterator;

public class fibonacci {
public static void main(String[] args) {
	int num = 6;
	System.out.println(findFibonacci(num));
}


public static int findFibonacci (int num) {
	if ( num == 0 || num == 1 ) {
		return 1;
	}
	
	else {
		int[] fibo = new int[num+1];
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		return fibo[num];
	}
}
}
