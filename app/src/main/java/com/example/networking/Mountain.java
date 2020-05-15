package com.example.networking;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public Mountain(String name) {
        this.name = name;
        this.location = "";
        this.height = 0;
    }

    public String toString() { return name; }

    public String info() {
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has an height of ";
        str+=Integer.toString(height);
        str+="m.";
        return str;
    }

    public void setHeight (int newHeight) {
        height=newHeight;
    }
}
