package wk1_visitor.element;

import wk1_visitor.visitor.Visitor;

/**
 * Element Interface
 * Visitorが訪問するインタフェース
 */
public interface Element {
    // Visitorを受け取るメソッド
    public abstract void accept(Visitor visitor);
}
