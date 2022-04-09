package 线下练习;

import java.util.Arrays;

public class Arrays工具的使用 {

	public static void main(String[] args) {
             int[] arrays =new int [] {1,2,3,4,5,6};
             int[] arrays1 =new int [] {1,2,3,4,5,6};
             //输出数组信息
             System.out.println(Arrays.toString(arrays));
//二分查找	找不到返回负数；
int arr =	Arrays.binarySearch(arrays,  5);
	System.out.println(arr);
	
	//将数字进行填充；
	 Arrays.fill(arrays, 2);
	System.out.println(Arrays.toString(arrays));
	
	//对数组进行排序；
	Arrays.parallelSort(arrays);
	System.out.println(Arrays.toString(arrays));
	//比较两个数组；
	boolean arr4 = Arrays.equals(arrays, arrays1);
	System.out.println(arr4);
	}
}
