package arrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"Hello","world","this","is","java"};
		
		//2. print the third element in the array
		System.out.println(arr[3]);
		//3. set the third element to a different value
		arr[3]="Hello";
		//4. print the third element again
		System.out.println(arr[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] intArr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		for(int i =0;i<intArr.length;i++) {
			intArr[i]=(int)(Math.random()*50);
			if(intArr[i]<smallest)
				smallest = intArr[i];
			if(intArr[i]>largest)
				largest = intArr[i];
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("SMALLEST:"+smallest);
		//9 print the entire array to see if step 8 was correct
		for(int ii:intArr) {
			System.out.println(ii);
		}
		//10. print the largest number in the array.
			System.out.println("LARGEST:" + largest);
	}
}
