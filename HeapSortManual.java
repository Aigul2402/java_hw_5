import java.util.Arrays;
import java.util.Scanner;

public class HeapSortManual {

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как текущий
        int left = 2 * i + 1; // Левый потомок
        int right = 2 * i + 2; // Правый потомок

        // Если левый потомок больше, чем корень
        if (left < n && arr[left] > arr[largest])
            largest = left;

        // Если правый потомок больше, чем наибольший из найденных
        if (right < n && arr[right] > arr[largest])
            largest = right;

        // Если наибольший элемент не корень, меняем местами
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно вызываем heapify для поддерева
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            arr = new int[]{10, 7, 8, 9, 1, 5}; // Массив по умолчанию
            System.out.println("Используется массив по умолчанию:");
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        int n = arr.length;

        // Построение кучи (Heapify)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлечение элементов один за другим
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify для уменьшенной кучи
            heapify(arr, i, 0);
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива (или 0 для массива по умолчанию): ");
        int size = scanner.nextInt();

        if (size > 0) {
            int[] arr = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
            heapSort(arr);
        } else {
            heapSort(null);
        }
        scanner.close();
    }
}
