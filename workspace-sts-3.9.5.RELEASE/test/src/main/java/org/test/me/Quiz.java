package org.test.me;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);

		int ran = (int)(Math.random()*99);

		while(true) {
			System.out.println("���ڸ� �Է��ϼ���.");

			int input = Integer.parseInt(key.nextLine());

			if(input < ran) {
				System.out.println("����");
				continue;
			}if(input > ran) {
				System.out.println("ŭ");
				continue;
			}else {
				System.out.println(ran);
				System.out.println("����. ��");
				break;
			}

		}
	}

}
