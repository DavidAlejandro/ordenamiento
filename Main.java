/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisalgoritmos;

import java.util.Random;

/**
 *
 * @author David
 */
public class Main {
    
    public static void main(String args[]) 
    {
       //int arr[] = {4,1,6,2,8,19};
       
       Sort O = new Sort();
       
       
       Random randNumGenerator = new Random();
        int[] arr = new int[10];
        for (int i=0; i<arr.length; i++)
        {
               arr[i] = (randNumGenerator.nextInt(100)+1);
         }
       
       
       
       
       
       
       System.out.println("Desordenado");
       
       /* for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        long startTime = System.currentTimeMillis();
        //O.bubbleSort(arr);
        //O.insertionSort(arr);
        //O.mergeSort(arr);
        //O.radixsort(arr);
      // O.sort(arr);
        O.quickSort(arr, 0, arr.length-1);
        long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println(elapsedTime);
         System.out.println("Ordenado");
         /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
    }
    
}
