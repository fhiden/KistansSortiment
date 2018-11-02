package org.filip.hiden.sortement.kistan.sortement.model;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by fhiden on 2017-03-14.
 */

public class SortementItem implements Parcelable{
    private String  name;
    
    private String  type;
    private double  price;
    private String  unit;
    private float rating;
    private Bitmap image;

    public SortementItem(String name, String type, double price, String unit, float rating, Bitmap image){
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit = unit;
        this.rating = rating;
        this.image = image;

    }

    protected SortementItem(Parcel in) {
        name = in.readString();
        type = in.readString();
        price = in.readDouble();
        unit = in.readString();
        rating = in.readFloat();
        image = in.readParcelable(Bitmap.class.getClassLoader());
    }

    public static final Creator<SortementItem> CREATOR = new Creator<SortementItem>() {
        @Override
        public SortementItem createFromParcel(Parcel in) {
            return new SortementItem(in);
        }

        @Override
        public SortementItem[] newArray(int size) {
            return new SortementItem[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(type);
        parcel.writeDouble(price);
        parcel.writeString(unit);
        parcel.writeFloat(rating);
        parcel.writeParcelable(getImage(),i);

    }
}
