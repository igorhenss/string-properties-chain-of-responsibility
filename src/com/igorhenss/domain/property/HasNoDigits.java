package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class HasNoDigits implements StringProperty {

    private StringProperty next;

    @Override
    public void verifyProperty(Quote quote) {
        if (!quote.getString().matches(".*\\d+.*")) {
            quote.addProperty(Property.HAS_NO_DIGITS);
        }
        next.verifyProperty(quote);
    }

    @Override
    public void nextProperty(StringProperty next) {
        this.next = next;
    }

}
