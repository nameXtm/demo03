package ������ϰ;

import java.util.Scanner;

public class A11��7�� {

	public static void main(String[] args) {
	 Scanner  scanner = new Scanner(System.in);
	 System.out.println("������ѧ������");
	 int num = scanner.nextInt();
	 
	int[] num1 = new int[num]; 
	System.out.println("������ "+num+"��ѧ���ɼ�");
for(int i = 0; i<num1.length;i++) {
	num1[i]=scanner.nextInt();
}
	int num3 = 0 ;
	for(int i = 0; i<num1.length ;i++) {
		if(num3 < num1[i]) {
			num3 = num1[i];
		}
	}
	char arr;
	for(int i = 0; i<num1.length ;i++) {
		if(num3 - num1[i] <=10) {
			arr = 'A';
		}else if(num3 - num1[i] <=20) {
			arr = 'B';
		}else if (num3 - num1[i] <=30) {
			arr = 'C';
	}else{
		arr = 'D';
	}	
		System.out.println("ѧ������"+num+"ѧ��������"+num1[i]+"ѧ���ȼ�"+arr);
	}		
	}
	}

