public class Client {

    public static void main(String[] args) {

        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        /*
                Todo:
                1. Erzeuge ein DataSourceDecorator namens "encoded", welcher durch eine FileDataSource instanziert wird.
                    Die FileDataSource ist mit CompressionDecorator und EncryptionDecorator dekoriert.
                2. Rufe die Methode writeData() durch das erzeugte Objekt auf und übergib den String "salaryRecords".
                3. Gib im Konstruktor die Daten aus (Aufruf: readData()).
         */

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        //System.out.println(...);
    }
}
