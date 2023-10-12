import javax.xml.datatype.DatatypeConstants;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        if (data.length != 6) {
            throw new dataLengthException();
        }
        String lastName = data[0];
        String firstName = data[1];
        String middleName = data[2];

        BirthdayCheck BCheck = new BirthdayCheck();
        BCheck.check(data[3]);
        String birthday = data[3];

        PhoneCheck PCheck = new PhoneCheck();
        PCheck.check(data[4]);
        String phone = data[4];

        String gender;
        if (Objects.equals(data[5], "m") || Objects.equals(data[5], "f")) {
            gender = data[5];
        } else {
            throw new RuntimeException("Неправильный формат ввода пола");
        }

        SaveToFile Saver = new SaveToFile();
        Saver.Save(lastName, firstName, middleName, birthday, phone, gender);
    }
}