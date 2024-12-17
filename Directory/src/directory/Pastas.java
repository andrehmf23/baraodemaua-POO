package directory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pastas {
	private int id;
	private Date data_c, data_a;
	private String nome, criador;
	private Pastas pasta_mae;
	private List<Arquivos> LA = new ArrayList<>();
	private List<Pastas> LP = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCriador() {
		return criador;
	}
	public void setCriador(String criador) {
		this.criador = criador;
	}
	public Pastas getPasta_mae() {
		return pasta_mae;
	}
	public void setPasta_mae(Pastas pasta_mae) {
		this.pasta_mae = pasta_mae;
	}
	public List<Arquivos> getLA() {
		return LA;
	}
	public void setLA(List<Arquivos> lA) {
		LA = lA;
	}
	public List<Pastas> getLP() {
		return LP;
	}
	public void setLP(List<Pastas> lP) {
		LP = lP;
	}
	
	public void addLP(Pastas p) {
		LP.add(p);
	}
	
	public void addLA(Arquivos a) {
		LA.add(a);
	}
	
}
