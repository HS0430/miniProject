DROP INDEX MY_SCHEMA.PK_member;

/* member */
DROP TABLE MY_SCHEMA.member 
	CASCADE CONSTRAINTS;

/* member */
CREATE TABLE MY_SCHEMA.member (
	memberNo INTEGER NOT NULL, /* 회원번호 */
	memberName VARCHAR2(50), /* 회원명 */
	memberAddress VARCHAR2(255), /* 회원주소 */
	memberPhone VARCHAR2(30), /* 회원전화번호 */
	memberId VARCHAR2(50), /* 회원ID */
	memberPwd VARCHAR2(50), /* 회원PWD */
	memberGrade INTEGER /* 회원등급(관리자0,회원1) */
);

COMMENT ON TABLE MY_SCHEMA.member IS 'member';

COMMENT ON COLUMN MY_SCHEMA.member.memberNo IS '회원번호';

COMMENT ON COLUMN MY_SCHEMA.member.memberName IS '회원명';

COMMENT ON COLUMN MY_SCHEMA.member.memberAddress IS '회원주소';

COMMENT ON COLUMN MY_SCHEMA.member.memberPhone IS '회원전화번호';

COMMENT ON COLUMN MY_SCHEMA.member.memberId IS '회원ID';

COMMENT ON COLUMN MY_SCHEMA.member.memberPwd IS '회원PWD';

COMMENT ON COLUMN MY_SCHEMA.member.memberGrade IS '회원등급(관리자0,회원1)';

CREATE UNIQUE INDEX MY_SCHEMA.PK_member
	ON MY_SCHEMA.member (
		memberNo ASC
	);

ALTER TABLE MY_SCHEMA.member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			memberNo
		);