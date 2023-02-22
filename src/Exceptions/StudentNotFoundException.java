package Exceptions;

public class StudentNotFoundException extends Exception {
    private long code;
    public StudentNotFoundException(String msg)
    {
        super(msg);
        this.code=1000;
    }
    public StudentNotFoundException(String msg, long code){
        super(msg);
        this.code = code;
    }
    @Override
    public String toString(){
        return "StudentNotFoundException: "+super.getMessage()+" code: "+code;
    }
}
