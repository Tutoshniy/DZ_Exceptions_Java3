public class PhoneCheck {
    public void check (String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Неверный ввод данных номера телефона");
        }
    }
}
