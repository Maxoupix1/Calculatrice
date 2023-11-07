/**
 * Nom de l'interface	: CalculatorModelInterface
 *
 * Description			: Interface ne charge du modèle 
 *
 * Date          		: 01/11/2023
 * 
 * Version       		: Finale
 */

package model;

public interface CalculatorModelInterface {
	
	/**
	 * Déclaration de tous les calculs possibles dans la calculatrice ainsi que les 
	 * manipulations au sein de la pile
	 */
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
	public void setAccu(Pile newAccu);
	

}