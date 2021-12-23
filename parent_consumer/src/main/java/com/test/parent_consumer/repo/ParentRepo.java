package com.test.parent_consumer.repo;

import com.test.parent_consumer.model.Parent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepo extends JpaRepository<Parent, Integer> {
}
