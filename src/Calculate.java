public class Calculate {
    private final int[] theArrayOfMarks;
    public Calculate(int[] theArrayOfMarks) {
        this.theArrayOfMarks = theArrayOfMarks;
    }

    public int sum(){
        int sum = 0;

        for (int mark : theArrayOfMarks) {
            sum += mark;
        }
        return sum;
    }

    public int average(int sum)  {
        return sum / theArrayOfMarks.length;
    }

    public char rang(int average) {
        if (average >= 80) return 'A';
        if (average >= 60 && average <= 79) return 'B';
        if (average >= 40 && average <= 59) return 'C';
        if (average < 40) return 'D';
        return 'S';
    }

    public char total(){
        int sum = 0;

        for (int mark : theArrayOfMarks) {
            sum += mark;
        }

        int average = sum / theArrayOfMarks.length;

        if (average >= 80) return 'A';
        if (average >= 60 && average <= 79) return 'B';
        if (average >= 40 && average <= 59) return 'C';
        if (average < 40) return 'D';
        return 'S';
    }
}
