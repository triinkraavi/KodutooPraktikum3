public class Raamat {
    private Isik autor;
    private String pealkiri;

    public Raamat(Isik autor, String pealkiri){
        this.autor = autor;
        this.pealkiri = pealkiri;
    }

    @Override
    public String toString() {
        return "Autor: " + autor + ", pealkiri: " + pealkiri;
    }
}
