package lr13.examples;
///Пример 13. Пример работы с аргументами метода main.
public class Ex13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива = " + l);

            int h = 10 / l;
            args[l + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс не существует");
        }
    }
}


