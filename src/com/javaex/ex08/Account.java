package com.javaex.ex08;

public class Account {

	//필드
    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    
    public Account(String accountNo) {
    	this.accountNo=accountNo;
    }
    
    //필요한 메소드 작성

        
    //메소드 일반
	
	public int deposit(int a) {
		balance = balance + a;
		
		return balance;
	}
	

	public int withdraw(int b) {
		balance = balance -b;
		
		return balance;
	}  
	
	
	
	public void showBalance() {
		System.out.println(balance);
	}
	
	
	public void showInfo() {
		System.out.println(accountNo+"계좌가 개설되었습니다.");
		
	}
}
