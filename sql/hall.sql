DROP INDEX MY_SCHEMA.PK_hall;

/* hall */
DROP TABLE MY_SCHEMA.hall 
	CASCADE CONSTRAINTS;

/* hall */
CREATE TABLE MY_SCHEMA.hall (
	hallNo INTEGER NOT NULL, /* 홀번호 */
	hallResvYN VARCHAR2(50), /* 예약가능여부 */
	hallsTime INTEGER, /* 예약가능시간(Start) */
	halleTime INTEGER /* 예약가능시간(End) */
);

COMMENT ON TABLE MY_SCHEMA.hall IS 'hall';

COMMENT ON COLUMN MY_SCHEMA.hall.hallNo IS '홀번호';

COMMENT ON COLUMN MY_SCHEMA.hall.hallResvYN IS '예약가능여부';

COMMENT ON COLUMN MY_SCHEMA.hall.hallsTime IS '예약가능시간(Start)';

COMMENT ON COLUMN MY_SCHEMA.hall.halleTime IS '예약가능시간(End)';

CREATE UNIQUE INDEX MY_SCHEMA.PK_hall
	ON MY_SCHEMA.hall (
		hallNo ASC
	);

ALTER TABLE MY_SCHEMA.hall
	ADD
		CONSTRAINT PK_hall
		PRIMARY KEY (
			hallNo
		);