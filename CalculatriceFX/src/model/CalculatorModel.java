package model;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface{
	public Stack<Double> accu;
	
	public CalculatorModel(Stack<Double> accu) {
		
		this.accu = accu;
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
		this.push(a/b);
	}
	
	public void opposite() {
		Double a = accu.lastElement();
		this.drop();
		accu.push(-a);
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
