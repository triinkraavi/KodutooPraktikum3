public class Isik {
    private String nimi;
    private double pikkus;
    private String isikukood;
    private double kaal;

    public Isik(String nimi, double pikkus, String isikukood, double kaal) {
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.isikukood = isikukood;
        this.kaal = kaal;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        if(pikkus > 0 && pikkus < 2.7){
            this.pikkus = pikkus;
        }
    }

    public String getIsikukood() {
        return isikukood;
    }

    public double getKaal() {
        return kaal;
    }

    public void setKaal(double kaal) {
        if(kaal > 0 && kaal < 635){
            this.kaal = kaal;
        }
    }

    @Override
    public String toString() {
        return "Isik: " +
                "nimi = " + nimi +
                ", pikkus = " + pikkus +
                ", isikukood = " + isikukood +
                ", kaal = " + kaal +
                ", suusa pikkus = " + suusaPikkus() +
                ", kehamassiindeks = " + bmi();
    }

    public double suusaPikkus() {
        return Math.round((pikkus + 0.15)*100.0)/100.0;
    }

    public double bmi(){
        return Math.round((kaal/Math.pow(pikkus, 2.0))*100.0/100.0);
    }

    public String misStiiliSuusadValiti (int paljuSuusadPikemadOn){
        if(paljuSuusadPikemadOn < 15 && paljuSuusadPikemadOn > -5){
            return "Valiti uisusuusad";
        }
        else if (paljuSuusadPikemadOn >= 15 && paljuSuusadPikemadOn <= 25){
            return "Valiti klassikalise tehnika suusad";
        }
        else if (paljuSuusadPikemadOn <= -5 && paljuSuusadPikemadOn >=-20){
            return "Valiti mäesuusad";
        }
        else{
            return "Valik on piiridest väljas";
        }
    }
}
