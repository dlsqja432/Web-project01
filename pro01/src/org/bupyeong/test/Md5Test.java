package org.bupyeong.test;

import java.security.NoSuchAlgorithmException;

import org.bupyeong.util.AES256;

public class Md5Test {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		String pw = "1234";
		String res = AES256.md5(pw);
		System.out.println("암호화 전 비밀번호: " + pw);
		System.out.println("암호화 후 비밀번호: " + res);
	}
}
