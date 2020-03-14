package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public class LengthBiggerThanTwenty implements StringProperty {

    private StringProperty next;

    @Override
    public void verifyProperty(Quote quote) {
        if (quote.getString().length() > 20) {
            quote.addProperty(Property.LENGTH_IS_BIGGER_THAN_TWENTY);
        }
        next.verifyProperty(quote);
    }

    @Override
    public void nextProperty(StringProperty next) {
        this.next = next;
    }

}
