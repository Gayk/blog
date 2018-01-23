package blog.controller;

import blog.models.Post;
import blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by monik on 23.01.2018.
 */
@Controller
public class HomeController {
    @Autowired
    PostService postService;
    @RequestMapping("/")
    public String index(Model model){
        List<Post> latest5Posts =postService.findLatest5();
        model.addAttribute( "latest5posts", latest5Posts );

        List<Post> latest3Post = latest5Posts.stream().limit( 3 ).collect( Collectors.toList());
        model.addAttribute( "latest3posts" , latest3Post);
        return "index";
    }
}
