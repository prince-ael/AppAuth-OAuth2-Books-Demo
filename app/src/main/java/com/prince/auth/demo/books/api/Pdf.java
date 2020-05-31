
package com.prince.auth.demo.books.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Pdf {

    @SerializedName("isAvailable")
    private Boolean mIsAvailable;

    public Boolean getIsAvailable() {
        return mIsAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        mIsAvailable = isAvailable;
    }

}
