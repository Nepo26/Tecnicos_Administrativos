package Project;//package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: DocumentoIdentificacao
* Objetivo...: Representa um documento de identifica��o de uma Pessoa
* Observacoes:
*/
public class DocumentoIdentificacao {
    /*
    * tipo                          <veja tipos de documentos poss�veis>
    * numero                        1 .. 
    * complemento                   complemento do n�mero (por exemplo, letras)
    * orgaoExpedidor                org�o que expediu o documento
    * pais                          c�digo do pa�s emissor do documento
    */
    private int                     tipo;
    private long                    numero;
    private String                  complemento;
    private String                  orgaoExpedidor;

	public DocumentoIdentificacao(int tipo, long numero, String complemento, String orgaoExpedidor, int pais) {
		this.tipo = tipo;
		this.numero = numero;
		this.complemento = complemento;
		this.orgaoExpedidor = orgaoExpedidor;
		this.pais = pais;
	}

	private int                     pais;
	
    
    
    public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
    
}