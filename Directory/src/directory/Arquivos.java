package directory;

import java.util.Date;

public class Arquivos {
	private int id;
	private float size;
	private Date data_c, data_a;
	private String nome, tipo, autor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public Date getData_c() {
		return data_c;
	}
	public void setData_c(Date data_c) {
		this.data_c = data_c;
	}
	public Date getData_a() {
		return data_a;
	}
	public void setData_a(Date data_a) {
		this.data_a = data_a;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
