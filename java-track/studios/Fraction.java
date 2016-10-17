
public class Fraction {

    private int denominator;
    private int numerator;

    public Fraction(int denominator, int numerator)

    {
        this.denominator = denominator;
        this.numerator = numerator;
    }
    
    public Fraction add(Fraction A){
    	Fraction a = new Fraction(this.denominator,(this.numerator + A.numerator));
    	return a;
    }
    
    public Fraction multiply(Fraction M){
    	Fraction m = new Fraction((this.denominator*M.denominator),(this.numerator * M.numerator));
    	return m;
    }
    public Fraction reciprocal(){
    	int x = this.denominator;
    	this.denominator = this.numerator;
    	this.numerator = x;
    	Fraction r = new Fraction(this.denominator, this.numerator);
    	return r;
    }
    public void simp(){
    	int d = this.denominator;
    	int n = this.numerator;
    	int c;
    	while(n!=0 && d!=0){
    		c = d;
    		d = n%d;
    		n = c;
    	}
    	this.denominator = this.denominator/(n+d);
    	this.numerator = this.numerator/(n+d);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction Juno = new Fraction(8,6);
		Juno.simp();
		System.out.println(Juno.numerator);
		System.out.println(Juno.denominator);
		
	}

}
