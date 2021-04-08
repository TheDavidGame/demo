package ex_14.controller;


import ex_14.Game;
import ex_14.GameAuthor;
import ex_14.GameAuthorTest;
import ex_14.GameTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameAuthorController {
    @Autowired
    private GameAuthorTest test;

    @PostMapping("/postGameAuthor")
    public void post(@RequestBody GameAuthor gameauthor) {
        test.add(gameauthor);
    }

    @GetMapping("/getGameAuthor")
    public List<GameAuthor> getAll() {
        return test.getAll();
    }

    @DeleteMapping("/deleteGameAuthor")
    public void delete(@RequestBody GameAuthor  gameauthor) {
        test.delete(gameauthor);
    }
}
