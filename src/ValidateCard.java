import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateCard {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите номер карты: Пример 1234 1234 1234 1234");
            String cardNumber = sc.nextLine();
            System.out.println("Введите срок действия карты: Пример 02/99");
            String date = sc.nextLine();
            System.out.println("Введите CVV код: Пример 123");
            String CVV = sc.nextLine();
            System.out.println("Введите владельца карты: ");
            String owner = sc.nextLine();
            System.out.println("Введите вид карты: ");
            String kind = sc.nextLine();

            Pattern cardNumberPattern = Pattern.compile("([2-6]([0-9]{3}) ?)(([0-9]{4} ?){3})");
            Pattern datePattern = Pattern.compile("(0[1-9]|1[0-2])/([0-9]{2})");
            Pattern CVVPattern = Pattern.compile("[0-9]{3}");
            Pattern ownerPattern = Pattern.compile("\\w+");
            Pattern kindPattern = Pattern.compile("\\w+");


            Matcher cardNumberMarcher = cardNumberPattern.matcher(cardNumber);
            Matcher dateMatcher = datePattern.matcher(date);
            Matcher CVVMatcher = CVVPattern.matcher(CVV);
            Matcher ownerMatcher = ownerPattern.matcher(owner);
            Matcher kindMatcher = kindPattern.matcher(kind);

            if (cardNumberMarcher.matches() && dateMatcher.matches() && CVVMatcher.matches() && ownerMatcher.matches() && kindMatcher.matches()) {
                System.out.println("Данные карты валидны:\n" + "Номер карты: " + cardNumber + "\nСрок действия: " + date + "\nCVV код: " + CVV + "\nВладелец карты: " + owner + "\nВид карты: " + kind);
            } else {
                System.out.println("Данные карты не валидны");
            }

        }
    }

