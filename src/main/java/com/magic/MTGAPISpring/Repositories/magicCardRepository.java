package com.magic.MTGAPISpring.Repositories;

import com.magic.MTGAPISpring.Entities.magicCard;

import java.util.List;
import java.util.Optional;

public interface magicCardRepository {
    List<magicCard> findAll();

    Optional<magicCard> findById(Long id);

    void save(magicCard newMagicCard);
}
