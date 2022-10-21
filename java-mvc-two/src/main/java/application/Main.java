package application;

import entities.Comment;
import entities.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Felipe Pereira
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow, that is awesome");
        Post post1 = new Post(
                sdf.parse("21/05/2022 13:05:12"),
                "Traveling to New Zeland",
               "I´m going to visit this wonderful country",
                12
        );
        
        post1.addComment(comment1);
        post1.addComment(comment2);
        
        System.out.println(post1);
        
    }
}
