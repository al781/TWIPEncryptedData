package com.company;

public class Cipherer {

    private int shifter;

    public Cipherer() {
        //No Inputs because I don't wanna
    }

    public String encrypt(String message, int shifter) {
        String encryptedString = "";
        int length = message.length();
        for (int x = 0; x < length; x++) {
            char c = (char) (message.charAt(x) + shifter);
            if (c > 'z')
                encryptedString += (char) (message.charAt(x) - (26 - shifter));
            else
                encryptedString += (char) (message.charAt(x) + shifter);
        }
        return encryptedString;
    }

    public String decrypt(String message, int shifter) {
        String encryptedString = "";
        int length = message.length();
        for (int x = 0; x < length; x++) {
            char c = (char) (message.charAt(x) + shifter);
            if (c == 'a')
                encryptedString += (char) (message.charAt(x) - (26 + shifter));
            else
                encryptedString += (char) (message.charAt(x) - shifter);
        }
        return encryptedString;

    }
}
