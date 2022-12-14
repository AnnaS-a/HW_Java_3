// Задача 3: Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList
                                    (9, 45, 1, 12, -5, 4, 1, 57, 6, 7, -8));
        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr.toString());
        System.out.println("Минимальное число списка: " + arr.get(0));

        System.out.println("Максимальное число списка: " + arr.get(arr.size() - 1));
        
        if (arr.size() %2 != 0) {
            System.out.println("Среднее число списка: " + arr.get(arr.size() / 2 + 0)); 
        } else {
            System.out.println("Средние числа списка: " + arr.get(arr.size() / 2 - 1) + " " +
                                 "и"+ " " + arr.get(arr.size() / 2));
        }
    }
}
