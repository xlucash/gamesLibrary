package me.xlucash.gamesLibrary.web.service;

import me.xlucash.gamesLibrary.web.repository.GameRepository;
import me.xlucash.gamesLibrary.web.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Deprecated
    public Game getById(Long id) {
        return gameRepository.getById(id);
    }

    public List<Game> saveAll(Iterable<Game> games) {
        return gameRepository.saveAll(games);
    }

    public Game save(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game editedGame) {
        Game game = gameRepository.getById(id);
        game.setTitle(editedGame.getTitle());
        game.setProducer(editedGame.getProducer());
        game.setPremiere(editedGame.getPremiere());
        game.setPrice(editedGame.getPrice());
        game.setGenre(editedGame.getGenre());
        return gameRepository.save(game);
    }

    public Game findById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public List<Game> findAll() {
        return gameRepository.findAll();
    }

    public String deleteById(Long aLong) {
        gameRepository.deleteById(aLong);
        return String.format("Game with id: %d was deleted succesfully", aLong);
    }
}
