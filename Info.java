package com.example.marry.tourguideapp;

import android.widget.ListView;

public class Info{
    /**
     *     image of the element
     */
    private int mImage;

    /**
     *     element's name
     */
    private  int mName;

    /**
     *     element's adress
     */
    private int mAdress;

    /**
     *     element's phone
     */
    private int mPhone;

    /**
     *     description
     */
    private int mDescription;

    /**
     *     constructor of the calss
     */
    public Info(int Image,int Name){
        mName = Name;
        mImage = Image;
    }

    /**
     *     constructor of the calss
     */
    public Info(int Image,int Name, int Description){
        mName = Name;
        mImage = Image;
        mDescription = Description;
    }


    /**
     *     constructor of the calss
     */
    public Info(int Image, int Name, int Adress, int Phone){
        mImage = Image;
        mName = Name;
        mAdress = Adress;
        mPhone = Phone;
    }

    /**
     *     method to get the image of the element
     */
    public int getmImage() {
        return mImage;
    }

    /**
     *     method to get the name of the element
     */
    public int getmName() {
        return mName;
    }

    /**
     *     method to get the adress of the element
     */
    public int getmAdress() {
        return mAdress;
    }

    /**
     *     method to get the phone of the element
     */
    public int getmPhone() {
        return mPhone;
    }

    /**
     *     method to get the description of the element
     */
    public int getmDescription(){
        return mDescription;
    }
}
