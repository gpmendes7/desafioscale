package com.example.desafioscale.service;

public class FibonacciService {
	
	public int fib(int n) {
		int ant = 1;
	    int prox = 1;

		if(n == 1) {
			return ant;
		}
		
		int i = 0;
		
		int s = 0;

		while(i < n - 1) {
			s = ant + prox;
			ant = prox;
			prox = s;
			i++;
		}
		
		return ant;
	}

}
