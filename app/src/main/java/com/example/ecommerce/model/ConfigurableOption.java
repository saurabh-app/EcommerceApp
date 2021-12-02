package com.example.ecommerce.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfigurableOption {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("attribute_id")
    @Expose
    private String attributeId;
    @SerializedName("attribute_code")
    @Expose
    private String attributeCode;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getAttributeCode() {
        return attributeCode;
    }

    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

}
