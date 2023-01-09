package constructions.method;

import constructions.enums.MethodReturnTypes;

import java.util.List;

public class MethodCall {

    private  String methodName;
    private MethodReturnTypes returnType;
    private List<MethodCallParameters> methodParameters;

    public MethodCall(String identifier)
    {
        this.methodName = identifier;
    }

    public MethodCall(String identifier, List<MethodCallParameters> parameters)
    {
        this.methodName = identifier;
        this.methodParameters = parameters;
    }

    public MethodCall(String identifier, MethodReturnTypes expectedReturnType)
    {
        this.methodName = identifier;
        this.returnType = expectedReturnType;

    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public MethodReturnTypes getReturnType() {
        return returnType;
    }

    public void setReturnType(MethodReturnTypes returnType) {
        this.returnType = returnType;
    }

    public List<MethodCallParameters> getMethodParameters() {
        return methodParameters;
    }

    public void setMethodParameters(List<MethodCallParameters> methodParameters) {
        this.methodParameters = methodParameters;
    }
}
