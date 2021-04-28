public interface DataSource {

    // The component interface defines operations that can be
    // altered by decorators.

    public void writeData(String data);

    public String readData();
}
