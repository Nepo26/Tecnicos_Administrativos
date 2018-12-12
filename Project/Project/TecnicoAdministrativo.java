    package Project;//package sistemaacademico;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
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
	Scanner s = new Scanner(System.in);
	private static ArrayList <TecnicoAdministrativo> tecnicosAdministrativos;
	
	


	//
    // A equipe respons�vel dever� verificar se h� necessidade de outros
    // atributos e m�todos para inseri-los....
    // 
    // Observa��o: Lembre-se que devo poder cadastrar, alterar, consultar e 
    // excluir pelo n�mero de matricula do empregado...


	
	//Construtor
	public TecnicoAdministrativo(
                DocumentoIdentificacao documento,
                String prenome,
                String sobrenome,
			Date dataNascimento, 
                        long municipioNascimento, 
                        int ufNascimento, 
                        int paisNascimento, 
                        int estadoCivil,
			Endereco endereco, 
                        Telefone telefoneResidencial, 
                        Telefone telefoneComercial, 
                        Telefone telefoneAlternativo,
			Email emailPessoal, 
                        Email emailComercial, 
                        Email emailAlternativo, 
                        long matricula, 
                        int regimeEmprego,
			int regimeRemuneracao, 
                        int centroCusto, 
                        int unidade, 
                        int departamento, 
                        double cargaHorariaDiaria,
			double cargaHorariaSemanal, 
                        double cargaHorariaQuinzenal, 
                        double cargaHorariaMensal,
			double remuneracaoBasica, 
                        double remuneracaoComplementar, 
                        double remuneracaoAdicional,
			double remuneracaoGratificada, 
                        int titulacaoMaxima) {
		super(documento, prenome, sobrenome, dataNascimento, municipioNascimento, ufNascimento, paisNascimento, estadoCivil,
				endereco, telefoneResidencial, telefoneComercial, telefoneAlternativo, emailPessoal, emailComercial,
				emailAlternativo, matricula, regimeEmprego, regimeRemuneracao, centroCusto, unidade, departamento,
				cargaHorariaDiaria, cargaHorariaSemanal, cargaHorariaQuinzenal, cargaHorariaMensal, remuneracaoBasica,
				remuneracaoComplementar, remuneracaoAdicional, remuneracaoGratificada, titulacaoMaxima);
		
		tecnicosAdministrativos = new ArrayList<TecnicoAdministrativo>();
	}


	public void cadastrar() {
		
		int c = s.nextInt();
		TecnicoAdministrativo a = null;
		
		//Chamando m�todos
		
		a.setCargaHorariaDiaria(cargaHorariaDiaria);
		a.setCargaHorariaMensal(cargaHorariaMensal);
		a.setCargaHorariaQuinzenal(cargaHorariaQuinzenal);
		a.setCargaHorariaSemanal(cargaHorariaSemanal);
		a.setCentroCusto(centroCusto);
		a.setDataNascimento(dataNascimento);
		a.setDepartamento(departamento);
		a.setDocumento(documento);
		a.setEmailAlternativo(emailAlternativo);
		a.setEmailComercial(emailComercial);
		a.setEmailPessoal(emailPessoal);
		a.setEndereco(endereco);
		a.setEstadoCivil(estadoCivil);
		a.setMatricula(matricula);
		a.setMunicipioNascimento(municipioNascimento);
		a.setPaisNascimento(paisNascimento);
		a.setPrenome(prenome);
		a.setRegimeEmprego(regimeEmprego);
		a.setRegimeRemuneracao(regimeRemuneracao);
		a.setRemuneracaoAdicional(remuneracaoAdicional);
		a.setRemuneracaoBasica(remuneracaoBasica);
		a.setRemuneracaoComplementar(remuneracaoComplementar);
		a.setRemuneracaoGratificada(remuneracaoGratificada);
		a.setSobrenome(sobrenome);
		a.setTelefoneAlternativo(telefoneAlternativo);
		a.setTelefoneComercial(telefoneComercial);
		a.setTelefoneResidencial(telefoneResidencial);
		a.setTitulacaoMaxima(titulacaoMaxima);
		a.setUfNascimento(ufNascimento);
		a.setUnidade(unidade);

		//Criando cadastro/objeto
		a = new TecnicoAdministrativo(a.getDocumento(), a.getPrenome(), a.getSobrenome(), 
				a.getDataNascimento(), a.getMunicipioNascimento(), a.getUfNascimento(), a.getPaisNascimento(),
				a.getEstadoCivil(), a.getEndereco(), a.getTelefoneResidencial(), a.getTelefoneComercial(),
				a.getTelefoneAlternativo(), a.getEmailPessoal(), a.getEmailComercial(), a.getEmailAlternativo(),
				a.getMatricula(), a.getRegimeEmprego(), a.getRegimeRemuneracao(), a.getCentroCusto(),
				a.getUnidade(), a.getDepartamento(), a.getCargaHorariaDiaria(), a.getCargaHorariaSemanal(),
				a.getCargaHorariaQuinzenal(), a.getCargaHorariaMensal(), a.getRemuneracaoBasica(),
				a.getRemuneracaoComplementar(), a.getRemuneracaoAdicional(), a.getRemuneracaoGratificada(),
				a.getTitulacaoMaxima());
		
		tecnicosAdministrativos.add(a);
		//throw new UnsupportedOperationException("Not supported yet.");
    }

    
    public void alterar(DocumentoIdentificacao documento) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    
    public void excluir(DocumentoIdentificacao documento) {
       
       long consultaMatricula = 0;
       
        
        for(int i = 0; i < tecnicosAdministrativos.size();i++) {
			if(consultaMatricula == tecnicosAdministrativos.get(i).getMatricula()) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento());
				
				tecnicosAdministrativos.remove(i);
				
				break;
				}
        }
    
    	throw new UnsupportedOperationException("Not supported yet.");
    }

   
    public Pessoa consultar(DocumentoIdentificacao documento) {
        String consultaString = null;
        long consultaMatricula = 0;
        int consultaInt = 0;
        
        for(int i = 0; i < tecnicosAdministrativos.size();i++) {
			if(consultaMatricula == tecnicosAdministrativos.get(i).getMatricula()) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento());
        		break;
				}
			if(consultaString.equals(tecnicosAdministrativos.get(i).getPrenome())) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento());
				}
			if(consultaString.equals(tecnicosAdministrativos.get(i).getSobrenome())) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento() + "\n\n\n");
				}
			if(consultaInt == tecnicosAdministrativos.get(i).getDepartamento()) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento() + "\n\n\n");
				}
			
			if(consultaInt == tecnicosAdministrativos.get(i).getUnidade()) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento() + "\n\n\n");
				}
			
			if(consultaInt == tecnicosAdministrativos.get(i).getCentroCusto()) {
				System.out.println(	tecnicosAdministrativos.get(i).getPrenome() + 
						tecnicosAdministrativos.get(i).getSobrenome() + "\n" +
						tecnicosAdministrativos.get(i).getMatricula() + "\n" +
						tecnicosAdministrativos.get(i).getUnidade() + "\n" +
						tecnicosAdministrativos.get(i).getDepartamento() + "\n\n\n");
				}
			
    	throw new UnsupportedOperationException("Not supported yet.");
    }
		return null;
}
}