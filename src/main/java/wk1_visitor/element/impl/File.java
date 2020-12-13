package wk1_visitor.element.impl;

import wk1_visitor.element.Entry;
import wk1_visitor.visitor.Visitor;

public class File extends Entry {

    public String name;
    public int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // visitorへ自分自身のインスタンスを渡す
    }
}
