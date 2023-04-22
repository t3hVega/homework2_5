public class Main {
    public static void main(String[] args) {
        try {
            NewUser.toRegister("User_123", "KeptS3cret","KeptS3cret");
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Получили wrongLoginException");
            wrongLoginException.printStackTrace();
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Получили wrongPasswordException");
            wrongPasswordException.printStackTrace();
        } finally {
            System.out.println("Конец");
        }
    }
}