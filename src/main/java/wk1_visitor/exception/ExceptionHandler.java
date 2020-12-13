package wk1_visitor.exception;

public class ExceptionHandler extends RuntimeException {
    public ExceptionHandler() {
    }

    public ExceptionHandler(String msg) {
        super(msg);
    }
}
