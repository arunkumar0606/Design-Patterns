package Observer;

public class Youtuber {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel=new YoutubeChannel();
        User user=new User("akay");
        User user1=new User("akash");
        User user2=new User("divs");
        User user3=new User("john");
        youtubeChannel.addSubscriber(user);
        youtubeChannel.addSubscriber(user1);
        youtubeChannel.addSubscriber(user2);
        youtubeChannel.addSubscriber(user3);

        //upload a video --publish 
        youtubeChannel.notifySubscribers("Java Springboot tutorial");
    }
    
}
