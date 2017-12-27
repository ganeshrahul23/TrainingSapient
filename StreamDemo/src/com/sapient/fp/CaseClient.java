package com.sapient.fp;

public class CaseClient {

	public static void main(String[] args) {
		ICase upper = s -> s.toUpperCase();
		display((string) -> string.toLowerCase(), "GANESH");
		display(upper, "luffy");

	}
	
	public static void display(ICase obj, String str){
		String res = obj.changeCase(str);
		System.out.println(res);
	}

}
