/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedinnerclass;

/**
 *
 * @author zerellgardner
 */
class OutterClass {
    
private int x;
InnerClass inner = new InnerClass();
public void doStuff(){
    inner.go();
}
    

class InnerClass{
    
      public void go(){
       x = 42;  
        System.out.println(x);
    }
   
    }
    
}
