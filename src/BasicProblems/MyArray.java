package BasicProblems;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}
	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3
	public int iterativeLinearSearch(int target) {

		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
	// Output: -1
	public int recursiveLinearSearch(int target) {
		return helpRacrsiveLinearSearch(target, 0);
	}
	public int helpRacrsiveLinearSearch(int target, int n) {
		if (this.array[n] == target) {
			return n;
		}
		if (n == this.array.length - 1) {
			return -1; // truong hop khong tim thay
		}
		return helpRacrsiveLinearSearch(target, n + 1);
	}
	// To find the index of the target in the sorted array. If the
	// target is not found in the array, then the method returns -1.
	public int iterativeBinarySearch(int target) {
		int left = 0;
		int right = this.array.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;

			if (this.array[mid] == target) {
				return mid;
			} else if (this.array[mid] > target) {
				right = mid - 1;

			} else {
				left = mid + 1;
			}
		}
		return -1;

	}
	// To find the index of the target in the sorted array. If the
	// target is not
	// found in the array, then the method returns -1.

	public int recursiveBinarySearch(int target) {

		return helpiterativeBinarySearch(target, array.length - 1,0);
	}

	public  int helpiterativeBinarySearch(int target, int right, int left) {

		if(left > right) {
			return -1;
		}else {
			int mid = (left + right)/2;
			if(target == this.array[mid]) {
				return mid;
			}else if( target< this.array[mid]) {
				return helpiterativeBinarySearch(target,right=mid-1,left);
				
			}else 
				return helpiterativeBinarySearch(target,right,left= mid+1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		MyArray myArray = new MyArray(arr);
		System.out.println(myArray.recursiveBinarySearch(2));
	
	}

}
