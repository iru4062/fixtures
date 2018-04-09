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
@Table(name="HALL_MANAGEMENT")//비품관리
public @Data class hallManagement {

	@Id	
	private String HALL_CODE;//당회코드
	private String HALL_NAME;//당회명
	private String HALL_LOCATION_CITY;//당회위치(시도)
	private String HALL_TOWN;//당회위치(군구)
	private String HALL_VILLAGE;//당회위치(읍면동)
	private String HALL_ADDRESS_DTL;//당회위치(자세히)
	private String HALL_ROAD_LOCATION_CITY;//당회위치(도로명 시도)
	private String HALL_ROAD_TOWN;//당회위치(도로명 군구)
	private String HALL_ROAD_VILLAGE;//당회위치(도로명 읍면동)
	private String HALL_ROAD_ADDRESS_DTL;//당회위치(도로명 자세히)
	private String HALL_ZIP_CODE;//당회 우편번호
	private String HALL_TELNO1;//당회 전화번호1
	private String HALL_TELNO2;//당회 전화번호2
	private String HALL_TELNO3;//당회 전화번호3
	private String HALL_REG_ID;//등록자
	private Date HALL_REG_DATE;//등록일
	private String HALL_MODI_ID;//수정자
	private Date HALL_MODI_DATE;//수정일
	
	public String getHALL_CODE() {
		return HALL_CODE;
	}
	public void setHALL_CODE(String hALL_CODE) {
		HALL_CODE = hALL_CODE;
	}
	public String getHALL_NAME() {
		return HALL_NAME;
	}
	public void setHALL_NAME(String hALL_NAME) {
		HALL_NAME = hALL_NAME;
	}
	public String getHALL_LOCATION_CITY() {
		return HALL_LOCATION_CITY;
	}
	public void setHALL_LOCATION_CITY(String hALL_LOCATION_CITY) {
		HALL_LOCATION_CITY = hALL_LOCATION_CITY;
	}
	public String getHALL_TOWN() {
		return HALL_TOWN;
	}
	public void setHALL_TOWN(String hALL_TOWN) {
		HALL_TOWN = hALL_TOWN;
	}
	public String getHALL_VILLAGE() {
		return HALL_VILLAGE;
	}
	public void setHALL_VILLAGE(String hALL_VILLAGE) {
		HALL_VILLAGE = hALL_VILLAGE;
	}
	public String getHALL_ADDRESS_DTL() {
		return HALL_ADDRESS_DTL;
	}
	public void setHALL_ADDRESS_DTL(String hALL_ADDRESS_DTL) {
		HALL_ADDRESS_DTL = hALL_ADDRESS_DTL;
	}
	public String getHALL_ROAD_LOCATION_CITY() {
		return HALL_ROAD_LOCATION_CITY;
	}
	public void setHALL_ROAD_LOCATION_CITY(String hALL_ROAD_LOCATION_CITY) {
		HALL_ROAD_LOCATION_CITY = hALL_ROAD_LOCATION_CITY;
	}
	public String getHALL_ROAD_TOWN() {
		return HALL_ROAD_TOWN;
	}
	public void setHALL_ROAD_TOWN(String hALL_ROAD_TOWN) {
		HALL_ROAD_TOWN = hALL_ROAD_TOWN;
	}
	public String getHALL_ROAD_VILLAGE() {
		return HALL_ROAD_VILLAGE;
	}
	public void setHALL_ROAD_VILLAGE(String hALL_ROAD_VILLAGE) {
		HALL_ROAD_VILLAGE = hALL_ROAD_VILLAGE;
	}
	public String getHALL_ROAD_ADDRESS_DTL() {
		return HALL_ROAD_ADDRESS_DTL;
	}
	public void setHALL_ROAD_ADDRESS_DTL(String hALL_ROAD_ADDRESS_DTL) {
		HALL_ROAD_ADDRESS_DTL = hALL_ROAD_ADDRESS_DTL;
	}
	public String getHALL_ZIP_CODE() {
		return HALL_ZIP_CODE;
	}
	public void setHALL_ZIP_CODE(String hALL_ZIP_CODE) {
		HALL_ZIP_CODE = hALL_ZIP_CODE;
	}
	public String getHALL_TELNO1() {
		return HALL_TELNO1;
	}
	public void setHALL_TELNO1(String hALL_TELNO1) {
		HALL_TELNO1 = hALL_TELNO1;
	}
	public String getHALL_TELNO2() {
		return HALL_TELNO2;
	}
	public void setHALL_TELNO2(String hALL_TELNO2) {
		HALL_TELNO2 = hALL_TELNO2;
	}
	public String getHALL_TELNO3() {
		return HALL_TELNO3;
	}
	public void setHALL_TELNO3(String hALL_TELNO3) {
		HALL_TELNO3 = hALL_TELNO3;
	}
	public String getHALL_REG_ID() {
		return HALL_REG_ID;
	}
	public void setHALL_REG_ID(String hALL_REG_ID) {
		HALL_REG_ID = hALL_REG_ID;
	}
	public Date getHALL_REG_DATE() {
		return HALL_REG_DATE;
	}
	public void setHALL_REG_DATE(Date hALL_REG_DATE) {
		HALL_REG_DATE = hALL_REG_DATE;
	}
	public String getHALL_MODI_ID() {
		return HALL_MODI_ID;
	}
	public void setHALL_MODI_ID(String hALL_MODI_ID) {
		HALL_MODI_ID = hALL_MODI_ID;
	}
	public Date getHALL_MODI_DATE() {
		return HALL_MODI_DATE;
	}
	public void setHALL_MODI_DATE(Date hALL_MODI_DATE) {
		HALL_MODI_DATE = hALL_MODI_DATE;
	}


}
