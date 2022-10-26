DROP INDEX MY_SCHEMA.PK_reservation;

/* reservation */
DROP TABLE MY_SCHEMA.reservation 
	CASCADE CONSTRAINTS;

/* reservation */
CREATE TABLE MY_SCHEMA.reservation (
	reservNo INTEGER NOT NULL, /* 예약번호 */
	memberNo INTEGER, /* 회원번호 */
	hallNo INTEGER, /* 홀번호 */
	reservDate DATE, /* 예약일자 */
	reservTime INTEGER /* 예약시간 */
);

COMMENT ON TABLE MY_SCHEMA.reservation IS 'reservation';

COMMENT ON COLUMN MY_SCHEMA.reservation.reservNo IS '예약번호';

COMMENT ON COLUMN MY_SCHEMA.reservation.memberNo IS '회원번호';

COMMENT ON COLUMN MY_SCHEMA.reservation.hallNo IS '홀번호';

COMMENT ON COLUMN MY_SCHEMA.reservation.reservDate IS '예약일자';

COMMENT ON COLUMN MY_SCHEMA.reservation.reservTime IS '예약시간';

CREATE UNIQUE INDEX MY_SCHEMA.PK_reservation
	ON MY_SCHEMA.reservation (
		reservNo ASC
	);

ALTER TABLE MY_SCHEMA.reservation
	ADD
		CONSTRAINT PK_reservation
		PRIMARY KEY (
			reservNo
		);

ALTER TABLE MY_SCHEMA.reservation
	ADD
		CONSTRAINT FK_member_TO_reservation
		FOREIGN KEY (
			memberNo
		)
		REFERENCES MY_SCHEMA.member (
			memberNo
		);

ALTER TABLE MY_SCHEMA.reservation
	ADD
		CONSTRAINT FK_hall_TO_reservation
		FOREIGN KEY (
			hallNo
		)
		REFERENCES MY_SCHEMA.hall (
			hallNo
		);