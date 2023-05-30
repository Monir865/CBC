package Application;


public class App {

    public static void main(String[] args) {
    	
        CBC aes = CBC.init("hello world", "ciphering", true);
        String encryptedMessage = (aes.encrypt());

        CBC decryptAes = CBC.init(encryptedMessage.replaceAll(" ", ""), "ciphering", true);
        decryptAes.decrypt();
        
    }


}