
package pkg8;
class Outer{
    public void display(){
        System.out.println("Outer class displkay Message");
    }
class Inner{
    
    public void display(){
   System.out.println("Inner class display Message");         
   }
}}


public class OuterInnerClass {
    public static void main(String[] args){
       Outer o1=new Outer();
       Outer.Inner i1=o1.new Inner();
       i1.display();
       
    }
    
}
