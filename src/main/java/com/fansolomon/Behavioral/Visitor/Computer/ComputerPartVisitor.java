package com.fansolomon.Behavioral.Visitor.Computer;

import com.fansolomon.Behavioral.Visitor.Computer.impl.Computer;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Keyboard;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Monitor;
import com.fansolomon.Behavioral.Visitor.Computer.impl.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
