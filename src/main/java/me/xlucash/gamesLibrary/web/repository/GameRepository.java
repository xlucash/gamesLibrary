package me.xlucash.gamesLibrary.web.repository;

import me.xlucash.gamesLibrary.web.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
}
