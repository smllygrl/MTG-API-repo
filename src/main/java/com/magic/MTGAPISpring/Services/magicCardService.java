package com.magic.MTGAPISpring.Services;

import com.magic.MTGAPISpring.Entities.magicCard;
import com.magic.MTGAPISpring.Payloads.Requests.mtgCardCreatePayload;
import com.magic.MTGAPISpring.Repositories.magicCardRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class magicCardService {

    private magicCardRepository repository;

    public List<magicCard> all() {return this.repository.findAll();}

    public magicCard findById(Long id) {
        Optional<magicCard> magicCard = this.repository.findById(id);
        if(magicCard.isEmpty()){
            throw new Error(String.format("magicCard with id:%d does not exist", id));
        }
        return magicCard.get();
    }

    public void create(mtgCardCreatePayload magicCard) {
        magicCard newMagicCard = new magicCard(
                magicCard.getName(),
                magicCard.getManaCost(),
                magicCard.getTypeLine(),
                magicCard.getExpansionSymbol(),
                magicCard.getTextBox(),
                magicCard.getArtistInfo(),
                magicCard.getCollectorNum(),
                magicCard.getPowerTough());

        repository.save(newMagicCard);
    }
}
