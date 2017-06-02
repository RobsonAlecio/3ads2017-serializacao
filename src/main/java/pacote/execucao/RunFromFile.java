package pacote.execucao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import minha.serializacao.legal.ClasseSerializavel;

public class RunFromFile {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File arquivo = new File("arquivo-de-coisas.serializado");
		
		FileInputStream fis = new FileInputStream(arquivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object objetoLido = ois.readObject();
		
		ois.close();
		fis.close();
		
		if (!(objetoLido instanceof ClasseSerializavel)) {
			throw new RuntimeException("Deu caca!");
		}
		
		ClasseSerializavel objetoFinal = (ClasseSerializavel) objetoLido;
		System.out.println(objetoFinal);
	}
}
