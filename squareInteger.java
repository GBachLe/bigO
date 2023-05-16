package bigO;

import java.util.Iterator;

public class squareInteger {
	public static void main(String[] args) {
int c = 3;
int d = 25;

System.out.println(numsquareInt(c,d));
}

	public static int numsquareInt(int a, int b) {
		int count = 0;
		for (int i = a; i < b + 1; i++) {
			int num = (int) Math.pow(i, 0.5);
			if (num * num == i) {
				count++;
			}
		}

		return count;
	}

}
