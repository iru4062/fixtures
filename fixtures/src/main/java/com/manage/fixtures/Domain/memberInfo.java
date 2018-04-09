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
@Table(name="MEMBER_INFO")//회원관리
public @Data class memberInfo {

	@Id	
	private String MEMBER_ID;//아이디
	private String MEMBER_NAME;//이름
	private String MEMBER_TELNO1;//전화번호1
	private String MEMBER_TELNO2;//전화번호2
	private String MEMBER_TELNO3;//전화번호3
	private String MEMBER_AUTHORITY;//권한
	private String MEMBER_HALL;//소속당회
	private String MEMBER_REG_ID;//등록자
	private Date MEMBER_REG_DATE;//등록일
	private String MEMBER_MODI_ID;//수정자
	private Date MEMBER_MODI_DATE;//수정일
	
	public String getMEMBER_ID() {
		return MEMBER_ID;
	}
	public void setMEMBER_ID(String mEMBER_ID) {
		MEMBER_ID = mEMBER_ID;
	}
	public String getMEMBER_NAME() {
		return MEMBER_NAME;
	}
	public void setMEMBER_NAME(String mEMBER_NAME) {
		MEMBER_NAME = mEMBER_NAME;
	}
	public String getMEMBER_TELNO1() {
		return MEMBER_TELNO1;
	}
	public void setMEMBER_TELNO1(String mEMBER_TELNO1) {
		MEMBER_TELNO1 = mEMBER_TELNO1;
	}
	public String getMEMBER_TELNO2() {
		return MEMBER_TELNO2;
	}
	public void setMEMBER_TELNO2(String mEMBER_TELNO2) {
		MEMBER_TELNO2 = mEMBER_TELNO2;
	}
	public String getMEMBER_TELNO3() {
		return MEMBER_TELNO3;
	}
	public void setMEMBER_TELNO3(String mEMBER_TELNO3) {
		MEMBER_TELNO3 = mEMBER_TELNO3;
	}
	public String getMEMBER_AUTHORITY() {
		return MEMBER_AUTHORITY;
	}
	public void setMEMBER_AUTHORITY(String mEMBER_AUTHORITY) {
		MEMBER_AUTHORITY = mEMBER_AUTHORITY;
	}
	public String getMEMBER_HALL() {
		return MEMBER_HALL;
	}
	public void setMEMBER_HALL(String mEMBER_HALL) {
		MEMBER_HALL = mEMBER_HALL;
	}
	public String getMEMBER_REG_ID() {
		return MEMBER_REG_ID;
	}
	public void setMEMBER_REG_ID(String mEMBER_REG_ID) {
		MEMBER_REG_ID = mEMBER_REG_ID;
	}
	public Date getMEMBER_REG_DATE() {
		return MEMBER_REG_DATE;
	}
	public void setMEMBER_REG_DATE(Date mEMBER_REG_DATE) {
		MEMBER_REG_DATE = mEMBER_REG_DATE;
	}
	public String getMEMBER_MODI_ID() {
		return MEMBER_MODI_ID;
	}
	public void setMEMBER_MODI_ID(String mEMBER_MODI_ID) {
		MEMBER_MODI_ID = mEMBER_MODI_ID;
	}
	public Date getMEMBER_MODI_DATE() {
		return MEMBER_MODI_DATE;
	}
	public void setMEMBER_MODI_DATE(Date mEMBER_MODI_DATE) {
		MEMBER_MODI_DATE = mEMBER_MODI_DATE;
	}


}
