package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teste Github");
		String resposta = sc.next();
		System.out.println("OK" + resposta);
		
		System.out.println("Parabens! Realizei um novo Commit!!!");
		
		sc.close();
	}

}
