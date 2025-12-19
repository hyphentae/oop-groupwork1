public class Customer {
    private String name;

    public Customer(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Nuh uh");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
