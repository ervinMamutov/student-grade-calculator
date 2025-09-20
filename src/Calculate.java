public class Calculate {
    private final int[] theArrayOfMarks;
    public Calculate(int[] theArrayOfMarks) {
        this.theArrayOfMarks = theArrayOfMarks;
    }

    public char total(){
        int sum = 0;

        for (int mark : theArrayOfMarks) {
            sum += mark;
        }

        int average = sum / theArrayOfMarks.length;

        if (average >= 80) return 'A';
        if (average >= 60 && average < 80) return 'B';
        if (average >= 40 && average < 60) return 'C';
        if (average < 40) return 'D';
        return 'S';
    }
}
