package org.bupyeong.test;

import java.security.NoSuchAlgorithmException;

import org.bupyeong.util.AES256;

public class Sha256Test {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String pw = "1234";
		String res = AES256.sha256(pw);
		System.out.println("��ȣȭ �� ��й�ȣ: " + pw);
		System.out.println("��ȣȭ �� ��й�ȣ: " + res);
	}
}
