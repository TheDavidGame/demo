package ex_14.controller;
import ex_14.Game;
import ex_14.GameTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameTest test;

    @PostMapping("/postGame")
    public void post(@RequestBody Game game) {
        test.add(game);
    }

    @GetMapping("/getGames")
    public List<Game> getAll() {
        return test.getGames();
    }

    @DeleteMapping("/deleteGame")
    public void delete(@RequestBody Game game) {
        test.deleteGame(game);
    }


}
