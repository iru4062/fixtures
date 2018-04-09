package com.manage.fixtures.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.manage.fixtures.Domain.fixtures;
import com.manage.fixtures.Domain.memberInfo;

public interface memberInfoRepository extends JpaRepository<memberInfo, Integer>{

}
