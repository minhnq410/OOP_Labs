package Expression;

class Division extends BinaryExpression {
	private Expression left;
	private Expression right;
	
	public Division (Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}
}