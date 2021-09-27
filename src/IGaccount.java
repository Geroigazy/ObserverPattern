package com.company;

import java.util.ArrayList;
import java.util.List;

public class IGaccount {
    private String nick;
    private String post;
    private List<Followers> followers = new ArrayList<>();
    private List<Post> posts = new ArrayList<>();

    public IGaccount(String nick){
        this.nick=nick;
    }

    public void addObserv(Followers follower){
        this.followers.add(follower);
    }

    public void addPost(Post post){
        this.posts.add(post);
        Notify(post);
    }
    
    private void removePost(Post post){
        this.posts.remove(post);
    }

    public String getNick() {
        return nick;
    }

    public void removeObserv(Followers follower){
        this.followers.remove(follower);
    }

    public String getPost() {
        return post;
    }

    public void Notify(Post post){
        for (Followers followers: this.followers) {
            followers.update(post);
        }
    }

//    public void setPost(String post){
//        this.post=post;
//        Notify();
//    }
}
