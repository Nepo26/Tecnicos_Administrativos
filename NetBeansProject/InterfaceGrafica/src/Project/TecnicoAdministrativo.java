package Project;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static oracle.jrockit.jfr.events.Bits.length;
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
	private static ArrayList <TecnicoAdministrativo> tecnicosAdministrativos = new ArrayList<TecnicoAdministrativo>();
	
	


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
		super(
                        documento, 
                        prenome, 
                        sobrenome, 
                        dataNascimento, 
                        municipioNascimento, 
                        ufNascimento, 
                        paisNascimento, 
                        estadoCivil,
			endereco, 
                        telefoneResidencial, 
                        telefoneComercial, 
                        telefoneAlternativo, 
                        emailPessoal, 
                        emailComercial,
			emailAlternativo, 
                        matricula, 
                        regimeEmprego, 
                        regimeRemuneracao, 
                        centroCusto, 
                        unidade, 
                        departamento,
			cargaHorariaDiaria, 
                        cargaHorariaSemanal, 
                        cargaHorariaQuinzenal, 
                        cargaHorariaMensal, 
                        remuneracaoBasica,
			remuneracaoComplementar, 
                        remuneracaoAdicional, 
                        remuneracaoGratificada, 
                        titulacaoMaxima
                );
                
                tecnicosAdministrativos.add(this);
	}

        public TecnicoAdministrativo(){
            super(null, null, null, null, 0, 0, 0, 0, null, null, null, null, null , null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

	public void cadastrar(
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
            
		tecnicosAdministrativos.add(
                        new TecnicoAdministrativo(
                            documento,
                            prenome,
                            sobrenome,
                            dataNascimento, 
                            municipioNascimento, 
                            ufNascimento, 
                            paisNascimento, 
                            estadoCivil,
                            endereco, 
                            telefoneResidencial, 
                            telefoneComercial, 
                            telefoneAlternativo,
                            emailPessoal, 
                            emailComercial, 
                            emailAlternativo, 
                            matricula, 
                            regimeEmprego,
                            regimeRemuneracao, 
                            centroCusto, 
                            unidade, 
                            departamento, 
                            cargaHorariaDiaria,
                            cargaHorariaSemanal, 
                            cargaHorariaQuinzenal, 
                            cargaHorariaMensal,
                            remuneracaoBasica, 
                            remuneracaoComplementar, 
                            remuneracaoAdicional,
                            remuneracaoGratificada, 
                            titulacaoMaxima));
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
    
    public ArrayList consultar(String textoPesquisa, boolean isRegex,int tipoPesquisa) {
        
        ArrayList <Integer> numeroEncontrado = new ArrayList<Integer>();
        if(!isRegex)
        {
            //ArrayList <Integer> numeroEncontrado = new ArrayList<Integer>();
            
            String pattern = "*"+textoPesquisa.substring(0,1)+"*|*"+textoPesquisa.substring(0,2)+
                "*|*"+textoPesquisa.substring((length(textoPesquisa)/2),length(textoPesquisa))+
                 "*|*"+textoPesquisa.substring(0,(length(textoPesquisa)/2))+
                  "*|*"+textoPesquisa.substring(length(textoPesquisa)-2,(length(textoPesquisa)))+
                   "*|*"+textoPesquisa.substring(length(textoPesquisa)-1,(length(textoPesquisa)))+"*";
        
        
            Pattern r = Pattern.compile(pattern);
            switch(tipoPesquisa){
                case 1:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher( String.valueOf(tecnicosAdministrativos.get(i).getMatricula()) );

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                
                case 2:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(tecnicosAdministrativos.get(i).getPrenome());

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                    
                case 3:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(tecnicosAdministrativos.get(i).getSobrenome());

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                    
                case 4:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(String.valueOf(tecnicosAdministrativos.get(i).getDepartamento()));

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                
                case 5:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(String.valueOf(tecnicosAdministrativos.get(i).getUnidade()));

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                    
                case 6:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(String.valueOf(tecnicosAdministrativos.get(i).getCentroCusto()));

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;
                
                case 7:
                for(int i = 0; i < tecnicosAdministrativos.size();i++){
                       Matcher m = r.matcher(tecnicosAdministrativos.get(i).getEmailPessoal().prefixo);

                       if (m.find( )) {                  
                           numeroEncontrado.add(i);
                       }else {
                          System.out.println("No match for "+tipoPesquisa+"search.");
                       }
                }
                return numeroEncontrado;    
                
            
            }
            
            
        }
        else
        {
          
        }
       
        return  numeroEncontrado;
    }

    @Override
    public void cadastrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}