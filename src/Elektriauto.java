public class Elektriauto {
    private String automark;
    private double elektrikulu;
    private int laadimisaeg;
    private int sõiduulatus;
    private Elektrijaam elektrijaam;


    public Elektriauto(String automark, double elektrikulu, int laadimisaeg, int sõiduulatus, Elektrijaam elektrijaam) {
        this.automark = automark;
        this.elektrikulu = elektrikulu;
        this.laadimisaeg = laadimisaeg;
        this.sõiduulatus = sõiduulatus;
        this.elektrijaam = elektrijaam;
    }

    public int getLaadimisaeg() {
        return laadimisaeg;
    }

    public void setLaadimisaeg(int laadimisaeg) {
        if(laadimisaeg>0){
            this.laadimisaeg = laadimisaeg;
        }
    }

    public Elektrijaam getElektrijaam() {
        return elektrijaam;
    }

    public void setElektrijaam(Elektrijaam elektrijaam) {
        this.elektrijaam = elektrijaam;
    }

    public double maksumus100(){
        return elektrikulu * elektrijaam.getElektrihind();
    }

    public double maksumus(int teepikkus){
        return teepikkus*maksumus100()/100.0;
    }

    public double reisiKestus(int teepikkus, double keskmineKiirus){
        return (teepikkus/sõiduulatus)*laadimisaeg/60 + teepikkus/keskmineKiirus;
    }

    @Override
    public String toString() {
        return "Elektriauto: " +
                "automark = '" + automark + '\'' +
                ", elektrikulu100KmKohta = " + elektrikulu +
                ", laadimisaegMinutites = " + laadimisaeg +
                ", sõiduulatusKilomeetrites = " + sõiduulatus +
                ", elektrijaam = " + elektrijaam +
                ", maksumus 100 km kohta = " + maksumus100();
    }
}
