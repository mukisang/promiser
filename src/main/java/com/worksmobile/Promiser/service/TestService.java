package com.worksmobile.Promiser.service;

import com.worksmobile.Promiser.dao.TestDAO;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestDAO testDAO;

    public TestService(TestDAO testDAO) {
        this.testDAO = testDAO;
    }


}
