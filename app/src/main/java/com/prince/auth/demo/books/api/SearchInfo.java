
package com.prince.auth.demo.books.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class SearchInfo {

    @SerializedName("textSnippet")
    private String mTextSnippet;

    public String getTextSnippet() {
        return mTextSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        mTextSnippet = textSnippet;
    }

}
