package com.Module2.Domain.V1;

public class BrandV1 {
    private String name;
    private String description;
    private Image[] images;

    /* Constructor for the class*/
    public void BrandV1(String name){
        this.name = name;
        /*Initializing the array to 3 */
        this.images = new Image[3];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image[] getImage() {
        return images;
    }

    public void setImage(Image[] images) {
        this.images = images;
    }

    /** Method addImage. This iterates over the images array, if the array index is null the value is set. **/
    public void addImage(Image image) {
        for (int i = 0; i < this.images.length; i++) {
            if (null == this.images[i]) {
                this.images[i] = image;
                return;
            }
        }
    }

    /** Method getDefaultImage returns the default image of the Brand **/
    public Image getDefaultImage() {
        for (int i = 0; i < this.images.length; i++) {
            if (this.images[i].isDefaultImg()) {
                return this.images[i];
            }
        }
        return null;
    }
}
