public class TestIsik {
    public static void main(String[] args) {
        Isik isik1 = new Isik("Katrin Kaasik", 1.68, "47804130324", 60.6);
        Isik isik2 = new Isik("Indrek Iisak", 1.92, "36911210432", 121.6);
        System.out.println(isik1);
        System.out.println(isik2);
        isik1.setKaal(70.6);
        System.out.println(isik1);
        System.out.println(isik1.getNimi() + ": " + isik1.misStiiliSuusadValiti(15));
        System.out.println(isik2.getNimi() + ": " + isik2.misStiiliSuusadValiti(-17));

    }
}
