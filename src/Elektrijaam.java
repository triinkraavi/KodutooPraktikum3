public class Elektrijaam {
    private double elektrihind;

    public Elektrijaam(double elektrihind) {
        this.elektrihind = elektrihind;
    }

    public double getElektrihind() {
        return elektrihind;
    }

    public void setElektrihind(double elektrihind) {
        this.elektrihind = elektrihind;
    }

    @Override
    public String toString() {
        return "Elektrihind: " + elektrihind;
    }
}
