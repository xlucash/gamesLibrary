package me.xlucash.gamesLibrary.web.controller;

import me.xlucash.gamesLibrary.web.model.Game;
import me.xlucash.gamesLibrary.web.service.GameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/games")
    public List<Game> getAllGames() {
        return gameService.findAll();
    }

    @GetMapping("/games/{id}")
    public Game getGameById(@PathVariable Long id) {
        return gameService.findById(id);
    }

    @PostMapping("/games/saveGames")
    public List<Game> saveGames(@RequestBody List<Game> games) {
        return gameService.saveAll(games);
    }

    @PostMapping("/games/saveGame")
    public Game saveGame(@RequestBody Game game) {
        return gameService.save(game);
    }

    @PutMapping("/games/{id}")
    public Game editGame(@PathVariable("id") Long id, @RequestBody Game editedGame) {
        return gameService.updateGame(id, editedGame);
    }

    @DeleteMapping("/games/{id}")
    public String deleteGame(@PathVariable("id") Long id) {
        return gameService.deleteById(id);
    }
}
