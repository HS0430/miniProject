package hio.domain;

public class HioMember {

	private int memberNo; /* 회원번호 */
	private String memberName; /* 회원명 */
	private String memberAddres; /* 회원주소 */
	private String memberPhone; /* 회원전화번호 */
	private String memberId; /* 회원ID */
	private String memberPwd; /* 회원PWD */
	private int memberGrade; /* 회원등급(관리자0,회원1) */
	private int reservNo; /* 예약번호 */
	private String reservDate; /* 예약일자 */
	private String reservTime; /* 예약시간 */
	private int hallNo; /* 홀번호 */	
	private String hallResvYN; /* 예약가능여부 */
	private int hallTime; /* 예약가능시간 */
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberAddres() {
		return memberAddres;
	}
	public void setMemberAddres(String memberAddres) {
		this.memberAddres = memberAddres;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public int getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}
	public int getReservNo() {
		return reservNo;
	}
	public void setReservNo(int reservNo) {
		this.reservNo = reservNo;
	}
	public String getReservDate() {
		return reservDate;
	}
	public void setReservDate(String reservDate) {
		this.reservDate = reservDate;
	}
	public String getReservTime() {
		return reservTime;
	}
	public void setReservTime(String reservTime) {
		this.reservTime = reservTime;
	}
	public int getHallNo() {
		return hallNo;
	}
	public void setHallNo(int hallNo) {
		this.hallNo = hallNo;
	}
	public String getHallResvYN() {
		return hallResvYN;
	}
	public void setHallResvYN(String hallResvYN) {
		this.hallResvYN = hallResvYN;
	}
	public int getHallTime() {
		return hallTime;
	}
	public void setHallTime(int hallTime) {
		this.hallTime = hallTime;
	}

	
}
