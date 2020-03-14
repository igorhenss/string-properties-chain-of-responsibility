package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class HasNoLetters implements StringProperty {

    private StringProperty next;

    @Override
    public void verifyProperty(Quote quote) {
        if (!quote.getString().matches(".*[a-zA-Z]+.*")) {
            quote.addProperty(Property.HAS_NO_LETTERS);
        }
        next.verifyProperty(quote);
    }

    @Override
    public void nextProperty(StringProperty next) {
        this.next = next;
    }

}
