package ex_14;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameAuthorTest {
    private List<GameAuthor> gameauthors;

    public GameAuthorTest() {
        gameauthors = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        gameauthors.add(new GameAuthor("A", 2005));
        gameauthors.add(new GameAuthor("B", 2004));
        gameauthors.add(new GameAuthor("C", 2002));
    }
    public void add(GameAuthor gameauthor) {
        gameauthors.add(gameauthor);
    }


    public List<GameAuthor> getAll() {
        return gameauthors;
    }


    public void delete(GameAuthor gameauthor) {
        gameauthors.remove(gameauthor);
    }
}
