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

@Data
public class fixturesImgPk  implements Serializable {
	private String ITEM_MANAGEMENT_NUMBER;//품번(관리번호)
	private String IMG_SEQ;//이미지경로
}
