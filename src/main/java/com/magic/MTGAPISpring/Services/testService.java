package com.magic.MTGAPISpring.Services;

import com.magic.MTGAPISpring.Entities.testEntity;
import com.magic.MTGAPISpring.Payloads.Requests.testCreatePayload;
import com.magic.MTGAPISpring.Payloads.Requests.testUpdatePayload;
import com.magic.MTGAPISpring.Repositories.testRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class testService {

//    Errors if the below repository is annotated w/ Autowired
    @Autowired
    private testRepository repository;

    public List<testEntity> all() {return this.repository.findAll();}

    public testEntity findById(Long id) {
        Optional<testEntity> testEntity = this.repository.findById(id);
        if(testEntity.isEmpty()) {
            throw new Error(String.format("testEntity with id:%d does not exist", id));
        }
        return testEntity.get();
    }

    public void create(testCreatePayload test) {
        testEntity newTestEntity = new testEntity(test.getName(), test.getPower());
        repository.save(newTestEntity);
    }

    public void delete(Long id) {
        this.repository.delete(id);
    }

    public testEntity update(Long id, testUpdatePayload data) {
        Optional<testEntity> fetchedEntity = this.repository.findById(id);

        if (fetchedEntity.isEmpty()) {
            return null;
        }

        testEntity test = fetchedEntity.get();

        if (data.getName() != null && !"".equals(data.getName())) {
            test.setName(data.getName());
        }

        if (data.getPower() != null) {
            test.setPower(data.getPower());
        }

        return this.repository.save(test);


    }
}
