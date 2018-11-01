package Expression;

class Multiplication extends BinaryExpression {
	private Expression left;
	private Expression right;
	
	public Multiplication (Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}		
}