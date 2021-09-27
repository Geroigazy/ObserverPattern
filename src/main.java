public class Main {

    public static void main(String[] args) {
	// write your code here
        IGaccount acc = new IGaccount("@geroigazy");
        Followers follower = new Followers(acc);
        Followers follower1 = new Followers(acc);
        Post post = new Post("It is text post!!!", "");
        Post post1 = new Post("It is video", "youtube.com");


        acc.addObserv(follower);
        acc.addObserv(follower1);
        acc.addPost(post);
        acc.addPost(post1);

    }
}
