package oops;

public class car implements engine,Brake,Media{
    @Override
    public void brake() {

    }

    @Override
    public void start() {
        System.out.println("Started");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");

    }

    @Override
    public void acc() {
        System.out.println("acc");

    }
}
