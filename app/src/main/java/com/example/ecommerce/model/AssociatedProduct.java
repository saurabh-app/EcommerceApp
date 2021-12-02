package com.example.ecommerce.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class AssociatedProduct {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("SKU")
    @Expose
    private String sku;
    @SerializedName("regular_price")
    @Expose
    private String regularPrice;
    @SerializedName("final_price")
    @Expose
    private String finalPrice;
    @SerializedName("currency_code")
    @Expose
    private String currencyCode;
    @SerializedName("remaining_quantity")
    @Expose
    private Integer remainingQuantity;
    @SerializedName("is_featured")
    @Expose
    private Integer isFeatured;
    @SerializedName("new_from_date")
    @Expose
    private String newFromDate;
    @SerializedName("new_to_date")
    @Expose
    private String newToDate;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("boutique_name")
    @Expose
    private String boutiqueName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("delivery_time")
    @Expose
    private String deliveryTime;
    @SerializedName("delivery_time_text")
    @Expose
    private String deliveryTimeText;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(String regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Integer getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Integer remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public Integer getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Integer isFeatured) {
        this.isFeatured = isFeatured;
    }

    public String getNewFromDate() {
        return newFromDate;
    }

    public void setNewFromDate(String newFromDate) {
        this.newFromDate = newFromDate;
    }

    public String getNewToDate() {
        return newToDate;
    }

    public void setNewToDate(String newToDate) {
        this.newToDate = newToDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBoutiqueName() {
        return boutiqueName;
    }

    public void setBoutiqueName(String boutiqueName) {
        this.boutiqueName = boutiqueName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryTimeText() {
        return deliveryTimeText;
    }

    public void setDeliveryTimeText(String deliveryTimeText) {
        this.deliveryTimeText = deliveryTimeText;
    }

}
