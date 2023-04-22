import java.util.regex.Pattern;

public class NewUser {
    public static void toRegister(String login, String password, String confirmPassword) {

        if (!Pattern.matches("^[A-Za-z0-9_]{1,19}$", login)) {
            throw new WrongLoginException("Неверный формат логина");
        }
        if (!Pattern.matches("^[A-Za-z0-9_]{1,19}$", password)) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

    }
}
