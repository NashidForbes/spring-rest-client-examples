package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Name implements Serializable {
    private static final long serialVersionUID = 1808130534064603058L;
    String first;
    String last;
    String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(
            Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
