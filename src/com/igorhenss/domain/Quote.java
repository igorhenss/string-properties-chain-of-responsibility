package com.igorhenss.domain;

import com.igorhenss.domain.property.Property;

import java.util.ArrayList;
import java.util.List;

public class Quote {

    private final String string;

    private final List<Property> properties = new ArrayList<>();

    public Quote(String string) {
        this.string = string;
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public void addPropertyFromIdentifier(String identifier) {
        this.properties.add(Property.fromIdentifier(identifier));
    }

    public String getString() {
        return string;
    }

    public List<Property> getProperties() {
        return properties;
    }

}
