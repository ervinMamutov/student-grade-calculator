public class GetResult {
    private int[] subject;
    public GetResult(int numberOfSubjects)
    {
        subject = new int[numberOfSubjects];
    }
    public int[] setValue() {
        UserInput userInput = new UserInput();
        int grade = 0;
        for (int i = 1; i <= subject.length; i++) {
            System.out.print("Enter the grade for the " + i + " subject");
            subject[i] = userInput.setMark();
        }
        return subject;
    }


}

