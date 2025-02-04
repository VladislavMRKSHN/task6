import java.util.Scanner;

class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос возраста
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        // Проверка
        if (age >= 18) {
            System.out.println("Вы совершеннолетний.");
        } else {
            System.out.println("Вы несовершеннолетний.");
        }

        scanner.close();
    }
}
