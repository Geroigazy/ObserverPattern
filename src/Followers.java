package com.company;

public class Followers implements Follower {
    IGaccount iGaccount;
    public Followers(IGaccount iGaccount){
        this.iGaccount=iGaccount;
    }

    @Override
    public void update(Post post) {
        if(post.getVideo().isEmpty())
        System.out.println(iGaccount.getNick() + " posted new text message: " + post.getText());
        else
            System.out.println(iGaccount.getNick() + " posted new video: " + post.getVideo() + " " + post.getText());
    }
}
