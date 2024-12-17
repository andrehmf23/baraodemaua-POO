package main;

import java.util.Scanner;

import creature.Individual;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		Individual Player = new Individual(scan.next(), scan.next(), scan.next());
	}
}
