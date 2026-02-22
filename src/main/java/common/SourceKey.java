package common;

import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public class SourceKey {
    private final String identifier;
    private final Map<String, String> params;

    public SourceKey(String identifier, Map<String, String> params) {
        this.identifier = Objects.requireNonNull(identifier, "Identifier can't be null");
        this.params = params != null ? Collections.unmodifiableMap(params) : Collections.emptyMap();
    }

    public String getIdentifier() {
        return identifier;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public String getParam(String key) {
        return params.get(key);
    }


    @Override
    public String toString() {
        return "SourceKey {" +
                "identifier='" + identifier + '\'' +
                ", params=" + params +
                '}';
    }
}
