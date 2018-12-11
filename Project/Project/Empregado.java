package Project;

import java.util.Date;

//package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Project.Empregado
* Objetivo...: Representar um(a) empregado(a) qualquer de uma institui��o de ensino.
* Observacoes:
*/
public abstract class Empregado extends Pessoa {
    long                            matricula;
    int                             regimeEmprego;
    int                             regimeRemuneracao;
    
    //
    // Normalmente um empregado est� "lotado" num centro centro de custo, unidade
    // e departamento...
    // Exemplo:     centro de custo : UFG - C�mpus I (Pra�a Universit�ria) 
    //              unidade:        Escola de Engenharia 
    //              departamento:   Engenharia da Computa��o
    //
    int                             centroCusto;
    int                             unidade;
    int                             departamento; 

    double                          cargaHorariaDiaria;     // M�ximo de 10h
    double                          cargaHorariaSemanal;    // M�ximo de 44h
    double                          cargaHorariaQuinzenal;  // M�ximo de 100h
    double                          cargaHorariaMensal;     // M�ximo de 250h

    double                          remuneracaoBasica;          // Todos podem ser 0 (zero)
    double                          remuneracaoComplementar;    // ou mais...
    double                          remuneracaoAdicional;
    double                          remuneracaoGratificada;
    
    int                             titulacaoMaxima;        // C�digo da titula��o
    
    
    

	public Empregado(DocumentoIdentificacao documento, String prenome, String sobrenome, Date dataNascimento,
                     long municipioNascimento, int ufNascimento, int paisNascimento, int estadoCivil, Endereco endereco,
                     Telefone telefoneResidencial, Telefone telefoneComercial, Telefone telefoneAlternativo, Email emailPessoal,
                     Email emailComercial, Email emailAlternativo, long matricula, int regimeEmprego, int regimeRemuneracao,
                     int centroCusto, int unidade, int departamento, double cargaHorariaDiaria, double cargaHorariaSemanal,
                     double cargaHorariaQuinzenal, double cargaHorariaMensal, double remuneracaoBasica,
                     double remuneracaoComplementar, double remuneracaoAdicional, double remuneracaoGratificada,
                     int titulacaoMaxima) {
		super(documento, prenome, sobrenome, dataNascimento, municipioNascimento, ufNascimento, paisNascimento,
				estadoCivil, endereco, telefoneResidencial, telefoneComercial, telefoneAlternativo, emailPessoal,
				emailComercial, emailAlternativo);
		this.matricula = matricula;
		this.regimeEmprego = regimeEmprego;
		this.regimeRemuneracao = regimeRemuneracao;
		this.centroCusto = centroCusto;
		this.unidade = unidade;
		this.departamento = departamento;
		this.cargaHorariaDiaria = cargaHorariaDiaria;
		this.cargaHorariaSemanal = cargaHorariaSemanal;
		this.cargaHorariaQuinzenal = cargaHorariaQuinzenal;
		this.cargaHorariaMensal = cargaHorariaMensal;
		this.remuneracaoBasica = remuneracaoBasica;
		this.remuneracaoComplementar = remuneracaoComplementar;
		this.remuneracaoAdicional = remuneracaoAdicional;
		this.remuneracaoGratificada = remuneracaoGratificada;
		this.titulacaoMaxima = titulacaoMaxima;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public int getRegimeEmprego() {
		return regimeEmprego;
	}

	public void setRegimeEmprego(int regimeEmprego) {
		this.regimeEmprego = regimeEmprego;
	}

	public int getRegimeRemuneracao() {
		return regimeRemuneracao;
	}

	public void setRegimeRemuneracao(int regimeRemuneracao) {
		this.regimeRemuneracao = regimeRemuneracao;
	}

	public int getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(int centroCusto) {
		this.centroCusto = centroCusto;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public int getDepartamento() {
		return departamento;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	public double getCargaHorariaDiaria() {
		return cargaHorariaDiaria;
	}

	public void setCargaHorariaDiaria(double cargaHorariaDiaria) {
		this.cargaHorariaDiaria = cargaHorariaDiaria;
	}

	public double getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}

	public void setCargaHorariaSemanal(double cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}

	public double getCargaHorariaQuinzenal() {
		return cargaHorariaQuinzenal;
	}

	public void setCargaHorariaQuinzenal(double cargaHorariaQuinzenal) {
		this.cargaHorariaQuinzenal = cargaHorariaQuinzenal;
	}

	public double getCargaHorariaMensal() {
		return cargaHorariaMensal;
	}

	public void setCargaHorariaMensal(double cargaHorariaMensal) {
		this.cargaHorariaMensal = cargaHorariaMensal;
	}

	public double getRemuneracaoBasica() {
		return remuneracaoBasica;
	}

	public void setRemuneracaoBasica(double remuneracaoBasica) {
		this.remuneracaoBasica = remuneracaoBasica;
	}

	public double getRemuneracaoComplementar() {
		return remuneracaoComplementar;
	}

	public void setRemuneracaoComplementar(double remuneracaoComplementar) {
		this.remuneracaoComplementar = remuneracaoComplementar;
	}

	public double getRemuneracaoAdicional() {
		return remuneracaoAdicional;
	}

	public void setRemuneracaoAdicional(double remuneracaoAdicional) {
		this.remuneracaoAdicional = remuneracaoAdicional;
	}

	public double getRemuneracaoGratificada() {
		return remuneracaoGratificada;
	}

	public void setRemuneracaoGratificada(double remuneracaoGratificada) {
		this.remuneracaoGratificada = remuneracaoGratificada;
	}

	public int getTitulacaoMaxima() {
		return titulacaoMaxima;
	}

	public void setTitulacaoMaxima(int titulacaoMaxima) {
		this.titulacaoMaxima = titulacaoMaxima;
	}
   
    
    
    
}