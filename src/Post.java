package com.company;

public class Post {
    String text;
    String video;

    public Post(String text){
        this.text=text;
    }

    public Post(String text, String video){
        this.video=video;
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public String getVideo() {
        return video;
    }
}
