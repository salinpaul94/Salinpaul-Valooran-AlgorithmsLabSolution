package service;

public class MergeSort{
	
	void merge(int[] arr, int left, int mid, int right) {
		int len1 = mid - left + 1;
		int len2 = right - mid;
		
		int[] leftArr = new int[len1];
		int[] rightArr = new int[len2];
		
		System.arraycopy(arr, left, leftArr, 0, len1);
		for(int j=0; j<len2; j++)
			rightArr[j] = arr[mid + 1 + j];
		
		int i, j, k;
		i = j = 0;
		k = left;
		
		while(i<len1 && j<len2) {
			if(leftArr[i]>=rightArr[j]) {
				arr[k]=leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<len1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(i<len1) {
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j<len2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(int[] arr, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			merge(arr, left, mid, right);
		}
	}
	
	static void display(int[] arr) {
		for(int j : arr) System.out.print(j + " ");
		System.out.println("\n");
	}
	
//	public static void main(String[] args) {
//		int[] arr = {6, 5, 12, 10, 9, 1, 8};
//		
//		MergeSort ob=new MergeSort();
//		
//		System.out.println("Original Array");
//		display(arr);
//		
//		ob.mergeSort(arr, 0, arr.length-1);
//		
//		System.out.println("Sorting Array");
//		display(arr);
//	}
}