package com.manage.fixtures.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;

import java.io.Serializable;
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
@Table(name="COMMON_CODE")//공통코드
@IdClass(commonCodePk.class)
public @Data class commonCode{

	@Id
    @Column(name = "CODE_GROUP_ID", length = 4)
	private String CODE_GROUP_ID;//코드그룹ID
	@Id
	@Column(name = "CODE_ID", length = 4)
	private String CODE_ID;//코드ID
	
	private String CODE_NAME;//코드명
	private String CODE_ETC;//코드상세
	private String CODE_REG_ID;//코드 등록ID
	private Date CODE_REG_DATE;//코드 등록일
	private String CODE_MODI_ID;//코드 수정ID
	private Date CODE_MODI_DATE;//코드 수정일
	
	public String getCODE_GROUP_ID() {
		return CODE_GROUP_ID;
	}
	public void setCODE_GROUP_ID(String cODE_GROUP_ID) {
		CODE_GROUP_ID = cODE_GROUP_ID;
	}
	public String getCODE_ID() {
		return CODE_ID;
	}
	public void setCODE_ID(String cODE_ID) {
		CODE_ID = cODE_ID;
	}
	public String getCODE_NAME() {
		return CODE_NAME;
	}
	public void setCODE_NAME(String cODE_NAME) {
		CODE_NAME = cODE_NAME;
	}
	public String getCODE_ETC() {
		return CODE_ETC;
	}
	public void setCODE_ETC(String cODE_ETC) {
		CODE_ETC = cODE_ETC;
	}
	public String getCODE_REG_ID() {
		return CODE_REG_ID;
	}
	public void setCODE_REG_ID(String cODE_REG_ID) {
		CODE_REG_ID = cODE_REG_ID;
	}
	public Date getCODE_REG_DATE() {
		return CODE_REG_DATE;
	}
	public void setCODE_REG_DATE(Date cODE_REG_DATE) {
		CODE_REG_DATE = cODE_REG_DATE;
	}
	public String getCODE_MODI_ID() {
		return CODE_MODI_ID;
	}
	public void setCODE_MODI_ID(String cODE_MODI_ID) {
		CODE_MODI_ID = cODE_MODI_ID;
	}
	public Date getCODE_MODI_DATE() {
		return CODE_MODI_DATE;
	}
	public void setCODE_MODI_DATE(Date cODE_MODI_DATE) {
		CODE_MODI_DATE = cODE_MODI_DATE;
	}


}
