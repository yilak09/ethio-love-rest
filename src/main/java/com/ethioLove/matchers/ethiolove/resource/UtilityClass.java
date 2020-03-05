package com.ethioLove.matchers.ethiolove.resource;

final public  class  UtilityClass {
    public static Integer staticMethod(Long sum){
//
        throw new RuntimeException(
                "I will not be executed. I will anyway be mocked out"
        );
    }
}
