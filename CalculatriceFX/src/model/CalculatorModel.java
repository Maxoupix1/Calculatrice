/**
 * Nom de classe	: CalculatorModel
 *
 * Description		: Partie modèle qui va définir et réaliser les opérations 
 *
 * Date          	: 01/11/2023
 * 
 * Version       	: Finale
 */

package model;

/**
 * La classe CalculatorModel implémente l'interface CalculatorModelInterface
 * @see CalculatorModelInterface
 */
public class CalculatorModel implements CalculatorModelInterface{
	
	/**
	 * Objet de la classe Pile où les résultats seront stockés.
	 */
	private Pile accu;
	
	
	/**
	 * Constructeur du modèle
	 */
	public CalculatorModel() {
		this.accu = new Pile() ;
	}
	
	
	/**
	 * Addition des 2 derniers termes de la pile.
	 */
	public void add() {
		double a = this.pop();
		double b = this.pop();
		this.push(a+b);
	}
	
	
	/**
	 * Soustraction des 2 derniers termes de la pile.
	 */
	public void substract() {
		double a = this.pop();
		double b = this.pop();
		this.push(a-b);
	}
	
	
	/**
	 * Multiplication des 2 derniers termes de la pile.
	 */
	public void multiply() {
		double a = this.pop();
		double b = this.pop();
		this.push(a*b);
	}
	
	
	/**
	 * Division des 2 derniers termes de la pile.
	 */
	public void divide() {
		double a = this.pop();
		double b = this.pop();
		
		//Vérification de la division par 0.
		if (b==0) {
			this.push(b);
			this.push(a);
		}else {
			this.push(a/b);
		}
	}
	
	
	/**
	 * Rajout du nombre à la pile.
	 */
	public void push(double i) {
		accu.push(i);
	}
	
	
	/**
	 * Suppresion et mémorisation du dernier nombre de la pile.
	 * @return le dernier nombre.
	 */
	public double pop() {
		return accu.pop();	
	}
	
	
	/**
	 * Suppression du nombre à la pile.
	 */
	public void drop() {
		accu.remove(accu.indexOf(accu.lastElement()));	
	}
	
	
	/**
	 * Echange des 2 derniers nombre de la pile.
	 */
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
	
	
	/**
	 * Suppression de tous les termes de la pile.
	 */
	public void clear() {
		accu.clear();
	}
	
	
	/**
	 * Donne la longueur de la pile.
	 * @return la longueur
	 */
	public int length() {
		return accu.size();
	}
	
	
	/**
	 * @return la pile
	 */
	public Pile getAccu() {
		return accu;
	}
	
	
	/**
	 * @param nouvelle pile
	 */
	public void setAccu(Pile newAccu) {
		this.accu = newAccu;
	}
}