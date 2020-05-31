
package com.prince.auth.demo.books.api;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class RetailPrice {

    @SerializedName("amount")
    private Double mAmount;
    @SerializedName("amountInMicros")
    private Long mAmountInMicros;
    @SerializedName("currencyCode")
    private String mCurrencyCode;

    public Double getAmount() {
        return mAmount;
    }

    public void setAmount(Double amount) {
        mAmount = amount;
    }

    public Long getAmountInMicros() {
        return mAmountInMicros;
    }

    public void setAmountInMicros(Long amountInMicros) {
        mAmountInMicros = amountInMicros;
    }

    public String getCurrencyCode() {
        return mCurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        mCurrencyCode = currencyCode;
    }

}
