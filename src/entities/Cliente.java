package entities;

// definicao da classe
public class Cliente {
	// atributos (dados/ campos)
	private Integer idCliente;
	private String cpf;
	private String nome;
	private String email;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}
               
	public void setEmail(String email) {
		this.email = email;
	}

}
