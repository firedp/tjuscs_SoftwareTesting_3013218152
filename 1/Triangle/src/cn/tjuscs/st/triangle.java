package cn.tjuscs.st;

public class triangle {
	private static int error = 0;
	private static int equilateral = 1;
	private static int isosceles = 2;
	private static int scalene = 3;
	

   
	public static int triangletype(int a,int b, int c){
    	if(a <= 0 || b <= 0 || c <= 0){
    		 return 0; 
    	}else if(a + b > c && a + c > b && b + c > a){
    	
    	if ( a == b && b == c){
    		System.out.println("This is a equilateral triangle.");
    		return 1;  
    	}else if (a == b || a == c || b == c){
    		System.out.println("This is a isosceles triangle.");
    		 return 2;
    	}else {
    		System.out.println("This is a scalene triangle.");
    		return 3;
    	}
    	}else{
   		 return 0; 
   	}
    }
    	
}