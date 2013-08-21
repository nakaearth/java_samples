package sample1;

public abstract  class Animal {
    public abstract void eat();
    public void sayHello(){
          System.out.println("HELLO!!");  
    }  
    public void execute() {
         sayHello();
         eat();
    } 
}
