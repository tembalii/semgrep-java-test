public class CommandInjection {
    public static void main(String[] args) throws Exception {
        String userInput = "ls";
        Runtime.getRuntime().exec(userInput);
    }
}
