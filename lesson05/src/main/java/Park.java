package main.java;

public class Park {

    static class Attraction {

        private String name;
        private String workTime;
        private int price;

        public Attraction(String name, String workTime, int price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workTime='" + workTime + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}
