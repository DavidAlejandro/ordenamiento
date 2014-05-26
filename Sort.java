package analisisalgoritmos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author David
 */
public class Sort {
    
    private String nombre;
    private static int[] a; 
    private static int n; 
    private static int left; 
    private static int right; 
    private static int largest;
    
    public void bubbleSort(int[] arr) {
      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {                                       
                  if (arr[i] > arr[i + 1]) {                          
                        tmp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
        }
    
    void insertionSort(int[] arr) {
      int i, j, newValue;
      for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                  arr[j] = arr[j - 1];
                  j--;
            }
            arr[j] = newValue;
      }
        }
    
    public void selectionSort(int[] arr) {
      int i, j, minIndex, tmp;
      int n = arr.length;
      for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                  if (arr[j] < arr[minIndex])
                        minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
            }
      }
}
    
    public static void mergeSort(int[] A) {
        if (A.length > 1) {
            int q = A.length/2;

            int[] leftArray = Arrays.copyOfRange(A, 0, q);
            int[] rightArray = Arrays.copyOfRange(A,q,A.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(A,leftArray,rightArray);
        }
    }

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;
        //int[] a = new int[totElem];
        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }}}
        
   public void radixsort(int[] input) {
  final int RADIX = 10;
  // declare and initialize bucket[]
  List<Integer>[] bucket = new ArrayList[RADIX];
  for (int i = 0; i < bucket.length; i++) {
    bucket[i] = new ArrayList<Integer>();
  }
 
  // sort
  boolean maxLength = false;
  int tmp = -1, placement = 1;
  while (!maxLength) {
    maxLength = true;
    // split input between lists
    for (Integer i : input) {
      tmp = i / placement;
      bucket[tmp % RADIX].add(i);
      if (maxLength && tmp > 0) {
        maxLength = false;
      }
    }
    // empty lists into input array
    int a = 0;
    for (int b = 0; b < RADIX; b++) {
      for (Integer i : bucket[b]) {
        input[a++] = i;
      }
      bucket[b].clear();
    }
    // move to next digit
    placement *= RADIX;
  }
}
   
    public static void buildheap(int []a){ 
        n=a.length-1; 
        for(int i=n/2;i>=0;i--){ 
            maxheap(a,i); 
        } 
    } 
    
    public static void maxheap(int[] a, int i){ 
        left=2*i; 
        right=2*i+1; 
        if(left <= n && a[left] > a[i]){ 
            largest=left; 
        } 
        else{ 
            largest=i; 
        } 
        
        if(right <= n && a[right] > a[largest]){ 
            largest=right; 
        } 
        if(largest!=i){ 
            exchange(i,largest); 
            maxheap(a, largest); 
        } 
    } 
    
    public static void exchange(int i, int j){ 
        int t=a[i]; 
        a[i]=a[j]; 
        a[j]=t; 
        } 
    
    public static void sort(int []a0){ 
        a=a0; 
        buildheap(a); 
        
        for(int i=n;i>0;i--){ 
            exchange(0, i); 
            n=n-1; 
            maxheap(a, 0); 
        } 
    } 
    
    
    //QUICKSORT
    
    int partition(int arr[], int left, int right)
{
      int i = left, j = right;
      int tmp;
      int pivot = arr[(left + right) / 2];
     
      while (i <= j) {
            while (arr[i] < pivot)
                  i++;
            while (arr[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
                  i++;
                  j--;
            }
      };
     
      return i;
}
 
public void quickSort(int arr[], int left, int right) {
      int index = partition(arr, left, right);
      if (left < index - 1)
            quickSort(arr, left, index - 1);
      if (index < right)
            quickSort(arr, index, right);
}

    
    
}
