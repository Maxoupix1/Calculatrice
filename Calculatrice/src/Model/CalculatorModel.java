package Model;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface{
	public Stack<Integer> accu;
	
	public CalculatorModel(Stack<Integer> accu) {
		
		this.accu = accu;
	}
	
	public void add() {
		
	}
	public void substract() {
		
	}
	public void multiply() {
		
	}
	public void divide() {
		
	}
	
	public void opposite() {
		
	}
	
	public void push(int i) {
		accu.push(i);
		
	}
	
	public int pop() {
		return accu.pop();	
	}
	
	public void drop() {
		accu.remove(accu.indexOf(accu.lastElement()));
		
	}
	
	public void swap() {
		Integer a = accu.lastElement();
		this.drop();
		Integer b = accu.lastElement();
		this.drop();
		Integer c = a;
		a = b;
		b = c;
		this.push(b);
		this.push(a);
		
		
	}
	
	public void clear() {
		accu.clear();
	}
}
