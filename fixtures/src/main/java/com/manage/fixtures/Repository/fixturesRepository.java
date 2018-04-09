package com.manage.fixtures.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manage.fixtures.Domain.fixtures;
import com.manage.fixtures.Domain.hallManagement;

public interface fixturesRepository extends JpaRepository<fixtures, Integer>{

	
}
