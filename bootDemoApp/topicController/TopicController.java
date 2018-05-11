package bootDemoApp.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;


//    get all the topics
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getAllTopics();
    }


//    get single topic
    @RequestMapping("/topics/{id}")
    public Topic getTopics(@PathVariable int id){
        return topicService.getTopic(id);
    }



//    post topic
    @RequestMapping(method = RequestMethod.POST,path="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }


//    put method
    @RequestMapping(method = RequestMethod.PUT,path = "/topics/{id}")
    public void updateTopic(@PathVariable int id,@RequestBody Topic topic){
        topicService.updateTopic(id,topic);
    }


//    Delete Method
    @RequestMapping(method=RequestMethod.DELETE,path="/topics/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }

}
