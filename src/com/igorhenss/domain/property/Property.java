package com.igorhenss.domain.property;

import java.util.Arrays;

public enum Property {

    HAS_NO_DIGITS("Has no digits"),
    HAS_NO_LETTERS("Has no letters"),
    HAS_SPACES("Has spaces"),
    HAS_SYMBOLS("Has symbols"),
    LENGTH_IS_BIGGER_THAN_TWENTY("Length is bigger than twenty");

    private String identifier;

    Property(String identifier) {
        this.identifier = identifier;
    }

    public String getIdentifier() {
        return identifier;
    }

    public static Property fromIdentifier(String identifier) {
        return Arrays.stream(values())
                .filter(value -> value.identifier.equals(identifier))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Property not found."));
    }

}
