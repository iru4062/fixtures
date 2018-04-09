package com.manage.fixtures.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manage.fixtures.Domain.fixtures;
import com.manage.fixtures.Domain.fixturesImg;

public interface fixturesImgRepository extends JpaRepository<fixturesImg, Integer>{
	

}
