public class TestRaamat {
    public static void main(String[] args) {
        Isik luts = new Isik("Oskar Luts", 1.69,"34509123212", 79.6);
        Raamat raamat1 = new Raamat(luts, "Kevade");
        System.out.println(raamat1);


    }
}
