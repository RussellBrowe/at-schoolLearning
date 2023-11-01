import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik vasya = new Kotik(10, "vasya", 4.2, "meeeoww");
        Kotik kisa = new Kotik();
        kisa.setKotik(100, "kisa", 3.8, "meeeeeeeoooowwww");
        kisa.liveAnotherDay();
        Kotik.compare(kisa.getMeow(), vasya.getMeow());
        System.out.println("Создано " + Kotik.getObjExample() + " экземпляра класса Kotik");


    }
}
