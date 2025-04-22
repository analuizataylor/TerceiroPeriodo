package listacontigua_item;

public class Item {
	// atributos
	private int codigo;
	private String nome;
	
	// construtor
	// NomeDaClasse + (tipo + atributo)
	public Item(int codigo, String nome) {
		super();
		// this.atributo = atributo;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	// getAtributo + return = função
	public int getCodigo() {
		return codigo;
	}
	
	// setAtributo + tipo atributo = procedimento
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// String + toString + return atributos
	@Override
	public String toString() {
		return "Codigo=" + codigo + ", Nome=" + nome;
	}
	
}
