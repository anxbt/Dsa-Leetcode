package Leetcode;

import java.util.Arrays;

public class Merge_sorted_arrays {
    public static void main(String[] args) {
        int[]num1={1,2,3,0,0,0};
        int[]num2={2,5,6};
        int m=3;
        int n=3;
        int[] mergedarray=merge(num1,num2,m,n);
        System.out.println(Arrays.toString(mergedarray));
    }
    static int[] merge(int[]nums1,int[]nums2,int m,int n){
        int [] mix=new int[ m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if (nums1[i]<nums2[j]){
                mix[k]=nums1[i];
                i++;
            }
            else{
               mix[k]=nums2[j] ;
               j++;
            }
            k++;
        }
    // copy any remaining element
        while (i<m){
            mix[k]=nums1[i];
            i++;
            k++;
        }
        // Copy any remaining elements from nums2, if any
        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
     return mix;
    }
}
