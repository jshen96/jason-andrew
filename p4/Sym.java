public class Sym {
    private String type;
    private boolean isStruct = false;
    private boolean isFunc = false;



    public Sym(String type) {
        this.type = type;
    }
    public boolean checkStruct(){
      return this.isStruct;
    }
    public void setAsStruct(){
        this.isStruct = true;
    }
    public void setAsFunc(){
        this.isFunc = true;
    }
    public String getType() {
        return type;
    }

    public String toString() {
        return type;
    }
}
