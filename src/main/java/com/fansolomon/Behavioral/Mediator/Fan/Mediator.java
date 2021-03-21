package com.fansolomon.Behavioral.Mediator.Fan;

public class Mediator {
    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }

    // constructor, getters and setters

    public Mediator() {
        this.button = new Button(this);
        this.fan = new Fan(this);
        this.powerSupplier = new PowerSupplier();
    }

    public Mediator(Button button, Fan fan, PowerSupplier powerSupplier) {
        this.button = button;
        this.fan = fan;
        this.powerSupplier = powerSupplier;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }
}
