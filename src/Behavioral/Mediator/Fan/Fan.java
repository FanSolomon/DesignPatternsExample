package Behavioral.Mediator.Fan;

public class Fan {
    private Mediator mediator;
    private boolean isOn = false;

    public void turnOn() {
        // 这里通过mediator调用了powerSupplier的turnOn方法
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    // constructor, getters and setters

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}
