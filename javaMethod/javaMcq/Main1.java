class Complex {
    private double re, im;    
    public String toString() {
re=10.7;
im=11.9;
        return "(" + re + " + " + im + "i)";
    }
}
  
public class Main1 {
    public static void main(String[] args) {
        Complex c1 = new Complex();
System.out.println(c1.toString());
        
    }
}