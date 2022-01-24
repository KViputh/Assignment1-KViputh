package Assign1W1;
import java.util.Arrays;
public class Assign1W1 {
	static void orderEvenBeforeOdd(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i]+ ", ");}		
		}
		for(int j = 0; j < arr.length; j++)
			if(arr[j] % 2 == 1)
				System.out.print(arr[j]+ ", ");
		
	}
	public static void main(String[] args) {
		int[] array_1 = {1, 3, 5, 7, 9, 2, 4, 6, 8};
		System.out.println("The array before exection is: "+ Arrays.toString(array_1) );
		System.out.print("The array after excution is: " );
		orderEvenBeforeOdd(array_1);
		System.out.println();
		System.out.println("===================================");
		int[] array_2 = {2, 1, 6, 3, 5, 9};
		System.out.println("The array before exection is: "+ Arrays.toString(array_2)  );
		System.out.print("The array after excution is: ");
		orderEvenBeforeOdd(array_2);
		System.out.println();
	}
	
}
