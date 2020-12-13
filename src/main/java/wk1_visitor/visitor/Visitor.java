package wk1_visitor.visitor;

import wk1_visitor.element.impl.Director;
import wk1_visitor.element.impl.File;

/**
 * Visitor抽象クラス
 */
public abstract class Visitor {
    // Fileクラスをvisitするメソッド
    public abstract void visit(File file);

    // Directorクラスをvisitするメソッド
    public abstract  void visit(Director director);
}
