package br.com.orei.brewer.storage;

import org.springframework.web.multipart.MultipartFile;

public interface FotoStorage {
	
	public String salvarTemporariamente(MultipartFile[] files);

	public byte[] recuperarTemporaria(String nome);

	public void salvar(String foto);

	public byte[] recuperar(String foto);
	
	
	
}
