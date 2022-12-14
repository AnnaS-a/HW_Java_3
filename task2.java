// Задача 2: Пусть дан произвольный список целых чисел, удалить из него четные числа
import java.util.ArrayList;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 15; i > 0; i--) {
            arr.add(new Random().nextInt(100));
        }
        System.out.println(arr);

        arr.removeIf(i -> (i % 2 == 0));
        System.out.println("Новый список: " + arr.toString());
    }
}
