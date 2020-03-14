package com.igorhenss.domain.property;

import com.igorhenss.domain.Quote;

public interface StringProperty {

    void verifyProperty(Quote quote);

    void nextProperty(StringProperty next);

}
