package com.kz.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Helper {
	public void add(ArrayList<Student> studentArrayList) {
		Student newStudent = new Student();
		newStudent = newStudent.inputData();
		studentArrayList.add(newStudent);
	}

	public void showAll(ArrayList<Student> studentArrayList) {
		for (Student student : studentArrayList) {
			System.out.println(student);
		}
	}

	public void deleteByIndex(ArrayList<Student> studentArrayList) {
		Scanner input = new Scanner(System.in);
		int index = 0;

		if (studentArrayList.isEmpty()) {
			System.out.println("Chua co du lieu gi ca");
		} else {

			while (true) {
				System.out.println("Vi tri can xoa : ");
				try {
					index = Integer.parseInt(input.nextLine());

					if (index >= 0 && index < studentArrayList.size()) {
						break;
					} else {
						System.out
								.println("Vi tri nam trong khoang 0 -> " + studentArrayList.size() + ", moi nhap lai!");
					}
				} catch (NumberFormatException numberException) {
					System.out.println("Gia tri vua nhap khong la so nguyen");
				}
			}

			studentArrayList.remove(index);
		}
	}

	public void deleteByName(ArrayList<Student> studentArrayList) {
		Scanner input = new Scanner(System.in);
		int index = 0;

		String name = input.nextLine();

		while (index < studentArrayList.size()) {
			if (studentArrayList.get(index).getTensv().equals(name)) {
				studentArrayList.remove(index);
			} else {
				index++;
			}
		}

	}

}
