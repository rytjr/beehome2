package beehome2;

import java.util.*;

public class beehome2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sum = 1;
		int count = 1;
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.print(1);
		}
		else {
			for(int i = 1; i < 1000000; i++) {
				++count;
				sum = sum + 6*i;
				if(num <= sum) {
					System.out.print(count);
					break;
				}
			}
		}
	}
}