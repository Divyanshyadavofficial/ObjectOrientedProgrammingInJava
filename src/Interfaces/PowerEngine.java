package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerate");
    }
}
