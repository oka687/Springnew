package org.me.test;

import java.util.Map;
import java.util.Scanner;

public class Make {
	
	Scanner key = new Scanner(System.in);
	int count = 0;
	Map list = new Map();
	
	public void exe() {
	
		while(true) {
		System.out.println("����⸦ �����Ͻðڽ��ϱ�?");
		
		String quest = key.nextLine();
		
		if(quest.equals("y")) {
			System.out.println("����� ��ȣ�� �Է��Ͻÿ�.");
			int no = Integer.parseInt(key.nextLine());
			System.out.println("����� �̸��� �Է��Ͻÿ�.");
			String name = key.nextLine();
			
			list.put(no, name);
			count++;
			System.out.println("�����Ǿ����ϴ�.");
		}
		
	}

	}
}
