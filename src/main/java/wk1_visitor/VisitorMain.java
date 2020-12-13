package wk1_visitor;

import wk1_visitor.element.impl.Director;
import wk1_visitor.element.impl.File;
import wk1_visitor.exception.ExceptionHandler;
import wk1_visitor.visitor.impl.ListVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        try{

            System.out.println("Making root entries...");
            Director rootDir = new Director("root");
            Director binDir = new Director("bin");
            Director tmpDir = new Director("tmp");
            Director userDir = new Director("user");

            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(userDir);

            binDir.add(new File("vi", 10000));
            binDir.add(new File("latex", 20000));

            rootDir.accept(new ListVisitor());
            System.out.println();

            Director kebin = new Director("kebin");
            Director louis = new Director("louis");
            Director suzan = new Director("suzan");

            userDir.add(kebin);
            userDir.add(louis);
            userDir.add(suzan);

            kebin.add(new File("diary.html", 100));
            kebin.add(new File("composit.java", 200));
            louis.add(new File("memo.tex", 300));
            suzan.add(new File("game.doc", 400));
            suzan.add(new File("junk.mail", 500));

            rootDir.accept(new ListVisitor());

        }catch (ExceptionHandler e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
