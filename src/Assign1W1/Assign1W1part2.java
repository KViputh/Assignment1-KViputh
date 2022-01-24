package Assign1W1;
public class Assign1W1part2 {
	static void HorizontalFlip(int[][] arr1) {
		int temp;
		System.out.println("----After Horizonal Flipping----");
		for(int i = 0; i < arr1.length; i++) { 
			for(int j = 0; j < arr1[i].length; j++) {
				temp = arr1[i][0];
				arr1[i][0] = arr1[i][2];
				arr1[i][2] = temp;
				System.out.print(arr1[i][j]);
				
			}
		System.out.println();
		}
			
	}
	static void VerticalFlip(int[][] arr2) {
		int temp;
		System.out.println("----After Vertical Flipping----");
		for(int i = 0; i < arr2.length; i++) { 
			for(int j = 0; j < arr2[i].length; j++) {
				temp = arr2[0][j];
				arr2[0][j] = arr2[2][j];
				arr2[2][j] = temp;
				System.out.print(arr2[i][j]);
				
			}
		System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[][] array1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};
		
		int[][] array2 = {
				{1, 1, 4, 4},
				{2, 2, 5, 5},
				{3, 3, 6, 6}};
		System.out.println("----Horizontal Flip---- ");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				System.out.print(array1[i][j]);
				}
			System.out.println();
			}
		HorizontalFlip(array1);
		
		System.out.println("\n"+"----Vertical Flip---- ");
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				System.out.print(array2[i][j]);
				}
			System.out.println();
			}
		VerticalFlip(array2);
	}
}
