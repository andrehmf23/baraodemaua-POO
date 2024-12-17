package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ControlFile {
	public String Read(String name) throws IOException {
		FileReader fileReader = new FileReader("meu_arquivo.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }

        bufferedReader.close();
        fileReader.close();
		return linha;
	}
	
	public void Write(String name) throws IOException {
		FileWriter file = new FileWriter("");
		file.write("Teste");
		file.close();
	}
}
