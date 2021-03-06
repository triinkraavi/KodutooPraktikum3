public class TestElektriauto {
    public static void main(String[] args) {
        Elektrijaam elektrijaam = new Elektrijaam(0.15);


        Elektriauto elektriauto1 = new Elektriauto("Mia Electric", 10, 180, 80, elektrijaam);
        Elektriauto elektriauto2 = new Elektriauto("Nissan Leaf", 18.5, 450, 270,elektrijaam);
        System.out.println(elektriauto1);
        System.out.println(elektriauto2);
        System.out.println(elektriauto1.maksumus100());
        System.out.println(elektriauto2.maksumus100());
        System.out.println(elektriauto1.maksumus(200));
        System.out.println(elektriauto2.maksumus(200));
        System.out.println(elektriauto1.reisiKestus(100, 100));
        System.out.println(elektriauto2.reisiKestus(100, 100));
    }
}
