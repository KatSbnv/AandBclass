package yes;

public class B extends A {
    public static void main(String[] args) {
        A a = new B("Hello World");
        a.writeTheMessage();
    }
    public B (String message){
        super(message);
    }
    public String getMessage(){
            return super.getMessage() + " + B";
        }
    }

