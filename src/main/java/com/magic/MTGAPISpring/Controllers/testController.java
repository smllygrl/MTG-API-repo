package com.magic.MTGAPISpring.Controllers;

import com.magic.MTGAPISpring.Entities.testEntity;
import com.magic.MTGAPISpring.Payloads.Requests.testCreatePayload;
import com.magic.MTGAPISpring.Services.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/test_entity")
public class testController {

    @Autowired
    private testService service;

    //    http://127.0.0.1:8080/test_entity/test
    @GetMapping(value = "/test")
    public String test() {
        return "hello, world!";
    }

    @GetMapping(value = "/test/{name}")
    public String testName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/test/{name}/{age}")
    public String testNameAge(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello %s, you are %d years old", name, age);
    }

    @GetMapping(value = "/all")
    public List<testEntity> all() {
        return this.service.all();
    }

    @GetMapping(value = "/{id}")
    public testEntity findById (@PathVariable Long id) {
        return this.service.findById(id);
    }


    //Creating tests
    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED) // Return a 201 (CREATED)
    public void save(@Valid @RequestBody testCreatePayload test) {
        this.service.create(test);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        try {
            this.service.findById(id);
            this.service.delete(id);
        } catch (ResponseStatusException doesNotExist) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "TestEntity with the id: " + id + "does not exist");
        }
    }
}
