package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Student ID : ");
		st.setStuId(Integer.parseInt(sc.nextLine()));
		
		System.out.print("Enter the Student Name : ");
		st.setStuName(sc.nextLine());
		
		System.out.print("Enter the English Marks : ");
		st.setEngMark(sc.nextDouble());
		
		System.out.print("Enter the Maths Marks : ");
		st.setMathMark(sc.nextDouble());
		
		System.out.print("Enter the Science Marks : ");
		st.setSciMark(sc.nextDouble());
		
		System.out.print("Enter the Language Marks : ");
		st.setLangMark(sc.nextDouble());
		
		System.out.print("Enter the Social Marks : ");
		st.setSocialMark(sc.nextDouble());
		sc.close();
		System.out.println();
		
		st.display();

	}

}
