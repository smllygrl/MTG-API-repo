package com.magic.MTGAPISpring.Controllers;

import com.magic.MTGAPISpring.Entities.magicCard;
import com.magic.MTGAPISpring.Services.magicCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class magicCardController {

    @Autowired
    private magicCardService service;


}
