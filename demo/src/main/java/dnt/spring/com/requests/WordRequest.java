package dnt.spring.com.requests;

public class WordRequest {

    private String name;

    public WordRequest(String name) {
        this.name = name;
    }

    public WordRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WordRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
