package wk1_visitor.element;

import wk1_visitor.exception.ExceptionHandler;

import java.util.Iterator;

/**
 * Element interfaceを実装する抽象クラス
 */
public abstract class Entry implements Element {

    public abstract String getName(); // Nameを取得する

    public abstract int getSize(); // Sizeを取得する

    // add element
    public Entry add(Entry elementImpl) throws ExceptionHandler {
        throw new ExceptionHandler();
    }

    // create iterator
    public Iterator iterator() throws ExceptionHandler{
        throw new ExceptionHandler();
    }

    // toString name + size
    public String toString(){
        return getName() + " (size:" + getSize() + ")";
    }

}
