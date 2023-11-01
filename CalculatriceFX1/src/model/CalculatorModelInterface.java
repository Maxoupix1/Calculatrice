package model;

public interface CalculatorModelInterface {
	
	public void add();
	public void substract();
	public void multiply();
	public void divide();
	public void push(double i);
	public double pop();
	public void drop();
	public void swap();
	public void clear();
	public int length();
	public Pile getAccu();
	

}
