package com.fansolomon.Behavioral.Visitor.Computer.impl;

import com.fansolomon.Behavioral.Visitor.Computer.ComputerPart;
import com.fansolomon.Behavioral.Visitor.Computer.ComputerPartVisitor;

public class Monitor  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
