package constructions.PL0;


import constructions.enums.MethodReturnTypes;
import constructions.enums.VariableTypes;
import constructions.method.MethodParameters;

import java.util.List;

public class Symbol {
    private String name;
    private int level;
    private int address;
    private int size;

    //variable
    private boolean isVariable = false;
    private boolean isConstant = false;
    private VariableTypes variableType = null;


    //method
    private boolean isMethod = false;
    private String methodIdentifier = null;
    private MethodReturnTypes returnType = null;
    private List<MethodParameters> methodParameters = null;


    public Symbol(String name, int level, int address, int size)  {
        this.name = name;
        this.level = level;
        this.address = address;
        this.size = size;
    }
}
