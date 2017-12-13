package com.kz.exercise1.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kz.exercise1.Helper;
import com.kz.exercise1.Student;

public class main {
	public static void main(String[] arg) {
		ArrayList<Student> studentArrayList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		Helper studentHelper = new Helper();
		int choice = 0;
		do {
			showMenu();

			while (true) {
				System.out.println("Nhap lua chon ( 1 -> 5 ); ");
				try {
					choice = Integer.parseInt(input.nextLine());
					if (choice >= 1 && choice <= 5) {
						break;
					} else {
						System.out.println("Sai roi.");
					}
				} catch (NumberFormatException numberException) {
					System.out.println("Gia tri sai.");
				}
			}
			switch (choice) {
			case 1:
				studentHelper.add(studentArrayList);
				break;

			case 2:
				studentHelper.showAll(studentArrayList);
				break;

			case 3:
				break;

			case 4:
				studentHelper.deleteByIndex(studentArrayList);
				break;

			case 5:
				System.out.println("Ket Thuc!!!");
				break;

			default:
				break;
			}
		} while (choice != 5);
	}

	private static void showMenu() {
		System.out.println("---------------------");
		System.out.println("1. Them sinh vien");
		System.out.println("2. Hien thi toan bo");
		System.out.println("3. Sua sinh vien");
		System.out.println("4. Xoa sinh vien");
		System.out.println("5. Thoat");
	}
}
