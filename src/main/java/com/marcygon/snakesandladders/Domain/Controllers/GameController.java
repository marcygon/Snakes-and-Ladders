package com.marcygon.snakesandladders.Domain.Controllers;

import com.marcygon.snakesandladders.Domain.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    public GameController(GameService gameService) {
    }
}
