import java.net.*;
import java.util.Date;

import javax.swing.JOptionPane;

import java.io.*;

public class clien {
	public static void main(String[] args) throws IOException{
		try {
		Socket cliente = new Socket("localhost", 4999);
	
		ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
	      Date data_atual = (Date)entrada.readObject();
	      JOptionPane.showMessageDialog(null,"Data recebida do servidor:" + data_atual.toString());
	      entrada.close();
	      System.out.println("Conexão encerrada");
		}
		catch(Exception e) {
		      System.out.println("Erro: " + e.getMessage());
		 }
	}
}
