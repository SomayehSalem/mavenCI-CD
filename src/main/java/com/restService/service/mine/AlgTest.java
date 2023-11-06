package com.restService.service.mine;

import com.restService.utils.DateUtils;

/**
 * Created by EDW on 4/3/2021.
 */
public class AlgTest {

    /*
board = [
["H", "E", "L", "L", "O"],
["A", "B", "C", "D", "E"]
]
word = "HELLO"
*/
    public boolean solve(String[][] board, String word) {
        int n = word.length();
        if(n == 0) return false;
        int r = board.length;
        int c = board[0].length;

        if(n > r && n > c) return false;

        int rCounter = 0;
        int cCounter = 0;
        int wCounter = 0;
        while(rCounter < r && cCounter < c - n) {
            if(board[rCounter][cCounter].equals(String.valueOf(word.charAt(wCounter)))) {
                wCounter++;
                cCounter++;
            } else {
                if(cCounter + 1 < c - n) {
                    wCounter = 0;
                    cCounter++;
                } else {
                    rCounter = 0;
                    cCounter = 0;
                    wCounter = 0;
                }
            }
        }
        return wCounter == n;
    }


    public static void main(String args[]) {
//        String str = "14000123";
//        String gStr = DateUtils.persianToGregorian("14000123", "DD/MM/YYYY");
//        System.out.println(gStr);
//        long l1 = new Date().getTime();
//        int[] arr = new int[]{8, 5, 1, 4, 2};
//        int[] arr = new int[]{13,26,74,67,93,61,35, 8,6,18,19,15, 10};
//        printArr(arr);
//        System.out.println("*************start*************");
//        sort(arr);
//        long l2 = new Date().getTime();
//        printArr(arr);
//        System.out.println(arr);
//        System.out.println(l2 - l1);

        String s = "aaa";
        System.out.println(specialCount(s));
    }

    private static void sort(int[] arr) {
//        bubbleSort(arr);
//        insertionSort(arr);
//        int n = arr.length;
//        quickSort(arr, 0, n-1);

        int n = arr.length;
        divideAndSort(arr, 0, n - 1);
    }

    static void divideAndSort(int arr[], int low, int high) {

        int diff = high - low;

        if (diff == 0) {
            // what to do;
//            System.out.println(arr[low]);
        } else if (diff == 1) {
            if (arr[low] > arr[high]) {
                int t = arr[low];
                arr[low] = arr[high];
                arr[high] = t;
            }
//            System.out.println(arr[low] + "," + arr[high]);
        } else {
            int n = diff / 2;
            divideAndSort(arr, low, low + n);
            printArr(arr, low, low + n);

            divideAndSort(arr, low + n + 1, high);
            printArr(arr, low + n + 1, high);

            merge(arr, low, high, n);

            System.out.println("&&&&&&&&");
        }
//        printArr(arr);
    }

    private static void merge(int[] arr, int low, int high, int n) {
        //  divideAndSort(arr, low, low + n);
        //  divideAndSort(arr, low + n + 1, high);
        int[] lArr = new int[n + 1];
        int[] rArr = new int[high - low - n];
//        System.out.println("low is " + low + ", high is " + high + ", n is " + n + ". so length is "  + lArr.length);
//        System.out.println("low is " + low + ", high is " + high + ", n is " + n + ". so length is "  + rArr.length);
        int lCounter = 0;
        int rCounter = 0;

        for(int i = low; i <= high; i++) {
            if(i <= n) {
                lArr[lCounter] = arr[low + i];
                lCounter++;
            } else {
                if(i < rArr.length) {
                    rArr[rCounter] = arr[low + i];
                    rCounter++;
                }
            }
        }

        if(lArr[lArr.length - 1] < rArr[0]) {
            return;
        } else if (rArr[rArr.length - 1] < lArr[0]) {

        }
        printArr(lArr);
        printArr(rArr);
    }

    static int partition(int arr[], int low, int high) {
        System.out.println("******************");
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++; // increment index of smaller element
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            printArr(arr);


        }
        System.out.println("******************");
        printArr(arr);
        System.out.println("pivot position is " + (i + 1));
        int z = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = z;
        printArr(arr);
        return (i + 1);
    }

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[p] is now
            at right place */
            int pi = partition(arr, low, high);
            // Separately sort elements before
            // partition and after partition
//            printArr(arr);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            System.out.println("**********");
            System.out.println(i);
            for (int j = i - 1; j >= 0; j--) {

                System.out.println(j);
//                System.out.println(j + 1);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

                printArr(arr);
            }
            System.out.println("#############");
        }

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i);
            for (int j = 0; j < arr.length - i - 1; j++) {

//                System.out.println(j);
//                System.out.println(arr[j] + "," + arr[j + 1]);

                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                printArr(arr);
            }
//            printArr(arr);
        }
    }

    static void printArr(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (str.trim().length() != 0) {
                str = str + ", ";
            }
            str = str + arr[i];
        }
        System.out.println("{" + str + "}");
    }

    static void printArr(int[] arr, int low, int high) {
        String str = "";
        for (int i = low; i <= high; i++) {
            if (str.trim().length() != 0) {
                str = str + ", ";
            }
            str = str + arr[i];
        }
        System.out.println("{" + str + "}");
    }

    static long specialCount(String str) {
        long l = 0;
        char[] chr = str.toCharArray();

        int n = chr.length;
        int[] sameCountArr = new int[n];
        int i = 0;
        while (i < n){
            int sameCount = 1; //for chr[i]
            int j = i + 1;
            while (j < n) {
                if(chr[i] == chr[j]) {
                    sameCount++;
                    j++;
                } else {
                    break;
                }
            }
            sameCountArr[i] = sameCount;
            l += sameCount*(sameCount+1)/2;
        }

        for (int k = 0; k < n - 1; k++) {
            if(chr[k] != chr[k+1]){

            }
        }

        return l;
    }

}




