package main;

import java.util.List;

import directory.Arquivos;
import directory.Pastas;

import java.util.ArrayList;

public class Directory {
	
	private Pastas data = new Pastas();
	
	public float SizeFolder() {
		
		return SizeFolder(data);
	}
	
	private <T> float SizeFolder(T item) {
		
		if(item instanceof Arquivos) {
			return ((Arquivos) item).getSize();
		}
		else if(item instanceof Pastas) {
			float temp = 0;
			for (int i = 0; i < ((Pastas) item).getLP().size();i++) {
				temp += SizeFolder(((Pastas) item).getLP().get(i));
				System.out.println("LP");
			}
				
			for (int i = 0; i < ((Pastas) item).getLA().size();i++) {
				temp += SizeFolder(((Pastas) item).getLA().get(i));
				System.out.println("LA" + temp);
			}
			return temp;
		}
		
		return 0;
	}
	
	
	
	public Pastas getData() {
		return data;
	}

	public void setData(Pastas data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Directory C = new Directory();
		
		Pastas t = new Pastas();
		Arquivos a = new Arquivos();
		a.setSize(22);
		t.addLA(a);
		t.addLA(a);
		t.addLA(a);
		
		C.setData(t);
		
		System.out.print(C.SizeFolder());
	}
}
