package bootDemoApp.topicController;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

//    mutating the object in an immutable way
    private List<Topic> topics=
         new ArrayList<>(Arrays.asList(
                new Topic(21,"Spring frame work","spring frame work description"),
                new Topic(22,"node js","serverside runtime environment"),
                new Topic(23,"angular","creation of single page applications"),
                new Topic(24,"react js","creation of user interfaces")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

//    get method
    public Topic getTopic(int id){
        return topics.stream().filter((topics)->topics.getId()==id).findAny().get();
    }


//    post / create method
    public void addTopic(Topic topic){
        topics.add(topic);
    }


//    Update method
    public void updateTopic(int id,Topic topic){
        for (int i=0;i<topics.size();i++){
            Topic t=topics.get(i);
            if(t.getId()==id){
                topics.set(i,topic);
            }
        }
    };

//Delete Method
    public void deleteTopic(int id){
        topics.removeIf(t->t.getId()==id);
    }
}
