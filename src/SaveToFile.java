import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveToFile {
    public void Save(String lastName, String firstName, String middleName, String Birthdate, String Phone, String Gender) {
        String Filename = lastName + ".txt";
        File file = new File(Filename);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, middleName, Birthdate, Phone, Gender));
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи в файл");
        }
    }
}
