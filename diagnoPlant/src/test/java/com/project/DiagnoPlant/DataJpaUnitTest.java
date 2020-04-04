package com.project.DiagnoPlant;


import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
public class DataJpaUnitTest {

    TestEntityManager entityManager;

    public void givenCorrectSetup(){
        assertNotNull(entityManager);
    }
}