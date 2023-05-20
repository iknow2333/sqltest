public abstract class NewsWorker {
    protected String name;
    protected String position;

    public NewsWorker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println(position + ": " + name);
    }
}
