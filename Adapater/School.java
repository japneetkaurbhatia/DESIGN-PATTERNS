public class School {
    public static void main(String[] args) {

        // PilotPen pp = new PilotPen();
        Pen p = new PenAdapter();
        Assigment assigment = new Assigment();  
        // assigment.setP(pp);
        assigment.setP(p);
        assigment.writeAssignment("Assignment is written");
    }
}
