package com.fansolomon.Behavioral.Visitor.Computer;

import com.fansolomon.Behavioral.Visitor.Computer.impl.Computer;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Keyboard;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Monitor;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
