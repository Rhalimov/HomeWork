package main.java.oop1;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    boolean reduceFood(int foodQuantity) {
        if (foodQuantity > food) {
            return false;
        }
        food = food - foodQuantity;
        return true;
    }

    public void addFood(int foodQuantity) {
        food = food + foodQuantity;
    }

}
