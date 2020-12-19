package com.Module2.Domain.V1;

public class Image {
    private String imgLoc;
    private String imgDesc;
    private int dimensionX;
    private int dimensionY;
    private boolean defaultImg;

    /*Getter for imgLoc*/
    public String getImgLoc(){
        return imgLoc;
    }
    /*Setter for imgLoc*/
    public void setImgLoc(String imgLoc){
        this.imgLoc = imgLoc;
    }
    /*Getter for imgDesc*/
    public String getImgDesc() {
        return imgDesc;
    }
    /*Setter for imgDesc*/
    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }
    /*Getter for Dimension*/
    public int getDimensionX() {
        return dimensionX;
    }
    /*Setter for Dimension*/
    public void setDimensionX(int dimensionX) {
        this.dimensionX = dimensionX;
    }
    /*Getter for Dimension Y*/
    public int getDimensionY() {
        return dimensionY;
    }
    /*Setter for Dimension Y*/
    public void setDimensionY(int dimensionY) {
        this.dimensionY = dimensionY;
    }
    /*Getter for defaultImg*/
    public boolean isDefaultImg() {
        return defaultImg;
    }
    /*Setter for Default Images*/
    public void setDefaultImg(boolean defaultImg) {
        this.defaultImg = defaultImg;
    }
}
