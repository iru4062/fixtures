INSERT INTO FIXTURES_MANAGEMENT(ITEM_MANAGEMENT_NUMBER,ITEM_CATEGORY,ITEM_NAME,ITEM_MODEL_NAME,ITEM_STANDARD,ITEM_PARTS,ITEM_LOCATION,ITEM_MAKER,ITEM_HALL_NAME,ITEM_MANAGER,ITEM_CHECK_CODE,ITEM_CHECK_YN,ITEM_CHECK_ETC,ITEM_STATE_CODE,ITEM_STATE_ETC,ITEM_ASSIGN_HALL,ITEM_MANAGEMENT_CODE,ITEM_REG_ID,ITEM_MODI_ID,ITEM_MANUFACTURING_DATE,ITEM_RECEIVING_DATE,ITEM_REG_DATE,ITEM_MODI_DATE ) VALUES ('0','0' ,'0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1',now(),now(),now(),now() );
INSERT INTO FIXTURES_MANAGEMENT(ITEM_MANAGEMENT_NUMBER,ITEM_CATEGORY,ITEM_NAME,ITEM_MODEL_NAME,ITEM_STANDARD,ITEM_PARTS,ITEM_LOCATION,ITEM_MAKER,ITEM_HALL_NAME,ITEM_MANAGER,ITEM_CHECK_CODE,ITEM_CHECK_YN,ITEM_CHECK_ETC,ITEM_STATE_CODE,ITEM_STATE_ETC,ITEM_ASSIGN_HALL,ITEM_MANAGEMENT_CODE,ITEM_REG_ID,ITEM_MODI_ID,ITEM_MANUFACTURING_DATE,ITEM_RECEIVING_DATE,ITEM_REG_DATE,ITEM_MODI_DATE ) VALUES ('1','0' ,'0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1',now(),now(),now(),now() );


INSERT INTO COMMON_GROUP_CODE (  CODE_GROUP_ID  ,CODE_GROUP_NAME ,CODE_GROUP_ETC ,CODE_GROUP_MODI_DATE ,CODE_GROUP_MODI_ID ,CODE_GROUP_REG_DATE ,CODE_GROUP_REG_ID)VALUES( 'CA01','카테고리','',now(),'SYSTEM',now(),'SYSTEM');

INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE ,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'CA01','01','가전', '',now(),'SYSTEM',now(),'SYSTEM'  ); 
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE ,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'CA01','02','냉난방기', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE ,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'CA01','03','성구', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE ,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'CA01','99','기타', '',now(),'SYSTEM',now(),'SYSTEM'  );

INSERT INTO COMMON_GROUP_CODE (  CODE_GROUP_ID  ,CODE_GROUP_NAME ,CODE_GROUP_ETC ,CODE_GROUP_MODI_DATE ,CODE_GROUP_MODI_ID ,CODE_GROUP_REG_DATE ,CODE_GROUP_REG_ID)VALUES( 'ST01','상테','비품상태',now(),'SYSTEM',now(),'SYSTEM');
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'ST01','A','A급', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'ST01','B','B급', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'ST01','C','C급', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'ST01','D','D급', '',now(),'SYSTEM',now(),'SYSTEM'  );

INSERT INTO COMMON_GROUP_CODE (  CODE_GROUP_ID  ,CODE_GROUP_NAME ,CODE_GROUP_ETC ,CODE_GROUP_MODI_DATE ,CODE_GROUP_MODI_ID ,CODE_GROUP_REG_DATE ,CODE_GROUP_REG_ID)VALUES( 'FI01','관리코드','수정/폐기/출고 등',now(),'SYSTEM',now(),'SYSTEM');
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','10','입고신청', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','11','입고승인', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','12','당회배정(예약)', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','19','입고취소', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','20','출고신청', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','21','출고승인', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','29','출고취소(입고와같음)', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','90','폐기신청', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','91','폐기승인', '',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'FI01','99','폐기취소(입고와같음)', '',now(),'SYSTEM',now(),'SYSTEM'  );


INSERT INTO COMMON_GROUP_CODE (  CODE_GROUP_ID  ,CODE_GROUP_NAME ,CODE_GROUP_ETC ,CODE_GROUP_MODI_DATE ,CODE_GROUP_MODI_ID ,CODE_GROUP_REG_DATE ,CODE_GROUP_REG_ID)VALUES( 'AU01','권한코드','권한관리',now(),'SYSTEM',now(),'SYSTEM');
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'AU01','01','일반사용자', '조회만',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'AU01','02','관리자', '등록 및 수정',now(),'SYSTEM',now(),'SYSTEM'  );
INSERT INTO COMMON_CODE(  CODE_GROUP_ID  ,CODE_ID  ,CODE_NAME  ,CODE_ETC  ,CODE_MODI_DATE,CODE_MODI_ID  ,CODE_REG_DATE,CODE_REG_ID)  VALUES  ( 'AU01','03','승인자', '등록 및 수정',now(),'SYSTEM',now(),'SYSTEM'  );