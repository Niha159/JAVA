
package pkg10;
class DivisionByZeroException extends Exception{
    public  DivisionByZeroException(String message){
        super(message);
    }
    
    
}
public class TestException {
    public static void main(String[] args){
        int nr=10;
        int dr=0;
        int result;
        try{
            if(dr==0){
                throw new DivisionByZeroException("division by zero not allowed");
                
            }
            result=nr/dr;
            System.out.println(result);
        }
        catch(DivisionByZeroException e1){
                System.out.println(e1.getMessage());
                
                }         
                 
         finally{
                 System.out.println("Finally block executeed");
                 }
        
    
}}
