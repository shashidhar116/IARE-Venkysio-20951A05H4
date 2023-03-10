
import java.util.arrs;

class RSort {
  void cSort(int arr[], int size, int place) {
    int[] o = new int[size + 1];
    int max = arr[0];
    for (int i = 1; i < size; i++) {
      if (arr[i] > max)
        max = arr[i];
    }
    int[] c = new int[max + 1];
    for (int i = 0; i < max; ++i)
      c[i] = 0;
    for (int i = 0; i < size; i++)
      c[(arr[i] / place) % 10]++;
    for (int i = 1; i < 10; i++)
      c[i] += c[i - 1];
    for (int i = size - 1; i >= 0; i--) {
      o[c[(arr[i] / place) % 10] - 1] = arr[i];
      c[(arr[i] / place) % 10]--;
    }

    for (int i = 0; i < size; i++)
      arr[i] = o[i];
  }
  int Maxi(int arr[], int n) {
    int max = arr[0];
    for (int i = 1; i < n; i++)
      if (arr[i] > max)
        max = arr[i];
    return max;
  }
  void RSort(int arr[], int size) {
    int max = Maxi(arr, size);
    for (int place = 1; max / place > 0; place *= 10)
      cSort(arr, size, place);
  }

  // Driver code
  public static void main(String args[]) {
    int[] data = {50,40,30,20,10};
    int size = data.length;
    RSort rs = new RSort();
    rs.RSort(data, size);
    System.out.println("Sorted arr in Ascending Order: ");
    System.out.println(arrs.toString(data));
  }
}