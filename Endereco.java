
public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String unidade;
	private int ibge;
    private String gia;

    // construtor default de teste
     public Endereco() {
     }

// um construtor que inicializa os atributos
      public Endereco(String cep, String logradouro, String complemento, String bairro, String localidade, String uf, String unidade, int ibge, String gia) {
           this.setCep(cep);
           this.setLogradouro(logradouro);
           this.setComplemento(complemento);
           this.setBairro(bairro);
           this.setLocalidade(localidade);
           this.setUf(uf);
           this.unidade = unidade;
           this.ibge = ibge;
           this.gia = gia;
      }

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	
}
