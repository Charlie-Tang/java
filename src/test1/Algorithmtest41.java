package test1;

public class Algorithmtest41 {
	public static void main(String[] args) {
		
		Integer sum = 0,total = 0;		
		for(int i=1; i<9; i++){ 
			//最大位数为8位		
			if(i == 1 ){		
				total = 4;  
				// 1,3,5,7		
				}else if(i ==2){	
					total = total*7;	
					}
				else
					{			
						total *= 8; 	
						}		
			System.out.println("0~7组成" + i + "位数，有：" + total + "个");	
			sum += total;	
			}	
		System.out.println("总计为：" + sum);
			}


	}
