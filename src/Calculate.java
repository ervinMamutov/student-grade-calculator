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
        if (average >= 80) rang = 'A';
        if (average >= 60 && average < 80) rang = 'B';
        if (average >= 40 && average < 60) rang = 'C';
        if (average > 0 && average < 40) rang = 'D';


        return "Your total marks is " + sum + " you average is " + average + " your raiting " + rang + "!";
    }
}
