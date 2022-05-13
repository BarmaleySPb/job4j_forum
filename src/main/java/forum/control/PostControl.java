package forum.control;

import forum.model.Post;
import forum.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PostControl {

    private final PostService posts;

    public PostControl(PostService posts) {
        this.posts = posts;
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Post post) {
        posts.add(post);
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String update(@RequestParam("id") long id, Model model) {
        model.addAttribute("post", posts.get(id));
        return "edit";
    }

    @GetMapping("/delete")
    public String delete(@ModelAttribute Post post) {
        posts.delete(post);
        return "redirect:/";
    }
}