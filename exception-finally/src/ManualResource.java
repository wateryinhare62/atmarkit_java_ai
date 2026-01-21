public class ManualResource {
    private final String name;
    private boolean closed = false;

    public ManualResource(String name) {
        this.name = name;
        System.out.println("[ManualResource] open: " + name);
    }

    public void use() {
        if (closed) throw new IllegalStateException("resource already closed");
        System.out.println("[ManualResource] use: " + name);
    }

    public void close() {
        closed = true;
        System.out.println("[ManualResource] close: " + name);
    }
}
