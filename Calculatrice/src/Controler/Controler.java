package Controler;

import java.util.Stack;

import Model.CalculatorModel;

public class Controler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> accu = new Stack<Integer>();
		CalculatorModel calc = new CalculatorModel(accu);
		calc.push(1);
		calc.push(2);
		calc.push(3);
		calc.swap();

		System.out.println(calc.pop());
		System.out.println(calc.pop());
		
	}

}
