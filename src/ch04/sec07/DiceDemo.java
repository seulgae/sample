package ch04.sec07;

import java.util.Scanner;

public class DiceDemo {
	public static void main(String[] args) {
		Dice dice = new Dice();
		Scanner in = new Scanner(System.in);
		
		System.out.print("주사위를 몇 번 반복할래요? : ");
		int diceNum = in.nextInt();
		
		for (int i = 0; i < diceNum; i++) {
			dice.roll(diceNum);
		}
	}
}


class Dice {
	void roll(int diceNum) {
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
	}
}

