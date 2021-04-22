public class Client {

    public static void main(String[] args) {
        // Zusammenfasssung der Aufgabe: Container(2 Container (2 Blatt + Container (1 Blatt)))

        //Mein Vorschlag: erstellen sie zuerst die kleineren Container mit Blättern.
        //Dann füge diese Container den mainContainer hinzu (sozusagen von klein zu groß arbeiten)
        //Zum Abschluss die calculate Methode des großen Containers ausführen

        Container mainContainer = new Container();

        //insert code here

        mainContainer.calculateWeight();

    }

    //Frage: Warum kann ich Blätter und Container nicht einfach direkt dem Container als Child mitgeben?
    //Wozu brauche ich das Interface in diesem Beispiel und wie würde es anders auch gehen?
    //Bedenke dass ein Container sowohl andere Container als auch Blätter beinhalten kann.
}
