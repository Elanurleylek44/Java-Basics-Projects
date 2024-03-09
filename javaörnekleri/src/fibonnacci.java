/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
// Java program for the above approach

class GFG {

	// Function to print N Fibonacci Number
	static void Fibonacci(int N)
	{
		int sayi1 = 0, sayi2 = 1;

		int sayac= 0;

		// Iterate till counter is N
		while (sayac < N) {
			System.out.print(sayi1 + " ");

			
			int sayi3 = sayi2 + sayi1;
			sayi1 = sayi2;
			sayi2 = sayi3;
			sayac = sayac + 1;
		}
	}

	
	public static void main(String args[])
	{
		// Given Number N
		int N = 50;

		// Function Call
		Fibonacci(N);
	}
}

