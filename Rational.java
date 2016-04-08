package java_hw1;

public class Rational {
private int nomerator, denominator;
	
	public Rational(){   //构造函数
		this.nomerator = 0;
		this.denominator = 0;
	}
	public Rational(int nomerator, int denominator){  //构造函数
		
		
		int commonDivisor = gcd(nomerator, denominator);  //调用函数
		this.nomerator = nomerator / commonDivisor;
		this.denominator = denominator / commonDivisor;
		
	}
	
	private int gcd(int a, int b){
		
		if(a == 0 || b == 0){
			return a+b;
		}
		return gcd(b,a%b);
	}   //通过最大公约数辗转相除
	//定义addition方法
	 static Rational addition(Rational a, Rational b){
		Rational result ;//
		if(a.denominator == b.denominator){
			result = new Rational((a.nomerator+b.nomerator), (a.denominator));
		}else{
			result = new Rational(((a.nomerator*b.denominator)+(b.nomerator*a.denominator)), (a.denominator*b.denominator));
		}
		return result;
	}
	 static Rational subtraction(Rational a, Rational b){
		 Rational result ;//
			if(a.denominator == b.denominator){
				result = new Rational((a.nomerator-b.nomerator), (a.denominator));
			}else{
				result = new Rational(((a.nomerator*b.denominator)-(b.nomerator*a.denominator)), (a.denominator*b.denominator));
			}
			return result;
	 }
	 static Rational multiplication(Rational a, Rational b){
		 Rational result ;//
			
		 return result = new Rational((a.nomerator*b.nomerator),(a.denominator*b.denominator));
			
			
	 }
	 static Rational division(Rational a, Rational b){
		 Rational result ;//
			
		 return result = new Rational((a.nomerator*b.denominator),(a.denominator*b.nomerator));
			
			
	 }
	public String toString(){
		return String.format("%d/%d",this.nomerator,this.denominator);
	}
}
