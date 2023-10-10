package recursion;

import java.util.ArrayList;

public class Resursion {
	
	static int sumOfInt(int n) {
		if(n==0)return 0;
		
		return sumOfInt(n-1) + n;
	}
	
	static int factorial(int x) {
		if(x==1)return 1;
		
		return factorial(x-1) * x;
	}
	
	static int fibo(int n) {
		if(n==0  || n==1) return n;
		
		return fibo(n-1) + fibo(n-2);
	}
	
	static int sumOfDigits(int n) {
		if(n>0 && n<9)return n;
		
		return  sumOfDigits(n/10)+n%10; 
	}
	
	static int countNoDigits(int n) {
		if(n>=0 && n<=9)return 1;
		
		return countNoDigits(n/10) +1;

	}
	
	static int armstrongNo(int n) {
		if(n==0)return 0;
		
		 int armstrongNo = armstrongNo(n/10);
		 int last= n%10;
		 return armstrongNo + last*last*last;
	}
	
	
	static int maxArray(int []arr , int idx) {
		if(idx==arr.length -1) return arr[idx];//base case
		
		int maxArray = maxArray(arr, idx + 1);// recursive work
		
		if(maxArray <arr[idx])return arr[idx]; //self work
		
		return maxArray;
	}
	
	
	static int sumOfArray(int [] arr , int idx) {
		
		if(idx == arr.length-1) return arr[idx];
		
		int smallAns = sumOfArray(arr, idx + 1);
		
		return smallAns +  arr[idx];
	} 
	
	static boolean targetArray(int[] arr , int idx , int target) {
		if(idx == arr.length)  //return ( arr[idx]==target);
			return false;
		 
		if (arr[idx] == target) return true;
		
		return  targetArray(arr, idx + 1, target);	
	}
	
	static int targetArrayIndx(int[] arr , int idx , int target) {
		if(idx == arr.length) 	return -1;
		 
		if (arr[idx] == target) return idx;
		
		return  targetArrayIndx(arr, idx + 1, target);	
	}
	
	
	//return ArrayList of indices
	static ArrayList<Integer> search(int[] arr , int idx , int target) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if(idx == arr.length) return list;
		 
		if (arr[idx] == target) {
			list.add(idx);
		}
		
		ArrayList<Integer> arrayList = search(arr, idx +1, target);
		list.addAll(arrayList);
		return list;
		
	}

	//check if array is sorted or not
	static boolean isSorted(int[] arr , int idx) {
		if(idx < arr.length) return true;
	
		if(arr[idx] > arr[idx + 1]) return false;

		return isSorted(arr, idx+1);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sum of integers
		//System.out.println(sumOfInt(5));
		
		//factorial
		//System.out.println(factorial(5));
		
		//fibonacci series
//		for(int i =0 ; i <= 10 ; i++) {
//			System.out.print(fibo(i)+" ");
//		}
		
		//sum of digits
		//System.out.println(sumOfDigits(253));
		
		//count number of digits
		//System.out.println(countNoDigits(234));
		
//		int armstrongNo = armstrongNo(407);
//		if(armstrongNo ==407) System.out.println("it is armstrong number");
//		else System.out.println("it is not armstrong number");
		
		//max element in array
		int[] arr = {1,2,3,8,9}; //tips : aapp recursion se bolo hume 4 - 6 ke beech me se max laado  baqaqi ka kaam hum kardenge
		//System.out.println(maxArray(arr, 0));
		
		//sum of array
		//System.out.println(sumOfArray(arr, 0));
		
		//target array;
	   	//System.out.println(targetArray(arr, 0, 93));
		
		//prit index if target is present
		//System.out.println(targetArrayIndx(arr, 0, 9));
		
		//print lidt of indices;
//		ArrayList<Integer> search = search(arr, 0,7 );
//		for(int i : search) {
//			System.out.print(i +" " );
//		}
		
		//check if array is sorted or not
		System.out.println(isSorted(arr, 0));
		
	}

}
