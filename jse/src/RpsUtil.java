package oop01.encapsule;

public class RpsUtil {
	public String showRange(int a,int b){
     String rangeMsg = a +"부터"+ b+ "까지의 값만 입력하셔야 합니다.";
     return rangeMsg;
    }
 
    public String showWrongType(){
    	
     return "정수값만 넣으시기 바랍니다. ";
    }
 
}