package interop;

interface twostrings{
    public void stringone();
    public void stringtwo();
}

class Op implements twostrings{

    public void stringone(){
        System.out.println("Hello");
    }
    public void stringtwo(){
        System.out.println("Hello2");
    }
}

public class InterOp {
    public static void main(String[] args) {
    
        Op p = new Op();
        p.stringone();
        p.stringtwo();
    
    }
}
