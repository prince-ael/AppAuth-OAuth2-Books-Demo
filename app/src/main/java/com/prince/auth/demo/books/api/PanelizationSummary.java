
package com.prince.auth.demo.books.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PanelizationSummary {

    @SerializedName("containsEpubBubbles")
    private Boolean mContainsEpubBubbles;
    @SerializedName("containsImageBubbles")
    private Boolean mContainsImageBubbles;

    public Boolean getContainsEpubBubbles() {
        return mContainsEpubBubbles;
    }

    public void setContainsEpubBubbles(Boolean containsEpubBubbles) {
        mContainsEpubBubbles = containsEpubBubbles;
    }

    public Boolean getContainsImageBubbles() {
        return mContainsImageBubbles;
    }

    public void setContainsImageBubbles(Boolean containsImageBubbles) {
        mContainsImageBubbles = containsImageBubbles;
    }

}
