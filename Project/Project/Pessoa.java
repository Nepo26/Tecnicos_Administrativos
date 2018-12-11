package Project;//package sistemaacademico;

import java.util.Date;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Project.Pessoa
* Objetivo...: Representar uma pessoa qualquer.
* Observacoes: Exige-se que a pessoa tenha um identificador �nico, ou seja, 
*              duas pessoas n�o podem ter o mesmo tipo e n�mero de identificador
*              
*/
public abstract class Pessoa {
    DocumentoIdentificacao          documento;              
    private String                  prenome;                // Exemplo: Maria Luiza
    private String                  sobrenome;              // da Silva Ferreira Prado
    
    private Date                    dataNascimento;
    private long                    municipioNascimento;    // C�digo do munic�pio
    private int                     ufNascimento;
    private int                     paisNascimento;
    
    private int                     estadoCivil;            // C�digo do estado civil
    private Endereco                endereco;
    private Telefone                telefoneResidencial;
    private Telefone                telefoneComercial;
    private Telefone                telefoneAlternativo;
    private Email                   emailPessoal;           // e-mails podem ser deixados em branco
    private Email                   emailComercial;
    private Email                   emailAlternativo;
    
    
    
    public Pessoa(DocumentoIdentificacao documento, String prenome, String sobrenome, Date dataNascimento,
			long municipioNascimento, int ufNascimento, int paisNascimento, int estadoCivil, Endereco endereco,
			Telefone telefoneResidencial, Telefone telefoneComercial, Telefone telefoneAlternativo, Email emailPessoal,
			Email emailComercial, Email emailAlternativo) {
		super();
		this.documento = documento;
		this.prenome = prenome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.municipioNascimento = municipioNascimento;
		this.ufNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
		this.telefoneResidencial = telefoneResidencial;
		this.telefoneComercial = telefoneComercial;
		this.telefoneAlternativo = telefoneAlternativo;
		this.emailPessoal = emailPessoal;
		this.emailComercial = emailComercial;
		this.emailAlternativo = emailAlternativo;
	}
    
    
    
	public DocumentoIdentificacao getDocumento() {
		return documento;
	}
	public void setDocumento(DocumentoIdentificacao documento) {
		this.documento = documento;
	}
	public String getPrenome() {
		return prenome;
	}
	public void setPrenome(String prenome) {
		this.prenome = prenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public long getMunicipioNascimento() {
		return municipioNascimento;
	}
	public void setMunicipioNascimento(long municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}
	public int getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(int ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	public int getPaisNascimento() {
		return paisNascimento;
	}
	public void setPaisNascimento(int paisNascimento) {
		this.paisNascimento = paisNascimento;
	}
	public int getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(int estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Telefone getTelefoneResidencial() {
		return telefoneResidencial;
	}
	public void setTelefoneResidencial(Telefone telefoneResidencial) {
		this.telefoneResidencial = telefoneResidencial;
	}
	public Telefone getTelefoneComercial() {
		return telefoneComercial;
	}
	public void setTelefoneComercial(Telefone telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}
	public Telefone getTelefoneAlternativo() {
		return telefoneAlternativo;
	}
	public void setTelefoneAlternativo(Telefone telefoneAlternativo) {
		this.telefoneAlternativo = telefoneAlternativo;
	}
	public Email getEmailPessoal() {
		return emailPessoal;
	}
	public void setEmailPessoal(Email emailPessoal) {
		this.emailPessoal = emailPessoal;
	}
	public Email getEmailComercial() {
		return emailComercial;
	}
	public void setEmailComercial(Email emailComercial) {
		this.emailComercial = emailComercial;
	}
	public Email getEmailAlternativo() {
		return emailAlternativo;
	}
	public void setEmailAlternativo(Email emailAlternativo) {
		this.emailAlternativo = emailAlternativo;
	}
	
	
	
	public abstract void cadastrar();
    public abstract void alterar(DocumentoIdentificacao documento);
    public abstract void excluir(DocumentoIdentificacao documento);
    public abstract Pessoa consultar(DocumentoIdentificacao documento);
}
