package az.raheddin.simplspringh2jpa.repository;


import az.raheddin.simplspringh2jpa.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {

}
