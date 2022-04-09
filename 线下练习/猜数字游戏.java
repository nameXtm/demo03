package 线下练习;

import java.util.Scanner;

public class 猜数字游戏 {

	public static void main(String[] args) {
 double num =(double) (Math.random()*90+10);//生产随机数
 		System.out.println("请输入：");
		Scanner scanner = new Scanner(System.in);
//	double arr = scanner.nextInt();
//	if(arr == num) {
//		System.out.println("猜对啦10");
//	}
//	else {
//		System.out.println("猜错啦");		
//	}
		System.out.println(num);
	}
}
