//package sistemaacademico;
package Project.Project;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Telefone
* Objetivo...: Representar um n�mero de telefone qualquer.
* Observacoes:
*/
public class Telefone {
    int                             tipo;
    int                             classe;
    int                             ddi;
    int                             ddd;
    int                             numero;
    int                             ramal;
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getClasse() {
		return classe;
	}
	public void setClasse(int classe) {
		this.classe = classe;
	}
	public int getDdi() {
		return ddi;
	}
	public void setDdi(int ddi) {
		this.ddi = ddi;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
    
    
}