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

@ToString
@Entity
@Table(name="FIXTURES_MANAGEMENT")//비품관리
public @Data class fixtures {

	@Id	private String ITEM_MANAGEMENT_NUMBER;//관리번호
	private String ITEM_NUMBER;//품번
	private String ITEM_CATEGORY;//카테고리
	private String ITEM_NAME;//품목
	private String ITEM_MODEL_NAME;//모델명
	private String ITEM_STANDARD;//규격
	private String ITEM_PARTS;//부속품
	private String ITEM_LOCATION;//창고위치
	private String ITEM_MAKER;//제조사
	private Date ITEM_MANUFACTURING_DATE;//제조일
	private Date ITEM_RECEIVING_DATE;//입고일
	private String ITEM_HALL_NAME;//전당회
	private String ITEM_MANAGER;//담당자
	private String ITEM_CHECK_CODE;//점검코드
	private String ITEM_CHECK_YN;//점검여부
	private String ITEM_CHECK_ETC;//점검사유
	private String ITEM_STATE_CODE;//상태코드
	@Column(length=2000) private String ITEM_STATE_ETC;//상세메모
	private String ITEM_ASSIGN_HALL;//당회배정
	private String ITEM_MANAGEMENT_CODE;//관리상태코드(수정,폐기,출고,입고)
	private String ITEM_REG_ID;//등록자
	private Date ITEM_REG_DATE;//등록일
	private String ITEM_MODI_ID;//수정자
	private Date ITEM_MODI_DATE;//수정일
		
	public String getITEM_MANAGEMENT_NUMBER() {
		return ITEM_MANAGEMENT_NUMBER;
	}
	public void setITEM_MANAGEMENT_NUMBER(String iTEM_MANAGEMENT_NUMBER) {
		ITEM_MANAGEMENT_NUMBER = iTEM_MANAGEMENT_NUMBER;
	}
	public String getITEM_NUMBER() {
		return ITEM_NUMBER;
	}
	public void setITEM_NUMBER(String iTEM_NUMBER) {
		ITEM_NUMBER = iTEM_NUMBER;
	}
	public String getITEM_CATEGORY() {
		return ITEM_CATEGORY;
	}
	public void setITEM_CATEGORY(String iTEM_CATEGORY) {
		ITEM_CATEGORY = iTEM_CATEGORY;
	}
	public String getITEM_NAME() {
		return ITEM_NAME;
	}
	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}
	public String getITEM_MODEL_NAME() {
		return ITEM_MODEL_NAME;
	}
	public void setITEM_MODEL_NAME(String iTEM_MODEL_NAME) {
		ITEM_MODEL_NAME = iTEM_MODEL_NAME;
	}
	public String getITEM_STANDARD() {
		return ITEM_STANDARD;
	}
	public void setITEM_STANDARD(String iTEM_STANDARD) {
		ITEM_STANDARD = iTEM_STANDARD;
	}
	public String getITEM_PARTS() {
		return ITEM_PARTS;
	}
	public void setITEM_PARTS(String iTEM_PARTS) {
		ITEM_PARTS = iTEM_PARTS;
	}
	public String getITEM_LOCATION() {
		return ITEM_LOCATION;
	}
	public void setITEM_LOCATION(String iTEM_LOCATION) {
		ITEM_LOCATION = iTEM_LOCATION;
	}
	public String getITEM_MAKER() {
		return ITEM_MAKER;
	}
	public void setITEM_MAKER(String iTEM_MAKER) {
		ITEM_MAKER = iTEM_MAKER;
	}
	public Date getITEM_MANUFACTURING_DATE() {
		return ITEM_MANUFACTURING_DATE;
	}
	public void setITEM_MANUFACTURING_DATE(Date iTEM_MANUFACTURING_DATE) {
		ITEM_MANUFACTURING_DATE = iTEM_MANUFACTURING_DATE;
	}
	public Date getITEM_RECEIVING_DATE() {
		return ITEM_RECEIVING_DATE;
	}
	public void setITEM_RECEIVING_DATE(Date iTEM_RECEIVING_DATE) {
		ITEM_RECEIVING_DATE = iTEM_RECEIVING_DATE;
	}
	public String getITEM_HALL_NAME() {
		return ITEM_HALL_NAME;
	}
	public void setITEM_HALL_NAME(String iTEM_HALL_NAME) {
		ITEM_HALL_NAME = iTEM_HALL_NAME;
	}
	public String getITEM_MANAGER() {
		return ITEM_MANAGER;
	}
	public void setITEM_MANAGER(String iTEM_MANAGER) {
		ITEM_MANAGER = iTEM_MANAGER;
	}
	public String getITEM_CHECK_CODE() {
		return ITEM_CHECK_CODE;
	}
	public void setITEM_CHECK_CODE(String iTEM_CHECK_CODE) {
		ITEM_CHECK_CODE = iTEM_CHECK_CODE;
	}
	public String getITEM_CHECK_YN() {
		return ITEM_CHECK_YN;
	}
	public void setITEM_CHECK_YN(String iTEM_CHECK_YN) {
		ITEM_CHECK_YN = iTEM_CHECK_YN;
	}
	public String getITEM_CHECK_ETC() {
		return ITEM_CHECK_ETC;
	}
	public void setITEM_CHECK_ETC(String iTEM_CHECK_ETC) {
		ITEM_CHECK_ETC = iTEM_CHECK_ETC;
	}
	public String getITEM_STATE_CODE() {
		return ITEM_STATE_CODE;
	}
	public void setITEM_STATE_CODE(String iTEM_STATE_CODE) {
		ITEM_STATE_CODE = iTEM_STATE_CODE;
	}
	public String getITEM_STATE_ETC() {
		return ITEM_STATE_ETC;
	}
	public void setITEM_STATE_ETC(String iTEM_STATE_ETC) {
		ITEM_STATE_ETC = iTEM_STATE_ETC;
	}
	public String getITEM_ASSIGN_HALL() {
		return ITEM_ASSIGN_HALL;
	}
	public void setITEM_ASSIGN_HALL(String iTEM_ASSIGN_HALL) {
		ITEM_ASSIGN_HALL = iTEM_ASSIGN_HALL;
	}
	public String getITEM_MANAGEMENT_CODE() {
		return ITEM_MANAGEMENT_CODE;
	}
	public void setITEM_MANAGEMENT_CODE(String iTEM_MANAGEMENT_CODE) {
		ITEM_MANAGEMENT_CODE = iTEM_MANAGEMENT_CODE;
	}
	public String getITEM_REG_ID() {
		return ITEM_REG_ID;
	}
	public void setITEM_REG_ID(String iTEM_REG_ID) {
		ITEM_REG_ID = iTEM_REG_ID;
	}
	public Date getITEM_REG_DATE() {
		return ITEM_REG_DATE;
	}
	public void setITEM_REG_DATE(Date iTEM_REG_DATE) {
		ITEM_REG_DATE = iTEM_REG_DATE;
	}
	public String getITEM_MODI_ID() {
		return ITEM_MODI_ID;
	}
	public void setITEM_MODI_ID(String iTEM_MODI_ID) {
		ITEM_MODI_ID = iTEM_MODI_ID;
	}
	public Date getITEM_MODI_DATE() {
		return ITEM_MODI_DATE;
	}
	public void setITEM_MODI_DATE(Date iTEM_MODI_DATE) {
		ITEM_MODI_DATE = iTEM_MODI_DATE;
	}
	

}
