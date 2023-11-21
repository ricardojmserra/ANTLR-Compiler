package Compiladores;

import java.util.Locale;
public class Symbol {

    @SuppressWarnings("All")
    public enum PType
    {
        INT,
        BOOL,
        REAL,
        STRING,
        VOID,
        ERROR
    }

    public String type;
    public String name;
    public Scope scope;
    public boolean isArray;
    public int dimensionArray;
    public boolean isPointer;
    public boolean isStruct;
    public Scope structScope;

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Symbol))
            return false;
        return this.name.equals(  ((Symbol)obj).name  );
    }

    //usamos um enumerado para guardar o tipo, porque é mais eficiente nas comparações de tipos
    public Symbol(String type, String name)
    {
        try{
            PType.valueOf(type.toUpperCase(Locale.ROOT));
            this.type = type;
            this.isStruct = false;
        } catch (Exception e){
            this.type = type;
            this.isStruct = true;
        }
        this.name = name;
        this.isArray = false;
        this.dimensionArray = 0;
        this.isPointer = false;
        this.structScope = null;
    }

    public String toString()
    {
        //return name + ":" + this.type + " isArray = " + this.isArray + " dimension = " + this.dimensionArray + " isPointer = " + this.isPointer + " isStruct = " + this.isStruct;
        return name + ":" + this.type;
    }
}
