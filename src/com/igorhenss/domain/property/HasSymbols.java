package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class HasSymbols implements StringProperty {

    private StringProperty next;

    @Override
    public void verifyProperty(Quote quote) {
        if (!quote.getString().matches("[a-zA-Z0-9 ]+")) {
            quote.addProperty(Property.HAS_SYMBOLS);
        }
        next.verifyProperty(quote);
    }

    @Override
    public void nextProperty(StringProperty next) {
        this.next = next;
    }

}
