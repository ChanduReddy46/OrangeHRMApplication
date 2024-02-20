 package com.Arrays;

public class ObjectArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Object Array - is capable of storing different dataType values
		 Syntax:-
		 object arrayName[] = new object[size];
		object arrayName[][] = new object[size][size];
*/
		
		Object array1[]=new Object[5];
		
		array1[0]=30;
		array1[1]="laddu";
		array1[2]='G';
		array1[3]=10.654;
		array1[4]=5.789f;
		
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);
		System.out.println(array1[4]);
		
		
		
			for(int index=0;index<array1.length;index++)
			{
			System.out.println(array1[index]);
			}


			System.out.println();
			System.out.println(" $$$$$$$$$ FOR Each Loop $$$$$$$$$$$$$$$$$$$$$ ");

			for(Object index:array1)
			{
			System.out.println(index);
			
			
			
		}
	}

}
