package com.magic.MTGAPISpring.Repositories;

import com.magic.MTGAPISpring.Entities.testEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface testRepository extends JpaRepository<testEntity, Long>{

    Optional<testEntity> findById(long id);
    List<testEntity> findAll();

    Boolean existsByName(String name);
    Boolean existsByNameAndId(String name, Long id);

    void delete(Long id);


//    void save(testEntity newTestEntity);

}
