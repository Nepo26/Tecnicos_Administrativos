package Project;//package sistemaacademico;

import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: TecnicioAdministrativo
* Objetivo...: Representar um(a) empregado(a) que exerce fun��o t�cnico-administrativa.
* Observacoes:
*/
public class TecnicoAdministrativo extends Empregado {
	
	private static ArrayList <TecnicoAdministrativo> tecnicosAdministrativos;
	


	//
    // A equipe respons�vel dever� verificar se h� necessidade de outros
    // atributos e m�todos para inseri-los....
    // 
    // Observa��o: Lembre-se que devo poder cadastrar, alterar, consultar e 
    // excluir pelo n�mero de matricula do empregado...


	
	//Construtor
	public TecnicoAdministrativo(DocumentoIdentificacao documento, String prenome, String sobrenome,
                                 Date dataNascimento, long municipioNascimento, int ufNascimento, int paisNascimento, int estadoCivil,
                                 Endereco endereco, Telefone telefoneResidencial, Telefone telefoneComercial, Telefone telefoneAlternativo,
                                 Email emailPessoal, Email emailComercial, Email emailAlternativo, long matricula, int regimeEmprego,
                                 int regimeRemuneracao, int centroCusto, int unidade, int departamento, double cargaHorariaDiaria,
                                 double cargaHorariaSemanal, double cargaHorariaQuinzenal, double cargaHorariaMensal,
                                 double remuneracaoBasica, double remuneracaoComplementar, double remuneracaoAdicional,
                                 double remuneracaoGratificada, int titulacaoMaxima) {
		super(documento, prenome, sobrenome, dataNascimento, municipioNascimento, ufNascimento, paisNascimento, estadoCivil,
				endereco, telefoneResidencial, telefoneComercial, telefoneAlternativo, emailPessoal, emailComercial,
				emailAlternativo, matricula, regimeEmprego, regimeRemuneracao, centroCusto, unidade, departamento,
				cargaHorariaDiaria, cargaHorariaSemanal, cargaHorariaQuinzenal, cargaHorariaMensal, remuneracaoBasica,
				remuneracaoComplementar, remuneracaoAdicional, remuneracaoGratificada, titulacaoMaxima);
		
		tecnicosAdministrativos = new ArrayList<TecnicoAdministrativo>();
		
	}


	public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void alterar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void excluir(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public Pessoa consultar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}