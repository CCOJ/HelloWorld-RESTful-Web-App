package hello;

/**
 * Greeting representation. This is a resource representation class.
 * We fill in the object with the fields in our case: id and content.
 * The Controller will serve these greeting objects.
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
