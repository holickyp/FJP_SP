package constructions.method;

import constructions.Block;
import constructions.Expression;
import constructions.enums.MethodReturnTypes;

import java.util.List;

public class Method {
    private  String methodName;
    private  MethodReturnTypes returnType;
    private  List<MethodParameters> methodParameters;
    private  Block methodBody;
    private  Expression returnValue;

    public Method(String methodName) {
        this.methodName = methodName;
    }

    public Method(String methodName, MethodReturnTypes returnType, List<MethodParameters> methodParameters, Block methodBody, Expression returnValue) {
        this.methodName = methodName;
        this.returnType = returnType;
        this.methodParameters = methodParameters;
        this.methodBody = methodBody;
        this.returnValue = returnValue;
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

    public List<MethodParameters> getMethodParameters() {
        return methodParameters;
    }

    public void setMethodParameters(List<MethodParameters> methodParameters) {
        this.methodParameters = methodParameters;
    }

    public Block getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(Block methodBody) {
        this.methodBody = methodBody;
    }

    public Expression getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Expression returnValue) {
        this.returnValue = returnValue;
    }
}
