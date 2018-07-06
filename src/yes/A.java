package yes;

public class A {
    String message = "Hello from A";
    {
        writeTheMessage();
    }
    protected A (String message){
        this.message = message;
    }
    protected String getMessage(){
        return message;
    }

    protected void writeTheMessage() {
        System.out.println(getMessage());
    }
}
