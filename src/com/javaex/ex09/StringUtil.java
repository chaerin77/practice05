package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] a){
       
        //메소드 내용작성
    	String text=""; 
    	
    	for(int i=0; i<3; i++) {
    	
    		text=text+a[i];
    		
    	}
    	return text;
    }   
   
}
