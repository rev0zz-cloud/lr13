package lr13.tasks;


import java.util.InputMismatchException;
import java.util.Scanner;
//Задание 3
//В программе, вычисляющей сумму элементов типа byte одномерного массива, вводимого с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	ввод или вычисление значения за границами диапазона типа.

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array = null;
        int sum = 0;
        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            array = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Введите элемент " + (i + 1) + ": ");
                array[i] = scanner.nextByte();
                sum += array[i];
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенная строка не может быть преобразована в число типа byte");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: выход за пределы массива");
            return;
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: попытка деления на ноль");
            return;
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: неверный ввод");
            return;
        }
        if (array != null) {
            System.out.println("Сумма элементов массива: " + sum);
        }
    }
}