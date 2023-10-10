package patterns;

public class Patterns {
	
//	1  
//	1 2  
//	1 2 3  
//	1 2 3 4  
//	1 2 3 4 5  

	public static void pattern1(int n) {
		for(int i =1 ; i <= n ;i++) {
			for(int j =1 ; j <= i ; j++) {
				System.out.print(j +" ");
			}
			System.out.println(" ");
		}
	}
	
//	5 4 3 2 1  
//	4 3 2 1  
//	3 2 1  
//	2 1  
//	1  

	public static void pattern2(int n) {
		for(int i =0 ; i < n ;i++) {
			for(int j =n-i ; j >0 ; j--) {
				System.out.print(j +" ");
			}
			System.out.println(" ");
		}
	}
	
//       1  
//     1 2   
//   1 2 3  
// 1 2 3 4  
//1 2 3 4 5  
	static void pattern3(int n) {
		for(int i = 1 ; i<=n ; i++) {
			for(int j =n-i ; j>0 ; j--) {
				System.out.print("  ");
			}
			for(int k =1 ; k<=i ; k++) {
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
		
	}
	
//    * 
//    * * * 
//  * * * * * 
//* * * * * * * 
//* * * * * * * * * 
//* * * * * * * 
//  * * * * * 
//    * * * 
//      * 

	
	static void print4(int n) {
		for(int i =1 ; i <=2*n ; i ++) {
			
			int spaces= (i<=n)? n-i : i-n;
			
			for(int j = 0 ; j< spaces ; j++) {
				System.out.print("  ");
			}
			
			int stars = (i <= n) ? i : (n-spaces)  ;
			
			for(int k = 1 ; k<= stars ; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	
	
//	static void printDiamond(int n) {
//	    for (int i = 1; i <= 2 * n - 1; i++) {
//	        int spaces = Math.abs(n - i);
//	        
//	        // Print leading spaces
//	        for (int j = 0; j < spaces; j++) {
//	            System.out.print("  ");
//	        }
//
//	        // Print stars
//	        for (int k = 0; k < 2 * (n - spaces) - 1; k++) {
//	            System.out.print("* ");
//	        }
//
//	        // Move to the next line
//	        System.out.println();
//	    }
//	}
	
	public static void printMultiple(int n , int q) {
		if (q==1) {
			System.out.print(n);
			return;
		}
		printMultiple(n, q-1);
		System.out.print(", "+n*q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pattern1(5);
		//pattern2(5);
		//pattern3(5);
		//printDiamond(5);
		//print4(5);
		 
		printMultiple(12, 5);
	}

}
