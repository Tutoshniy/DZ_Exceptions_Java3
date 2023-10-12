public class BirthdayCheck {
    public void check(String s) {
        String[] data = s.split("\\.");
        if (data.length != 3 || data[0].length()!= 2 || data[1].length()!=2 || data[2].length()!=4) {
            throw new RuntimeException("Неправильный формат ввода даты. Правильный формат: dd.mm.yyyy");
        }
        try {
            int day = Integer.parseInt(data[0]);
            if (day <= 0 || day >= 32) {
                throw new RuntimeException("Такого дня рождения не существует");
            }
            int month = Integer.parseInt(data[1]);
            if (month <= 0 || month >= 12) {
                throw new RuntimeException("Такого месяца рождения не существует");
            }
            int year = Integer.parseInt(data[2]);
            if (year <= 1995 || year >= 2024) {
                throw new RuntimeException("Человека такого возраста не существует.");
            }
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неправильный тип данных у даты. Нужно вводить целые числа.");
        }
    }
}
