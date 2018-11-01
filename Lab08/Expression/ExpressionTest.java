package Expression;


public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Expression e1 = new Square(new Addition(new Subtraction(new Division(new Numeral(5), new Numeral(5)),new Numeral(1)),new Multiplication(new Numeral(2),new Numeral(3))));
        System.out.println(e1.toString() + " = " + e1.evaluate());
        
        try {
            Expression e2 = new Square(new Addition(new Subtraction(new Division(new Numeral(5), new Numeral()),new Numeral(1)),new Multiplication(new Numeral(2),new Numeral(3))));
            System.out.println(e2.toString() + " = " + e2.evaluate());
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
    
}
