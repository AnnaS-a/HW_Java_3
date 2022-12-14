// Задача 1: Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] myArr = {3,5,4,22,12,9,6,5,10};
        int[] sortArr = mergeSort(myArr);
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] mergeSort(int[] myArr) {
        int[] arrya1 = Arrays.copyOf(myArr, myArr.length);
        int[] arrya2 = new int[myArr.length];
        int[] sortArr = mergeSortInner(arrya1, arrya2, 0, myArr.length); 
        return sortArr;
    }

    public static int[] mergeSortInner(int[] arrya1, int[] arrya2, int left, int right) {
        if (left >= right - 1){
            return arrya1;
        }
        int middle = left + (right - left) / 2;                
        int[] sorted1 = mergeSortInner(arrya1, arrya2, left, middle);
        int[] sorted2 = mergeSortInner(arrya1, arrya2, middle, right);
        int index1 = left;
        int index2 = middle;
        int destIndex = left;
        int[] sortArr = sorted1 == arrya1 ? arrya2 : arrya1;
        while (index1 < middle && index2 < right) {
            sortArr[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            sortArr[destIndex++] = sorted1[index1++];
        }
        while (index2 < right) {
            sortArr[destIndex++] = sorted2[index2++];
        }
        return sortArr;
    }
}
