package training;

import java.util.Scanner;
/* 平等に配りたい */
public class Candy {
	public static void main(String[] args) {
		/*
		System.out.println("子供2人にあげるキャンディーの個数を入力してください");
		Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.print("一人がもらえるキャンディーの個数は");
		System.out.println((num%2==0)? num/2+"個" : num/2 + "個あまり" +num%2);
		*/
		System.out.println("子供2人にあげるキャンディーの個数を入力してください");
		Scanner scanner = new java.util.Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		System.out.print("一人がもらえるキャンディーの個数は");
		if(num%2==0) {
			System.out.println(num/2 + "個");
		}else {
			System.out.println(num/2 + "個あまり" + num%2);
		}
	}
}