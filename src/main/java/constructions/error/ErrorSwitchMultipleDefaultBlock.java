package constructions.error;

public class ErrorSwitchMultipleDefaultBlock extends Error {
    public ErrorSwitchMultipleDefaultBlock(int line) {
        super("Error in switch structure. Switch can contain only one default block.", line, ErrorTypes.ERROR_SWITCH_MULTIPLE_DEFAULT_BLOCK);
    }
}
