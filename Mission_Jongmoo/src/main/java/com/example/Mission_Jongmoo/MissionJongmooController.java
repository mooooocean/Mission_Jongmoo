package com.example.Mission_Jongmoo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/boards")
public class MissionJongmooController {
    public class BoardController {
        private List<MissionJongmooApplication.Board> boards = new ArrayList<>();

        @GetMapping("/")
        public String showBoards(Model model) {
            model.addAttribute("boards", boards);
            return "boards/index";
        }

        @GetMapping("/{boardId}")
        public String showPosts(@PathVariable String boardId, Model model) {
            // Implement logic to fetch posts for the specified boardId
            return "boards/posts";
        }
    }

    // PostController.java
    @Controller
    @RequestMapping("/boards/{boardId}/posts")
    public class PostController {
        @GetMapping("/{postId}")
        public String showPost(@PathVariable String boardId, @PathVariable String postId, Model model) {
            // Implement logic to fetch post details (including comments) for the specified postId
            return "posts/show";
        }

        @PostMapping("/{postId}/add_comment")
        public String addComment(@PathVariable String boardId, @PathVariable String postId, Comment comment) {
            // Implement logic to add a comment to the specified post
            return "redirect:/boards/{boardId}/posts/{postId}";
        }
    }

}
