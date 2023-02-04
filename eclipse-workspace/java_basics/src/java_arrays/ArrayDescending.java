package java_arrays;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayDescending {
	
	public static Scanner input = new Scanner(System.in);
//	public static void main(String[] args) {
//		
//		ArrayDescending ad= new ArrayDescending();
//		ad.printArray();
//		
//		
////			for (int i = 0; i < myArray.length; i++) {
////				System.out.println("myArray[" + i + "] : " +myArray[i]);
////			}
//
//		
//	}
	public static int [] getIntegers() {
		
		System.out.println(" enter the elements : \r");
		int arraylength= input.nextInt();
		int [] myArray= new int[arraylength];
		System.out.println(" enter the elements in the array : \r");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]= input.nextInt();
			
		}
		return myArray;
		
		}
	public static  void printArray()
	{
		int[] printArray =ArrayDescending.getIntegers();

//		for (int i = 0; i < printArray.length; i++) {
//			System.out.println("printArray[" + i + "] : " +printArray[i]);
//		}
		int[] sortedArray=ArrayDescending.sortedArray(printArray);
		for (int i = 0; i < printArray.length; i++) {
			System.out.println("sortedArray[" + i + "] : " +sortedArray[i]);
		}
		
	}
	public static int[] sortedArray(int[] printArray) {
		//int length= printArray.length;
		boolean flag=true;
		int temp;
		
		int[] sortedArray=Arrays.copyOf(printArray, printArray.length);
		
		//int[] sortedArray= printArray;
		while (flag) {
		  flag = false;
		  for (int i = 0; i < sortedArray.length-1; i++) {
			  
			  if (sortedArray[i]<sortedArray[i+1]) { //50 40 150 
				temp=sortedArray[i];
				sortedArray[i]=sortedArray[i+1];
				sortedArray[i+1]=temp;
				flag= true;
			}
			
		 }
		}
		return sortedArray;
		}
	}
	

