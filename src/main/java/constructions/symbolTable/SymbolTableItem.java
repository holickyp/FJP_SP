package constructions.symbolTable;


import constructions.enums.ReturnType;
import constructions.enums.VariableType;
import constructions.method.MethodParameters;

import java.util.List;

/**
 * Represent record in Symbol table
 */
public class SymbolTableItem
{
    /** identifier */
    private String name;

    /** level */
    private int level;

    /** address */
    private int address;

    /** size */
    private int size;

    /** je zaznam promenna? */
    private boolean isVariable = false;

    /** je zaznam konstantni? */
    private boolean isConstant = false;

    /** variable Type */
    private VariableType variableType = null;

    /** je zaznam metoda? */
    private boolean isMethod = false;

    /** method identifier */
    private String methodIdentifier = null;

    /** method return value */
    private ReturnType methodReturnType = null;

    /** method parameters */
    private List<MethodParameters> methodDeclarationParameters = null;

    public SymbolTableItem(String name, int level, int address, int size)
    {
        this.name = name;
        this.level = level;
        this.address = address;
        this.size = size;
    }

    @Override
    public String toString()
    {
        return "SymbolTableItem{" +
                "name='" + name +
                ", level=" + level +
                ", address=" + address +
                ", size=" + size +
                '}';
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getAddress()
    {
        return address;
    }

    public void setAddress(int address)
    {
        this.address = address;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public boolean isVariable()
    {
        return isVariable;
    }

    public boolean isMethod()
    {
        return isMethod;
    }

    public void setMethod(boolean method)
    {
        isMethod = method;
    }

    public boolean isConstant()
    {
        return isConstant;
    }

    public void setConstant(boolean constant)
    {
        isConstant = constant;
    }

    public VariableType getVariableType()
    {
        return variableType;
    }

    public void setVariableType(VariableType variableType)
    {
        this.variableType = variableType;
    }

    public void setIsVariable(boolean isVariable)
    {
        this.isVariable = isVariable;
    }

    public String getMethodIdentifier()
    {
        return methodIdentifier;
    }

    public void setMethodIdentifier(String methodIdentifier)
    {
        this.methodIdentifier = methodIdentifier;
    }

    public ReturnType getMethodReturnType()
    {
        return methodReturnType;
    }

    public void setMethodReturnType(ReturnType methodReturnType)
    {
        this.methodReturnType = methodReturnType;
    }

    public List<MethodParameters> getMethodDeclarationParameters()
    {
        return methodDeclarationParameters;
    }

    public void setMethodDeclarationParameters(List<MethodParameters> methodDeclarationParameters)
    {
        this.methodDeclarationParameters = methodDeclarationParameters;
    }
}
