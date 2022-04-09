package 线下练习;

import java.util.Scanner;

public class A11月7日 {

	public static void main(String[] args) {
	 Scanner  scanner = new Scanner(System.in);
	 System.out.println("请输入学生人数");
	 int num = scanner.nextInt();
	 
	int[] num1 = new int[num]; 
	System.out.println("请输入 "+num+"个学生成绩");
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
		System.out.println("学生人数"+num+"学生人呢数"+num1[i]+"学生等级"+arr);
	}		
	}
	}

