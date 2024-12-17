package directory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHandler <T> {

    private String arqName;

    public FileHandler(String arqName) {
        this.arqName = arqName;
    }

    public void save(T data) {
    	try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arqName))) {
    	    outputStream.writeObject(data);
    	} catch (IOException e) {
    	    // Tratar a exceção
    	}
    }
	@SuppressWarnings("unchecked")
	public T read() { // Retorna uma String
    	T data = null;
    	try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(arqName))) {
    	    data = (T) inputStream.readObject(); // Type casting necessário
    	} catch (IOException | ClassNotFoundException e) {
    	    // Tratar a exceção
    	}
    	return data;
    }
}