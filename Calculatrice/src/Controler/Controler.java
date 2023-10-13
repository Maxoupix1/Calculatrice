package Controler;

import java.util.Stack;

import Model.CalculatorModel;

public class Controler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Double> accu = new Stack<Double>();
		CalculatorModel calc = new CalculatorModel(accu);
		calc.push(1);
		calc.push(2);
		calc.push(3);
		calc.push(4);
		calc.divide();
		calc.multiply();
		for (int i = 0; i<=calc.length()+1; i++) {
			System.out.println(calc.pop());
		}
	}

}
