package com.fansolomon.Behavioral.Visitor.Computer;

import com.fansolomon.Behavioral.Visitor.Computer.impl.Computer;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
