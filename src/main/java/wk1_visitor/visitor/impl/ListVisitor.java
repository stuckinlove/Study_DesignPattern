package wk1_visitor.visitor.impl;

import wk1_visitor.element.impl.Director;
import wk1_visitor.element.Entry;
import wk1_visitor.element.impl.File;
import wk1_visitor.visitor.Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {

    private String currentDir = "";

    @Override
    public void visit(File file) {
        // fileを訪問する時に出力される。
        System.out.println(currentDir + "/" + file);
    }

    @Override
    public void visit(Director director) {
        // Dirを訪問する時に出力される。
        System.out.println(currentDir + "/" + director);

        String saveDir = currentDir;
        currentDir = currentDir + "/" + director.getName();
        Iterator dirIter = director.iterator();
        while (dirIter.hasNext()){
            Entry dir = (Entry) dirIter.next();
            dir.accept(this);
        }

        currentDir = saveDir;
    }
}
