public class App {
    public static void run() {
        UserInput input = new UserInput();
        int[] subjectMarks;
        boolean isContinue = false;

        do {
            int numberOfSubject = input.numberOfSubjects();
            GetResult result = new GetResult(numberOfSubject);
            subjectMarks = result.setValue();
            isContinue = input.isContinue();
        } while (!isContinue);
    }
}
