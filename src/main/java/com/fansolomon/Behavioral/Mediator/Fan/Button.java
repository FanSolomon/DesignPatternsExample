package com.fansolomon.Behavioral.Mediator.Fan;

public class Button {
    private Mediator mediator;

    public void press() {
        mediator.press();
    }

    // constructor, getters and setters

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }
}
