package az.raheddin.simplspringh2jpa.controller;



import az.raheddin.simplspringh2jpa.entity.Test;
import az.raheddin.simplspringh2jpa.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestControler {

    private final TestRepository testRepository;

    @GetMapping("/all")
    public List<Test> getAll(){
        return testRepository.findAll();
    }

    @GetMapping("/add")
    public Test addAll(){
        Test test=new Test();
        test.setName("Raheddin");
        return testRepository.save(test);
    }



}
