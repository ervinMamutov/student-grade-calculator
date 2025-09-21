public class Calculate {
    private final int[] theArrayOfMarks;
    public Calculate(int[] theArrayOfMarks) {
        this.theArrayOfMarks = theArrayOfMarks;
    }

    public String total(){
        int sum = 0;

        for (int mark : theArrayOfMarks) {
            sum += mark;
        }

        int average = sum / theArrayOfMarks.length;
        char rang = 'S';

        switch (average/10) {
            case 8, 9, 10 -> rang ='A';
            case 6, 7 -> rang = 'B';
            case 4, 5 -> rang = 'C';
            case 1, 2, 3 -> rang = 'D';
            default -> rang = 'F';
        }
        return "Your total marks is " + sum + " you average is " + average + " your rating " + rang + "!";
    }
}
