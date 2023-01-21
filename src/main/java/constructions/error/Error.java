package constructions.error;

/**
 * Struktura pro erorove hlasky
 */
public class Error {
    /**
     * Zprava erroru
     */
    private final String message;
    /**
     * Radka
     */
    private final int line;
    /**
     * Kod erroru
     */
    private final ErrorTypes errorCode;

    public Error(String message, int line, ErrorTypes errorCode) {
        this.message = message;
        this.line = line;
        this.errorCode = errorCode;

    }

    public int getErrorCode() {
        return this.errorCode.getCode();
    }

    @Override
    public String toString() {
        return "Line: " + line + " : " + message;
    }
}
