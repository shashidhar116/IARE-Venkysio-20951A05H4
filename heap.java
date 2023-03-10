
class HSort {
	public void sort(int arr[])
	{
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)
			heap(arr, n, i);
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heap(arr, i, 0);
		}
	}
	void heap(int arr[], int n, int i)
	{
		int maxi = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2; 
		if (l < n && arr[l] > arr[maxi])
			maxi = l;
		if (r < n && arr[r] > arr[maxi])
			maxi = r;
		if (maxi != i) {
			int swap = arr[i];
			arr[i] = arr[maxi];
			arr[maxi] = swap;
			heap(arr, n, maxi);
		}
	}
	static void printArr(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Driver program
	public static void main(String args[])
	{
		int arr[] = {5,4,3,2,1};
		int n = arr.length;

		HSort ob = new HSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		printArr(arr);
	}
}
