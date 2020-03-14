package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class HasSpaces implements StringProperty {

    private StringProperty next;

    @Override
    public void verifyProperty(Quote quote) {
        if (quote.getString().contains(" ")) {
            quote.addProperty(Property.HAS_SPACES);
        }
        next.verifyProperty(quote);
    }

    @Override
    public void nextProperty(StringProperty next) {
        this.next = next;
    }

}
