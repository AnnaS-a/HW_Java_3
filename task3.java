// Задача 3: Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее из этого списка.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList
                                    (9, 45, 1, 12, -5, 4, 1, 57, 6, 7));
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list.toString());
        System.out.println("Минимальное число списка: " + list.get(0));

        System.out.println("Максимальное число списка: " + list.get(list.size() - 1));
        
        int n = Integer.valueOf(list.size());
        System.out.println("Размер списка равен: " + n);

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i); 
        }  
        System.out.println("Среднее арифметическое: " + sum / list.size()); 
    }
}
