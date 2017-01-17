/**
 * Created by Greg on 17.01.2017.
 */
public class Cat {
    private String name;
    private double weigth;
    private String color;
    private int age;
    public Cat(){

    }

    public Cat(String name, double weigth, String color, int age) {
        this.name = name;
        this.weigth = weigth;
        this.color = color;
        this.age = age;
    }

    public void info(){
        System.out.print(this.toString());
    }
    public void sayHello(){
        System.out.print("Hello");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
