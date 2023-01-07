package constructions;

import constructions.enums.MethodReturnTypes;

import java.util.List;

public class Method {
    private final String methodName;
    private final MethodReturnTypes returnType;
    private final List<MethodParameters> methodParameters;
    private final BlockStatement methodBody;
    private final Expression returnValue;

    public Method(String methodName, MethodReturnTypes returnType, List<MethodParameters> methodParameters, BlockStatement methodBody, Expression returnValue) {
        this.methodName = methodName;
        this.returnType = returnType;
        this.methodParameters = methodParameters;
        this.methodBody = methodBody;
        this.returnValue = returnValue;
    }
}
