package com.manage.fixtures.Domain;

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
@Table(name="FIXTURES_MANAGEMENT_IMG")//비품이미지
@IdClass(fixturesImgPk.class)
public @Data class fixturesImg {

	@Id	
	@Column(length=8)
	private String ITEM_MANAGEMENT_NUMBER;//품번(관리번호)
	@Id	
	@Column(length=1)
	private String IMG_SEQ;//이미지번호
	private String IMG_SRC;//이미지경로
	private String IMG_REG_ID;//이미지 등록ID
	private Date IMG_REG_DATE;//이미지 등록자
	private String IMG_MODI_ID;//이미지 수정ID
	private Date IMG_MODI_DATE;//이미지 수정일

	public String getITEM_MANAGEMENT_NUMBER() {
		return ITEM_MANAGEMENT_NUMBER;
	}
	public void setITEM_MANAGEMENT_NUMBER(String iTEM_MANAGEMENT_NUMBER) {
		ITEM_MANAGEMENT_NUMBER = iTEM_MANAGEMENT_NUMBER;
	}
	public String getIMG_SEQ() {
		return IMG_SEQ;
	}
	public void setIMG_SEQ(String iMG_SEQ) {
		IMG_SEQ = iMG_SEQ;
	}
	public String getIMG_SRC() {
		return IMG_SRC;
	}
	public void setIMG_SRC(String iMG_SRC) {
		IMG_SRC = iMG_SRC;
	}
	public String getIMG_REG_ID() {
		return IMG_REG_ID;
	}
	public void setIMG_REG_ID(String iMG_REG_ID) {
		IMG_REG_ID = iMG_REG_ID;
	}
	public Date getIMG_REG_DATE() {
		return IMG_REG_DATE;
	}
	public void setIMG_REG_DATE(Date iMG_REG_DATE) {
		IMG_REG_DATE = iMG_REG_DATE;
	}
	public String getIMG_MODI_ID() {
		return IMG_MODI_ID;
	}
	public void setIMG_MODI_ID(String iMG_MODI_ID) {
		IMG_MODI_ID = iMG_MODI_ID;
	}
	public Date getIMG_MODI_DATE() {
		return IMG_MODI_DATE;
	}
	public void setIMG_MODI_DATE(Date iMG_MODI_DATE) {
		IMG_MODI_DATE = iMG_MODI_DATE;
	}

}
