public class Main {
    public static void main(String[] args) {
        int replenishment = 3000;
        boolean z = replenishment >= 1000;
        int reward;
        if (z) {
            reward = 1;
        } else {
            reward = 0;
        }
        int amount = 100;
        int bonus = (amount + replenishment) / 100;
        System.out.println(bonus);}}