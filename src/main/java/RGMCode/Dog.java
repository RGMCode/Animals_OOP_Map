package RGMCode;

public class Dog {
    private int id;
    private String name;
    private double shoulderHeight;
    private String food;

    public Dog(int id, String name, double shoulderHeight, String food) {
        this.id = id;
        this.name = name;
        this.shoulderHeight = shoulderHeight;
        this.food = food;
    }

    public Dog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getShoulderHeight() {
        return shoulderHeight;
    }

    public void setShoulderHeight(double shoulderHeight) {
        this.shoulderHeight = shoulderHeight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shoulderHeight=" + shoulderHeight +
                ", food='" + food + '\'' +
                '}';
    }
}
