package com.sapient.exceptions;

public class Demo2 {

	public static void main(String[] args) {
		String res = approveLoan(22, 50000);
		System.out.println(res);
	}
	
	public static String processLoan(int age, double income) throws AgeException, IncomeException{
		if(age < 20 || age > 40)
			throw new AgeException("age must be between 20 and 40");
		if(income < 40000)
			throw new IncomeException("Income must be minimum 4 Lakhs");
		return "loan approve";
	}
	
	public static String approveLoan(int age, double income){
		String res = null;
		try {
			res = processLoan(age, income);
			return res;
		} catch (AgeException | IncomeException e) {
			return e.getMessage();
		}finally{
			System.out.println("Finally Block");
		}		
	}

}
