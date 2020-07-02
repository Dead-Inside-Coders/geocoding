package com.deadinside.business.model;

public class Copyright
{
    private String text;
    private String imageUrl;
    private String imageAltText;

    public Copyright(String text, String imageUrl, String imageAltText) {
        this.text = text;
        this.imageUrl = imageUrl;
        this.imageAltText = imageAltText;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageAltText() {
        return imageAltText;
    }
}
