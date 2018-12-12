//package sistemaacademico;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Endereço
* Objetivo...: Representar um endereço de um logradouro qualquer.
* Observacoes:
*/
public class Endereco {
    int                             tipoLogradouro;         
    int                             codigoLogradouro;       // É o CEP do logradouro
    String                          descricaoLogradouro;
    String                          complementoLogradouro;  // Por exemplo: esquina com Rua 26.
    int                             numero;                 // 0 quando inexistente
    String                          quadra;                 
    String                          lote;                         
    String                          bairro;
    long                            municipio;
    int                             unidadeFederacao;
    int                             pais;
    String                          referencia;             // Ponto de referência do endereço.
	
    
    
    public int getTipoLogradouro() {
		return tipoLogradouro;
	}
	public void setTipoLogradouro(int tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	public int getCodigoLogradouro() {
		return codigoLogradouro;
	}
	public void setCodigoLogradouro(int codigoLogradouro) {
		this.codigoLogradouro = codigoLogradouro;
	}
	public String getDescricaoLogradouro() {
		return descricaoLogradouro;
	}
	public void setDescricaoLogradouro(String descricaoLogradouro) {
		this.descricaoLogradouro = descricaoLogradouro;
	}
	public String getComplementoLogradouro() {
		return complementoLogradouro;
	}
	public void setComplementoLogradouro(String complementoLogradouro) {
		this.complementoLogradouro = complementoLogradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getQuadra() {
		return quadra;
	}
	public void setQuadra(String quadra) {
		this.quadra = quadra;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public long getMunicipio() {
		return municipio;
	}
	public void setMunicipio(long municipio) {
		this.municipio = municipio;
	}
	public int getUnidadeFederacao() {
		return unidadeFederacao;
	}
	public void setUnidadeFederacao(int unidadeFederacao) {
		this.unidadeFederacao = unidadeFederacao;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
    
}
