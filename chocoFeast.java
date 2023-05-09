package bigO;

public class chocoFeast {
public static void main(String[] args) {
	int n = 10;
	int c = 2;
	int m = 5;
	
	System.out.println(theFeast(n,c,m));
}


public static int theFeast(int n, int c, int m) {
			
	int totalChoco = n/c;
	int wrappers = totalChoco;
	int extraChoco = 0;
	while(wrappers >= m) {
			extraChoco = wrappers/m;
			wrappers = extraChoco + wrappers%m;
			totalChoco += extraChoco;
	}	
	return totalChoco;
	
		}

}
