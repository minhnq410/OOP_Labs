package Expression;

abstract class BinaryExpression extends Expression {
	abstract public Expression left();
	abstract public Expression right();
}