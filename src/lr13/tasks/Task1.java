package lr13.tasks;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

//Задание 1
//В программе, вычисляющей среднее значение среди положительных элементов одномерного массива (тип элементов int),
// вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	несоответствие числового типа данных;
//–	положительные элементы отсутствуют.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");

            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Отсутствуют положительные элементы в массиве");
            }

            double number = (double) sum / count;
            System.out.println("Среднее значение: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: массив не был инициализирован");
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: не были введены значения");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}