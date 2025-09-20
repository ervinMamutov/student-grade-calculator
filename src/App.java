public class App {
    private final UserInput input;

    public App(UserInput input) {
        this.input = input;
    }
    public void run() {

        int numberOfSubject = input.numberOfSubjects();
        int[] theArrayOfMarks = new int[numberOfSubject];
        boolean isContinue;
        do {
            // GetResult result = new GetResult(numberOfSubject);
            for (int i = 0; i < numberOfSubject; i++) {

                System.out.print("Enter the grade for the " + (i + 1) + " subject: -> ");

                int mark = input.setMark();
                theArrayOfMarks[i] = mark;
            }

            Calculate calculate = new Calculate(theArrayOfMarks);
            char rating = calculate.total();
            System.out.println(rating);
            isContinue = input.isContinue();
        } while (isContinue);

        input.scannerClose();
    }
}