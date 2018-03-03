package comp1110.homework.O01;

public class BMI {
    private String name;
    private double height;
    private double weight;

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }


    public double getBMI() {
        double bi = weight / (height * height);
        return bi;
    }

    @Override
    public String toString() {
        return name + " is " + height + "m tall and is " + weight + "Kg and has a BMI of " + getBMI() + "Kg/m^2";
    }

    public static void main(String[] args) {
        BMI Danny = new BMI("Danny",170,60);
        System.out.println(Danny.toString());
    }
}

