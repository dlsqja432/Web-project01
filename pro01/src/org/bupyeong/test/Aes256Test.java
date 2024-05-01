package org.bupyeong.test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.bupyeong.util.AES256;

public class Aes256Test {

	public static void main(String[] args) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidParameterSpecException, UnsupportedEncodingException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
		String pw = "5678";
		String key = "%02x";
		String en_res = AES256.encryptAES256(pw, key);
		System.out.println("��ȣȭ �� ��й�ȣ: " + pw);
		System.out.println("��ȣȭ �� ��й�ȣ: " + en_res);
		
		String de_res = AES256.decryptAES256(en_res, key);
		System.out.println("��ȣȭ �� ��й�ȣ: " + de_res);
	}
}