package ex2aherpoli;

public class Cachorro extends Animal {
   
    public void late(){
        System.out.println("*Latido*");
    }
    
    @Override
    public void caminha(){
        System.out.println("O cachorro está caminhando!!");
    }
    
}
