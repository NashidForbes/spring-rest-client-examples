package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Billing implements Serializable {
    private static final long serialVersionUID = 2643851317144639495L;

    private creditCard card;

    public creditCard getCard() {
        return card;
    }

    public void setCard(creditCard card) {
        this.card = card;
    }

    private Map<String, Object> additionalProperties =new HashMap<String, Object>();

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(
            Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
