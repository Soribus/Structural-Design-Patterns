import java.util.Base64;

public class EncryptionDecorator{

    /*
            Todo:
            1. Erweitere EncryptionDecorator um DataSourceDecorator (extends ...).
            2. Erzeuge den Konstruktur von EncryptionDecorator.
            3. Überschreibe die vererbten Methoden writeData und readData mit Hilfe der Methoden "encode"
                und "decode"
     */


    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
