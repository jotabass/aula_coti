package repositories;

import java.io.PrintWriter;
import entities.Cliente;

public class ClienteRepository {
	public void exportarDados(Cliente cliente) {
		try { // tentativa

			// criando um arquivo em modo de escrita
			PrintWriter printWriter = new PrintWriter("c:\\temp\\clientes.txt");

			// escrever o conteudo do arquivo
			printWriter.print("\nID....: " + cliente.getIdCliente());
			printWriter.print("\nNOME..: " + cliente.getNome());
			printWriter.print("\nEMAIL.: " + cliente.getEmail());
			printWriter.print("\nCPF...: " + cliente.getCpf());

			printWriter.flush(); // salvar o arquivo
			printWriter.close(); // fechar o arquivo

			System.out.println("\nDados gravados com sucesso");
		} catch (Exception e) { // captura erro!
			// imprimir o detalhamento do erro
			e.printStackTrace();
		}

	}

}
