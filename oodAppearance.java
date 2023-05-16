package bigO;

public class oodAppearance {
	public static void main(String[] args) {
//		int[] arr = {1,1,2,2,10};
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15};
		findOddTimesAppearNum(arr);
		
	}

	public static void findOddTimesAppearNum(int[] arr) {
		int maxnum = maximumNum(arr);
		int[] countArr = new int[maxnum + 1];

		for (int i : arr) {
			countArr[i]++;
		}

		for (int j : arr) {
			if (countArr[j] % 2 == 1) {
				System.out.println(j);
			}
		}
	}

	public static int maximumNum(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
