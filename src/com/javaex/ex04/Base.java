package com.javaex.ex04;

public class Base {
    
    public void service(String state) { 
    	//state왜있나계속생각함 이런거쓰려고했나봄,메소드안에 메소드사용가능,조건달기가능
        
        //코드작성할것  //day(); night(); afternoon();그냥썼더니 세번씩나와서 어쩔까고민하다 조건달음
    	if(state=="낮") {
    		day();
    	}
    	
    	if(state=="밤") {
    		night();
    	}
    	
    	if(state=="오후") {
    		afternoon();
    	}
    }
    
    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {
        
    	//코드작성할것
    	System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

