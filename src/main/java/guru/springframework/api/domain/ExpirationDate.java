package guru.springframework.api.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// TODO does not show up in restTempate.
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timeZone;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private static final long serialVersionUID = 925350799799576080L;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(Integer timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(
            Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
