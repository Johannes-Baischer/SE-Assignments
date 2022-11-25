package observer.exception;

public class UntrustedSourceException extends NewsSpreaderException {
	public UntrustedSourceException(String source) {
		super("untrusted source: " + source);
	}
}