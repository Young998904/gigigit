class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car casper = new Car();

        bmw.maxSpeed = 230;
        casper.maxSpeed = 210;

        bmw.run();
        casper.run();
    }
}
class Car {
    int maxSpeed;
    void run() {
        int maxSpeed = 250;
        System.out.println("자동차가 최고속력 "+ maxSpeed + "km로 달립니다.");
        System.out.println("자동차가 최고속력 "+ this.maxSpeed + "km로 달립니다.");
    }
}