package ciphertools.caesarcipher.test;

import ciphertools.caesarcipher.encryption.*;

import ciphertools.caesarcipher.utils.*;

public class TestMessageEncryption {
    public static void main(String[] args) {
        ShiftDegree shiftDegree;
        Message clearText, cipherText;
        
        shiftDegree = new ShiftDegree((byte)1);
        clearText = new Message();
        cipherText = new Message();
        
        clearText.setMessage("Kneel Before Zod");
        new CaesarEncryption(shiftDegree, clearText, cipherText);
        
        System.out.println("Clear Text:\n\n" + clearText.getMessage() + "\n");
        System.out.println("Cipher Text:\n\n" + cipherText.getMessage() + "\n");
    }
}
