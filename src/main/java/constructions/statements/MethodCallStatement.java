package constructions.statements;

import com.sun.org.apache.bcel.internal.classfile.MethodParameter;
import constructions.enums.MethodReturnTypes;

import java.util.List;

public class MethodCallStatement {
    private final String identifier;
    private List<MethodParameter> parameters;
    private MethodReturnTypes returnType;

    public MethodCallStatement(String identifier, List<MethodParameter> parameters, MethodReturnTypes returnType) {
        this.identifier = identifier;
        this.parameters = parameters;
        this.returnType = returnType;
    }
}
