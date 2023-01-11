package constructions.method;


import constructions.enums.ReturnType;
import constructions.enums.VariableType;

public class MethodPrototype
{
    /**
     * Method name
     */
    private String name;

    /**
     * Method parameters
     */
    private ReturnType methodReturnType;

    public MethodPrototype(String name, ReturnType methodReturnType)
    {
        this.name = name;
        this.methodReturnType = methodReturnType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ReturnType getMethodReturnType()
    {
        return methodReturnType;
    }

    public void setMethodReturnType(ReturnType methodReturnType)
    {
        this.methodReturnType = methodReturnType;
    }

    public VariableType convertReturnTypeToVariableType()
    {
        if (this.methodReturnType == ReturnType.INT)
        {
            return VariableType.INT;
        }
        else if (this.methodReturnType == ReturnType.BOOLEAN)
        {
            return VariableType.BOOLEAN;
        }

        return null;
    }
}
