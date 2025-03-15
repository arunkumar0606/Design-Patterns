package Observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {

    private List<Subscriber> subscribers=new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    
    }

    public void notifySubscribers(String videoTitle){
        subscribers.stream().forEach(x->x.update(videoTitle));
    }
    
}
