package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member mem1 = new Member("정우성","jws",50000);
		mem1.showInfo();
		
		Member mem2 = new Member("유재석","yjs",30000);
		mem2.showInfo();
		
		Member mem3 = new Member("이효리","lhr",40000);
		mem3.showInfo();
		
	}

}
