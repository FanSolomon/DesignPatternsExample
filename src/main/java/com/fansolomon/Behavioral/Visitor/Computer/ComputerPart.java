package com.fansolomon.Behavioral.Visitor.Computer;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
