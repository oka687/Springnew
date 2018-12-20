package org.me.test;

import java.util.Map;
import java.util.Scanner;

public class Make {
	
	Scanner key = new Scanner(System.in);
	int count = 0;
	Map list = new Map();
	
	public void exe() {
	
		while(true) {
		System.out.println("비행기를 생산하시겠습니까?");
		
		String quest = key.nextLine();
		
		if(quest.equals("y")) {
			System.out.println("비행기 번호를 입력하시오.");
			int no = Integer.parseInt(key.nextLine());
			System.out.println("비행기 이름을 입력하시오.");
			String name = key.nextLine();
			
			list.put(no, name);
			count++;
			System.out.println("생성되었습니다.");
		}
		
	}

	}
}
