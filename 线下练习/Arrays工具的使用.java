package ������ϰ;

import java.util.Arrays;

public class Arrays���ߵ�ʹ�� {

	public static void main(String[] args) {
             int[] arrays =new int [] {1,2,3,4,5,6};
             int[] arrays1 =new int [] {1,2,3,4,5,6};
             //���������Ϣ
             System.out.println(Arrays.toString(arrays));
//���ֲ���	�Ҳ������ظ�����
int arr =	Arrays.binarySearch(arrays,  5);
	System.out.println(arr);
	
	//�����ֽ�����䣻
	 Arrays.fill(arrays, 2);
	System.out.println(Arrays.toString(arrays));
	
	//�������������
	Arrays.parallelSort(arrays);
	System.out.println(Arrays.toString(arrays));
	//�Ƚ��������飻
	boolean arr4 = Arrays.equals(arrays, arrays1);
	System.out.println(arr4);
	}
}
