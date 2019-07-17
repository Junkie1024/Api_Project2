package com.example.api_project;

import android.os.Parcel;
import android.os.Parcelable;

public class List_Products implements Parcelable {
    String name;
    String lang;
    String cont;
    String ownerdetails;

    public List_Products(String name, String lang, String cont, String ownerdetails) {
        this.name = name;
        this.lang = lang;
        this.cont = cont;
        this.ownerdetails = ownerdetails;
    }

    protected List_Products(Parcel in) {

        name = in.readString();
        lang = in.readString();
        cont = in.readString();
        ownerdetails = in.readString();


    }

    public static final Creator<List_Products> CREATOR = new Creator<List_Products>() {
        @Override
        public List_Products createFromParcel(Parcel in) {
            return new List_Products(in);
        }

        @Override
        public List_Products[] newArray(int size) {
            return new List_Products[size];
        }
    };

    public String getLang() {
        return lang;
    }

    public String getCont() {
        return cont;
    }

    public String getOwnerdetails() {
        return ownerdetails;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setCont(String cont) {
        this.cont = cont;
    }

    public void setOwnerdetails(String ownerdetails) {
        this.ownerdetails = ownerdetails;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(name);
        dest.writeString(lang);
        dest.writeString(cont);
        dest.writeString(ownerdetails);

    }
}

