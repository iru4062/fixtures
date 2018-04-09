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
public class commonCodePk  implements Serializable {

	@Column(name="CODE_GROUP_ID" , length = 4) 
    private String CODE_GROUP_ID;
	@Column(name="CODE_ID" , length = 4)
    private String CODE_ID;

}
