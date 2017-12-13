package com.kz.exercise1;

import java.util.Scanner;

public class Student {
	private String tensv;
	private int namsinh;
	private String thanhpho;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String tensv, int namsinh, String thanhpho) {
		super();
		this.tensv = tensv;
		this.namsinh = namsinh;
		this.thanhpho = thanhpho;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}

	public String getThanhpho() {
		return thanhpho;
	}

	public void setThanhpho(String thanhpho) {
		this.thanhpho = thanhpho;
	}

	public Student inputData() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap ten sinh vien:");
		this.tensv = input.nextLine();
		while (true) {
			try {
				System.out.println("Nhap nam: ");
				this.namsinh = Integer.parseInt(input.nextLine());

			} catch (NumberFormatException numberException) {
				System.out.println("Gia tri vua nhap khong dung.");
			}
			System.out.println("Nhap thanh pho: ");
			this.thanhpho = input.nextLine();
			return this;
		}
	}

	@Override

	public String toString() {
		String output = "Ten: " + tensv + "Nam sinh: " + namsinh + "Thanh pho: " + thanhpho;
		return output;
	}

}
