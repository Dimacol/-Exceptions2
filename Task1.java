//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        boolean valid;
        Float myNumber = null;
        String inputData;
        do {          
             System.out.print("Введите нномер: \t");
            try {
                inputData = scanner.nextLine();
                if (Float.parseFloat(inputData) > 0) {
                    myNumber = Float.parseFloat(inputData);
                    valid = true;
                } else {
                    System.out.println("Неправильный ввод!");
                    valid = false;
                }
            } catch (Exception ex) {
                valid = false;
            }
        } while (!valid);
        System.out.println("Все получилось!: " + myNumber);
    }
}