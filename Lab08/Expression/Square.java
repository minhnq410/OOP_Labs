package Expression;

class Square extends Expression {
	private Expression expression;
	
	public Square(Expression ex)
	{
		this.expression = ex;
	}	

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int evaluate() {
        return 1;
    }    
}