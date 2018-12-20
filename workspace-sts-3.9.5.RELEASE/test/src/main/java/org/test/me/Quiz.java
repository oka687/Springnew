package org.test.me;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int ran = (int)(Math.random()*99);

		while(true) {
			System.out.println("숫자를 입력하세요.");

			int input = Integer.parseInt(key.nextLine());

			if(input < ran) {
				System.out.println("낮음");
				continue;
			}if(input > ran) {
				System.out.println("큼");
				continue;
			}else {
				System.out.println(ran);
				System.out.println("맞음. 끝");
				break;
			}

		}
	}

}
