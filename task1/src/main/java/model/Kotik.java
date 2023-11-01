package model;

public class Kotik {
    private int prettiness;
    private String name;
    private double weight;
    private String meow;
    private int satietyLevel;
    private static int objExample;


    public Kotik() {
        this.satietyLevel = 5;
        objExample ++;
    }
    public Kotik(int prettiness, String name, double weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satietyLevel = 5;
        objExample++;
    }

    private boolean checkSatiety() {
        return satietyLevel > 0;
    }

    public boolean play() {
        if (checkSatiety()) {
            System.out.println("Кот " + name + " играет");
            satietyLevel--;
            return true;
        }
        return false;
    }

    public boolean sleep() {
        if (checkSatiety()) {
            System.out.println("Кот " + name + " спит");
            satietyLevel--;
            return true;
        }
        return false;
    }

    public boolean chaseMouse() {
        if (checkSatiety()) {
            System.out.println("Кот " + name + " гоняется за мышкой");
            satietyLevel--;
            return true;
        }
        return false;
    }

    public boolean wash(){
        if (checkSatiety()) {
            System.out.println("Кот " + name + " моется");
            satietyLevel--;
            return true;
        }
        return false;
    }

    public boolean couchSofa(){
        if (checkSatiety()) {
            System.out.println("Кот " + name + " дерет диван");
            satietyLevel--;
            return true;
        }
        return false;
    }

    public void eat(int satiety) {
        satietyLevel = satietyLevel + satiety;
        System.out.println("Увеличили сытость на " + satiety);
    }

    public void eat(int satiety, String foodName) {
        satietyLevel += satiety;
        System.out.println("Кот " + name + " был голоден и мы скормили ему " + foodName);
    }

    public void eat() {
        eat(5, "рыбу");
    }

    public int getPrettiness() {
        return prettiness;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getMeow() {
        return meow;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public static int getObjExample() {
        return objExample;
    }

    public void setKotik(int prettiness, String name, double weight, String meow){
        this.meow = meow;
        this.name = name;
        this.prettiness = prettiness;
        this.weight = weight;
    }

    public void liveAnotherDay() {
        System.out.println("Кот по имени " + name + ", " + "вес - " + weight + " кг.");
        for (int i = 0; i < 24; i++) {
            double a = (Math.random() * 5 + 1);
            int b = (int) a;
            switch (b) {
                case 1:
                    if (play()) {
                        continue;
                    }
                    break;
                case 2:
                    if (wash()) {
                        continue;
                    }
                    break;
                case 3:
                    if (sleep()) {
                        continue;
                    }
                    break;
                case 4:
                    if (chaseMouse()) {
                        continue;
                    }
                    break;
                case 5:
                    if (couchSofa()) {
                        continue;
                    }
                    break;
            }
            eat();
        }
    }


    public static void compare(String firstCat, String secondCat) {
        if (firstCat.equals(secondCat)) {
            System.out.println("Котики говорят на одном языке");
        }
        System.out.println("Котики говорят на разных языках");
    }
}