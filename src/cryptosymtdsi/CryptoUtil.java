package cryptosymtdsi;

import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CryptoUtil {
	public static void main(String[] args) throws NoSuchAlgorithmException {
		//recuperation de l'engine.
		KeyGenerator kg=KeyGenerator.getInstance("AES");
		kg.init(128);
		SecretKey k1=kg.generateKey();
		
		System.out.println(k1.getEncoded().length);
		
	}

}
