package ������ϰ;

import java.util.Scanner;

import org.junit.Test;


	public class Exercise {  
		@Test
	    public void main(String[] args) {  
	        System.out.println("������������");  
	        Scanner in = new Scanner(System.in);  
	        int row =(in.nextInt()+1)/2;    
	        //��ӡ�����ϰ벿��  
	        for (int i = 1; i <= row; i++) {  
	            //���ѭ�������ϰ벿������  
	            for (int j = i; j < row; j++) {  
	                //��һ����ƿհ׵ĵط�  
	                System.out.print(" ");  
	            }  
	            for (int k = 1; k <= 2 * i - 1; k++) {  
	                //���������ǵ�����  
	                System.out.print("*");  
	            }  
	            System.out.println();  
	        }  
	        //�������ӡͼ�Σ�����ӡ���ε��°벿��  
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
	


