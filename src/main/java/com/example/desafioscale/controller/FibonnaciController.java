package com.example.desafioscale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.desafioscale.service.FibonacciService;

@RestController
@RequestMapping(value = "/fibonacci")
public class FibonnaciController {

	@GetMapping("{n}")
	private int calcula(@PathVariable int n) {
		   FibonacciService fs = new FibonacciService();
		   return fs.fib(n);
	}

}
