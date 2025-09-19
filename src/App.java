public class App {
    public static void run() {
        UserInput input = new UserInput();
        int[] subjectMarks;
        boolean isContinue;


        do {
            int numberOfSubject = input.numberOfSubjects();
            GetResult result = new GetResult(numberOfSubject);
            subjectMarks = result.setValue();

            Calculate calculate = new Calculate(subjectMarks);

            char raiting = calculate.total();
            System.out.println(raiting);

            isContinue = input.isContinue();
        } while (isContinue);
    }
}
