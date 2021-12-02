package com.example.ecommerce.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attribute {

    @SerializedName("option_id")
    @Expose
    private String optionId;
    @SerializedName("option_product_id")
    @Expose
    private String optionProductId;
    @SerializedName("value")
    @Expose
    private String value;

    public String getOptionId() {
        return optionId;
    }

    public void setOptionId(String optionId) {
        this.optionId = optionId;
    }

    public String getOptionProductId() {
        return optionProductId;
    }

    public void setOptionProductId(String optionProductId) {
        this.optionProductId = optionProductId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
