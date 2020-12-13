package wk1_visitor.element.impl;


import wk1_visitor.element.Entry;
import wk1_visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Director extends Entry {

    private String name;
    private List dirList = new ArrayList();

    public Director(String name) {
        this.name = name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator dirIter = dirList.iterator();
        while (dirIter.hasNext()){
            Entry dir = (Entry) dirIter.next();
            size += dir.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry element){
        dirList.add(element);
        return this;
    }

    @Override
    public Iterator iterator() {
        return dirList.iterator();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
