package lr13.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;
//Задание 2
//В программе, где требуется из матрицы вывести столбец с номером, заданным с клавиатуры, могут возникать ошибки в следующих случаях:
//–	ввод строки вместо числа;
//–	нет столбца с таким номером.
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            int[][] matrix = new int[rows+1][cols+1];

            System.out.println("Введите элементы матрицы:");
            for (int i = 1; i < rows+1; i++) {
                for (int j = 1; j < cols+1; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.print("Введите номер столбца: ");
            int column = scanner.nextInt();

            if (column < 1 || column >= cols+1) {
                throw new IllegalArgumentException("Столбца с номером " + column + " не существует");
            }

            System.out.println("Столбец " + column + ":");
            for (int i = 1; i < rows+1; i++) {
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}