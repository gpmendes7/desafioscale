package com.example.desafioscale.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class FibonnaciServiceTest {
	
	private static FibonacciService fs;
	
	@BeforeAll
	private static void setUp() {
		fs = new FibonacciService();
	}

	@Test
	void test() {
		assertEquals(1, fs.fib(1));
		assertEquals(1, fs.fib(2));
		assertEquals(2, fs.fib(3));
		assertEquals(3, fs.fib(4));
		assertEquals(5, fs.fib(5));
		assertEquals(8, fs.fib(6));
		assertEquals(89, fs.fib(11));
	}

}
