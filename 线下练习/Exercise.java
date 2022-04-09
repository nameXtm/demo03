package 线下练习;

import java.util.Scanner;

import org.junit.Test;


	public class Exercise {  
		@Test
	    public void main(String[] args) {  
	        System.out.println("请输入行数：");  
	        Scanner in = new Scanner(System.in);  
	        int row =(in.nextInt()+1)/2;    
	        //打印菱形上半部分  
	        for (int i = 1; i <= row; i++) {  
	            //外层循环控制上半部分行数  
	            for (int j = i; j < row; j++) {  
	                //这一层控制空白的地方  
	                System.out.print(" ");  
	            }  
	            for (int k = 1; k <= 2 * i - 1; k++) {  
	                //这层控制星星的数量  
	                System.out.print("*");  
	            }  
	            System.out.println();  
	        }  
	        //反方向打印图形，即打印菱形的下半部分  
	        for (int i = row - 1; i >= 1; i--) {  
	            for (int j = 1; j <= row - i; j++) {  
	                System.out.print(" ");  
	            }  
	            for (int k = 2 * i - 1; k > 0; k--) {  
	                System.out.print("*");  
	            }  
	  
	        System.out.println();  
	        }  
	  
	  
	    }  
	}  
	


