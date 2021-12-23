package com.test.child_consumer.repo;

import com.test.child_consumer.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildRepo extends JpaRepository<Child, Integer> {
}
