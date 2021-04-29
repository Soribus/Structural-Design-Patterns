// An adapter class lets you fit square pegs into round holes.
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public SquarePeg getPeg() {
        return peg;
    }

    @Override
    public int getRadius() {
        // The adapter pretends that it's a round peg with a
        // radius that could fit the square peg that the adapter
        // actually wraps.
        return ((int) (peg.getSideLength() * Math.sqrt(2) / 2));
    }

    public static void main(String[] args) {
        // 1.) Erstelle ein rundes Loch mit einem Radius von 5. Erstelle ein runden Peg mit einem Radius von 5.
        //Passt der Pag durch das Loch?


        //2.) Erstelle ein viereckigen Peg mit der Seitenlänge von 5.
        //Passt er durch das vorherig erstellte Loch?


        //3.) Versuch den viereckigen Peg mithilfe eines Adapters durch das Loch zu bringen.
        //Passt er durch das vorherig erstellte Loch?


        //4.) Erstelle ein viereckigen Peg mit einer Seitenlänge von 10.
        //Passt er mithilfe eines Adapters durch das vorherig erstellte Loch?


    }
}
