package edu.fju.exam;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 45, 81, 9, 72, 4, 6 };
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] < n[j]) {
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
			System.out.print(n[i]+" ");
		}
	}
}
