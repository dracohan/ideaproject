package test;
/**
 * @project: DataStructureAndAlgorithmAnalysis
 * @filename: BinarySearch.java
 * @version: 0.10
 * @author: JM Han
 * @date: 11:27 AM 5/16/2016
 * @comment: Test Purpose
 * @result:
 */

public class BinarySearch{
	public static final int NOT_FOUND = -1;
	public static int BinarySearchNonRecurse(int[] a, int t, int low, int high){
		while (low <= high){
			int mid = (low + high)/2;
			if(a[mid] < t)
				low = mid + 1;
			else if(a[mid] > t)
				high = mid - 1;
			else
				return mid;
		}
		return NOT_FOUND;

	}
	public static int BinarySearchRecurse(int[] a, int t, int low, int high){
		if (a[low] > t || a[high] < t)
			return NOT_FOUND;
		int mid = (low + high)/2;
		if(a[mid] < t)
			return BinarySearchRecurse(a, t, mid + 1, high);
		else if(a[mid] > t)
			return BinarySearchRecurse(a, t, low, mid - 1);
		else
			return mid;
	}
	public static void main(String[] args) {
		int[] a = {2,4,5,6,8,9,12,15,100,20000};
		int index = BinarySearchRecurse(a, 10, 0, a.length - 1);
		if(index != -1)
			System.out.println("Found at index:" + index);
		else
			System.out.println("Not found!");
	}
}
