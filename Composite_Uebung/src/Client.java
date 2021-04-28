public class Client {

    public static void main(String[] args) {
        // Zusammenfasssung der Aufgabe: Container(2 Container (2 Blatt + Container (1 Blatt)))

        //Mein Vorschlag: erstellen sie zuerst die kleineren Container mit Blättern.
        //Dann füge diese Container den mainContainer hinzu (sozusagen von klein zu groß arbeiten)
        //Zum Abschluss die calculate Methode des großen Containers ausführen

        Container mainContainer = new Container();

        Container großerContainer = new Container();
        Container kleinerContainer_1 = new Container();
        Container kleinerContainer_2 = new Container();
        Container sehrKleinerContainer_1 = new Container();
        Container sehrKleinerContainer_2 = new Container();

        Leaf leaf1 = new Leaf(1);
        Leaf leaf2 = new Leaf(2);
        Leaf leaf3 = new Leaf(3);
        Leaf leaf4 = new Leaf(4);
        Leaf leaf5 = new Leaf(5);

        //insert code here

        mainContainer.calculateWeight();

    }

    //Frage: Warum kann ich Blätter und Container nicht einfach direkt dem Container als Child mitgeben ohne Component Interface?
    //Wozu brauche ich das Interface in diesem Beispiel und wie würde es anders auch gehen?
    //Bedenke dass ein Container sowohl andere Container als auch Blätter beinhalten kann.
}
