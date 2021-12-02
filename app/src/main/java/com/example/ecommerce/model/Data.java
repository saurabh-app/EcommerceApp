package com.example.ecommerce.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

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
    @SerializedName("specification")
    @Expose
    private String specification;
    @SerializedName("shipping_free_returns")
    @Expose
    private String shippingFreeReturns;
    @SerializedName("SKU")
    @Expose
    private String sku;
    @SerializedName("is_used")
    @Expose
    private Integer isUsed;
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
    @SerializedName("is_gift")
    @Expose
    private Integer isGift;
    @SerializedName("new_from_date")
    @Expose
    private String newFromDate;
    @SerializedName("new_to_date")
    @Expose
    private String newToDate;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("configurable_option")
    @Expose
    private List<ConfigurableOption> configurableOption = null;
    @SerializedName("related_products")
    @Expose
    private List<RelatedProduct> relatedProducts = null;
    @SerializedName("reviews")
    @Expose
    private List<Object> reviews = null;
    @SerializedName("is_saleable")
    @Expose
    private Integer isSaleable;
    @SerializedName("product_type")
    @Expose
    private String productType;
    @SerializedName("associated_products")
    @Expose
    private List<AssociatedProduct> associatedProducts = null;
    @SerializedName("item_in_cart")
    @Expose
    private Integer itemInCart;
    @SerializedName("item_in_wishlist")
    @Expose
    private Integer itemInWishlist;
    @SerializedName("average_rating")
    @Expose
    private String averageRating;
    @SerializedName("size_guide")
    @Expose
    private String sizeGuide;
    @SerializedName("shop_id")
    @Expose
    private Integer shopId;
    @SerializedName("shop")
    @Expose
    private String shop;
    @SerializedName("shop_description")
    @Expose
    private String shopDescription;
    @SerializedName("shop_image")
    @Expose
    private String shopImage;
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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getShippingFreeReturns() {
        return shippingFreeReturns;
    }

    public void setShippingFreeReturns(String shippingFreeReturns) {
        this.shippingFreeReturns = shippingFreeReturns;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
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

    public Integer getIsGift() {
        return isGift;
    }

    public void setIsGift(Integer isGift) {
        this.isGift = isGift;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<ConfigurableOption> getConfigurableOption() {
        return configurableOption;
    }

    public void setConfigurableOption(List<ConfigurableOption> configurableOption) {
        this.configurableOption = configurableOption;
    }

    public List<RelatedProduct> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<RelatedProduct> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public List<Object> getReviews() {
        return reviews;
    }

    public void setReviews(List<Object> reviews) {
        this.reviews = reviews;
    }

    public Integer getIsSaleable() {
        return isSaleable;
    }

    public void setIsSaleable(Integer isSaleable) {
        this.isSaleable = isSaleable;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public List<AssociatedProduct> getAssociatedProducts() {
        return associatedProducts;
    }

    public void setAssociatedProducts(List<AssociatedProduct> associatedProducts) {
        this.associatedProducts = associatedProducts;
    }

    public Integer getItemInCart() {
        return itemInCart;
    }

    public void setItemInCart(Integer itemInCart) {
        this.itemInCart = itemInCart;
    }

    public Integer getItemInWishlist() {
        return itemInWishlist;
    }

    public void setItemInWishlist(Integer itemInWishlist) {
        this.itemInWishlist = itemInWishlist;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(String averageRating) {
        this.averageRating = averageRating;
    }

    public String getSizeGuide() {
        return sizeGuide;
    }

    public void setSizeGuide(String sizeGuide) {
        this.sizeGuide = sizeGuide;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
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
