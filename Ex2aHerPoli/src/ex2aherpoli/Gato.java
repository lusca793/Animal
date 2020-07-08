package ex2aherpoli;

public class Gato extends Animal{
    
    public void mia(){
        System.out.println("*Miado*");
    }
    
    @Override
    public void caminha(){
        System.out.println("O gato está caminhando!!");
    }
    
}
