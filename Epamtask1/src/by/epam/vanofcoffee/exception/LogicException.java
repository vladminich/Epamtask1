package by.epam.vanofcoffee.exception;

@SuppressWarnings("serial")
public class LogicException extends Exception {

    public LogicException() {
	super();
    }

    public LogicException(String msg, Throwable e) {
	super(msg, e);
    }

    public LogicException(String msg) {
	super(msg);
    }

    public LogicException(Throwable e) {
	super(e);
    }
}
