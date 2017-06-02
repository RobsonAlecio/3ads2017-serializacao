package pacote.execucao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import minha.serializacao.legal.ClasseSerializavel;

public class RunToFile {

	public static void main(String[] args) throws IOException {
		ClasseSerializavel objetoASerSerializado = new ClasseSerializavel(2, "Fulano");
		
		File arquivo = new File("arquivo-de-coisas.serializado");
		FileOutputStream fos = new FileOutputStream(arquivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(objetoASerSerializado);
		
		oos.close();
		fos.close();
		
		System.out.println(objetoASerSerializado);
	}

}
