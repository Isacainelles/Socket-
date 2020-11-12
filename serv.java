import java.net.*;
import java.util.*;
import java.io.*;

public class serv {
	public static void main(String[] args) throws IOException{
		try {
			ServerSocket servidor = new ServerSocket(4999);
			System.out.println("Servidor Iniciado");
			
			while(true) {
		        // o método accept() bloqueia a execução até que
		        // o servidor receba um pedido de conexão
		        Socket cliente = servidor.accept();
		        System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
		        ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
		        saida.flush();
		        saida.writeObject(new Date());
		        saida.close();
		        cliente.close();
		      }
		}
		catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
}
