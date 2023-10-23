package model;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface{
	public Pile accu;
	
	public CalculatorModel() {
		
		this.accu = new Pile() ;
	}
	
	public void add() {
		double a = this.pop();
		double b = this.pop();
		this.push(a+b);
	}
	public void substract() {
		double a = this.pop();
		double b = this.pop();
		this.push(a-b);
	}
	public void multiply() {
		double a = this.pop();
		double b = this.pop();
		this.push(a*b);
	}
	public void divide() {
		double a = this.pop();
		double b = this.pop();
		if (b==0) {
			this.push(b);
			this.push(a);
		}else {
			this.push(a/b);
		}
		
	}
	
	
	public void push(double i) {
		accu.push(i);
	}
	
	public double pop() {
		return accu.pop();	
	}
	
	public void drop() {
		accu.remove(accu.indexOf(accu.lastElement()));	
	}
	
	public void swap() {
		Double a = accu.lastElement();
		this.drop();
		Double b = accu.lastElement();
		this.drop();
		Double c = a;
		a = b;
		b = c;
		this.push(b);
		this.push(a);
		
		
	}
	
	public void clear() {
		accu.clear();
	}
	
	public int length() {
		return accu.size();
	}
}
