import org.example.MovieManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void addFilmFindAll() {
        MovieManager manager = new MovieManager();

        manager.add("One film");
        manager.add("Two film");
        manager.add("Three film");
        manager.add("four film");
        manager.add("five film");
        manager.add("six film");
        manager.add("seven film");

        String[] expected = {"One film", "Two film", "Three film", "four film", "five film", "six film", "seven film"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmFindLast() {
        MovieManager manager = new MovieManager();

        manager.add("One film");
        manager.add("Two film");
        manager.add("Three film");
        manager.add("four film");
        manager.add("five film");
        manager.add("six film");
        manager.add("seven film");

        String[] expected = {"seven film", "six film", "five film", "four film", "Three film"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        MovieManager manager = new MovieManager(3);
        manager.add("One film");
        manager.add("Two film");
        manager.add("Three film");
        manager.add("four film");
        manager.add("five film");
        manager.add("six film");
        manager.add("seven film");

        String[] expected = {"seven film", "six film", "five film", "four film", "Three film", "Two film"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testing() {
        MovieManager manager = new MovieManager(3);
        manager.add("One film");
        manager.add("Two film");
        manager.add("Three film");
        manager.add("four film");
        manager.add("five film");
        manager.add("six film");
        manager.add("seven film");

        String[] expected = {"seven film", "six film", "five film"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
