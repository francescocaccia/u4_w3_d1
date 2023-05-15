package u4_w3_d1;

import java.sql.Connection;
import java.sql.DriverManager;

public class esercizio1 {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/u4_w3_d1?useSSL=false";
		String username = "postgres";
		String password = "1234";

		try {
			System.out.println("Connecting to PG ...");

			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void insertCliente() {

	}

}
