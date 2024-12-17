package Content;

import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class connect {
	
	static String url = "jdbc:mysql://localhost:3306/filme";
	static String username = "teste";
	static String password = "123";
	
	public static void main(String[] args) {
		System.out.print("Teste");
		
		try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, username, password);
		    System.out.println("Connected to MySQL database!");
		    
		    String consultaSQL = "SELECT * FROM genre"; // Define the SQL query
		    Statement statement = connection.createStatement(); // Create a Statement object
		    
		    // Execute your database operations here (queries, inserts, updates, deletes)
		    ResultSet resultSet = statement.executeQuery(consultaSQL);

		 // Percorrer cada linha do conjunto de resultados
		    while (resultSet.next()) {
		     // Obter os valores das colunas
		     int id = resultSet.getInt("id");
		     String nome = resultSet.getString("nome");
		     double preco = resultSet.getDouble("assitido");
		     int quantidade = resultSet.getInt("quantidade");

		     // Exibir os valores no console
		     System.out.println("ID: " + id);
		     System.out.println("Nome: " + nome);
		     System.out.println("Preço: " + preco);
		     System.out.println("Quantidade: " + quantidade);
		     System.out.println("----------------------");
		 }

		    connection.close();
		    System.out.println("Connection to MySQL database closed.");
		} catch (ClassNotFoundException | SQLException e) {
		    e.printStackTrace();
		}
	}
	
}
