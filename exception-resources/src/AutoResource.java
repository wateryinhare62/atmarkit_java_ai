public class AutoResource implements AutoCloseable {
    private final String name;

    public AutoResource(String name) {
        this.name = name;
        System.out.println("[AutoResource] opened: " + name);
    }

    public void doSomething() {
        System.out.println("[AutoResource] doing work: " + name);
    }

    @Override
    public void close() {
        System.out.println("[AutoResource] closed: " + name);
    }
}
