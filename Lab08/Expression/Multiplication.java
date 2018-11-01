package Expression;

class Multiplication extends BinaryExpression {
	private Expression left;
	private Expression right;
	
	public Multiplication (Expression left, Expression right)
	{
		this.left = left;
		this.right = right;
	}		

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        String s = "(" + left.toString() + " * " + right.toString() + ")";
        return s;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}