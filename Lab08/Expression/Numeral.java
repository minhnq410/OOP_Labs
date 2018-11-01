package Expression;

class Numeral extends Expression {
    private int value;
	
    public Numeral (int v)
    {
	value = v;
    }
	
    public Numeral(){
	value = 0;
    }

    @Override
    public String toString() {
        String s = "";
        s = s + value;
        return s;
    }

    @Override
    public int evaluate() {
        return value;
    }
}