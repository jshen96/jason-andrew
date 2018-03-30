import java.io.*;
import java.util.*;

public class FunctionSym extends Sym {
    private String functionName;
    private String returnType;
    private List<Sym> params;

    public FunctionSym(String functionName, String type) {
        super(type);
        this.functionName = functionName;
        this.returnType = type;
      }

    public void setParams(List<Sym>params){
      this.params = params;
    }
    public int getNumParams(){
      return params.size();
    }
    public String getFuncName(){
      return this.functionName;
    }
    public String getReturnType(){
      return this.returnType;
    }

}
