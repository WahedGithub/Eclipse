package EncodeandDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingAndDecoding {

	public static void main(String[] args) {
		String str="test123";
		
		byte[] encodeString=Base64.encodeBase64(str.getBytes()); // this will convert the string into bytes
		System.out.println("encoded string:" + new String(encodeString));
		
		byte[] decodedString=Base64.decodeBase64(encodeString);
		System.out.println("decoded string:" + new String(decodedString));
	}

}
