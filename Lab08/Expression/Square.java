package Expression;

class Square extends Expression {
	private Expression expression;
	
	public Square(Expression ex)
	{
		this.expression = ex;
	}	

    @Override
    public String toString() {
        String s = "(" + expression.toString() + ")^2";
        return s;
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }    
}