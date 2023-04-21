public class Main {
    public static void toRegister (String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException{
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
    }
    public static void checkNewUser(String login, String password, String confirmPassword) {
        try {
            toRegister(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Длина логина превышает 20 символов");
        } catch (WrongPasswordException e) {
            System.out.println("Пароли не совпадают");
        } finally {
            System.out.println("Конец");
        }
    }

    public static void main(String[] args) {
        checkNewUser("User_123", "KeptS3cret","KeptS3cret");
    }
}