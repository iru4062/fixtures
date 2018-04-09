package com.manage.fixtures.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="COMMON_GROUP_CODE")//공통그룹코드
public @Data class commonGroupCode {

	@Id private String CODE_GROUP_ID;//코드그룹ID
	private String CODE_GROUP_NAME;//코드그룹명
	private String CODE_GROUP_ETC;//코드그룹상세
	private String CODE_GROUP_REG_ID;//코드그룹 등록ID
	private Date CODE_GROUP_REG_DATE;//코드그룹 등록일
	private String CODE_GROUP_MODI_ID;//코드그룹 수정ID
	private Date CODE_GROUP_MODI_DATE;//코드그룹 수정일

}
