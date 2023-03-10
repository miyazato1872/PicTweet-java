package in.java.learning.pictweet;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class TweetController {

    private final TweetRepository tweetRepository;

    @GetMapping
    public String showTweet (Model model){
        var tweetList = tweetRepository.findAll();
        model.addAttribute("tweetList", tweetList);
        return "index";
    }
}
