package ÏßÏÂÁ·Ï°;



//public class Ã°ÅİÅÅĞò {
//	public static void main(String[] args) {
//		
//		 int[] add1 = new int[] {80,5,9,6,7,8,20};
//		
//		for (int i = 0; i < add1.length-1; i++) {
//			for(int j = 0; j< add1.length-1-i;j++) {
//				if(add1[j] > add1[j+1]) {
//					int num = add1[j+1];
//					add1[j+1] = add1[j];
//					add1[j] = num;
//					
//				}
//				
//			}
//			System.out.println(add1[i]);
//		}
//			
//	}
//	
//}

class add{
	public static void main(String[] args) {
	
		 int[] add1 = new int[] {80,5,9,6,7,8,20};
			
			for (int i = 0; i < add1.length-1; i++) {
				for(int j = 0; j< add1.length-1-i;j++) {
					if(add1[j] > add1[j+1]) {
						int num = add1[j+1];
						add1[j+1] = add1[j];
						add1[j] = num;
						
					}
					
				}
				System.out.println(add1[i]);
			}
				
		}
	}
