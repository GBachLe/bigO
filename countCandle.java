package bigO;

import java.util.ArrayList;

public class countCandle {
	public static void main(String[] args) {
		int[] arr = { 4, 4, 1, 3 };
		System.out.println(birthdayCakesCandle(arr));
	}

	public static int birthdayCakesCandle(int[] arr) {
		int max = arr[0];
		int count = 0;
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		for (int j : arr) {
			if (max == j) {
				count++;
			}
		}
		return count;

	}
}
