package day0329;

public class InitTest {

    public static void main(String[] args) {
        System.out.println("first"+InitTests.cv);
        InitTests i1 = new InitTests();
        System.out.println("1st"+i1.iv);
        System.out.println("forth"+InitTests.cv);   

    }
}

class InitTests{
    static int cv = 1;
    int iv = 1;
    static {
        System.out.println("second"+InitTests.cv);
        cv = 2;
        System.out.println("third"+InitTests.cv);
    }
    
    {iv = 2;}
    InitTests(){
        System.out.println("2nd"+iv);
        iv = 3;
        System.out.println("3rd"+iv);
    }    
}