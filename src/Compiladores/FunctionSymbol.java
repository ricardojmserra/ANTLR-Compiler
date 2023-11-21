package Compiladores;

import java.util.ArrayList;
import java.util.List;

public class FunctionSymbol extends Symbol {

    public List<Symbol> arguments;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof FunctionSymbol))
            return false;
        return this.name.equals(  ((FunctionSymbol)obj).name  );
    }

    public FunctionSymbol(String type, String functionName)
    {
        super(type,functionName);
        this.arguments = new ArrayList<Symbol>();
    }

    public String toString()
    {
        return "#F#" + name + ":" + this.type + this.arguments.toString();
    }
}

