package top.imuster.user.api.pojo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.imuster.common.base.domain.BaseDomain;

import java.util.List;

/**
 * @author 黄明人
 * @since 2019-11-24 16:31:57
 */
@ApiModel("会员实体类")
public class ConsumerInfo extends BaseDomain {

	private static final long serialVersionUID = 23378053182L;

	// 自动生成的id
	@ApiModelProperty("会员表的主键")
	private Long id;

	// 年龄
	@ApiModelProperty("年龄")
	private Short age;

	// 登录用的邮箱, max length: 50
	@ApiModelProperty("登录用的邮箱")
	private String email;

	// 密码
	@ApiModelProperty("密码")
	private String password;

	// 支付宝账号, max length: 13
	@ApiModelProperty("支付宝账号")
	private String alipayNum;

	// 用户昵称
	@ApiModelProperty("用户昵称")
	private String nickname;

	// qq账号, max length: 255
	@ApiModelProperty("qq账号")
	private String qq;

	// 1-女 2-男
	@ApiModelProperty("性别")
	private Short gender;

	// 手机号, max length: 11
	@ApiModelProperty("手机号")
	private String phoneNum;

	// 寝室楼号
	@ApiModelProperty("寝室楼号")
	private String buildingNum;

	// 楼层, max length: 255
	@ApiModelProperty("楼层")
	private String buildingStorey;

	// 寝室号
	@ApiModelProperty("寝室号")
	private String dormNum;

	// 真实姓名, max length: 255
	@ApiModelProperty("真实姓名")
	private String realName;

	// 证件号码
	@ApiModelProperty("证件号码")
	private String certificateNum;

	// 学校名称, max length: 255
	@ApiModelProperty("学校名称")
	private String schoolName;

	// 学院
	@ApiModelProperty("学院")
	private String academyName;

	// 专业, max length: 255
	@ApiModelProperty("专业")
	private String majorName;

	// 10:注销 20:锁定 30:审核中 40:审核通过

	private List<RoleInfo> roleList;

	public List<RoleInfo> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleInfo> roleList) {
		this.roleList = roleList;
	}

	public Long getId() {
		return this.id;
	}
    public void setId(Long id) {
		this.id = id;
	}
	
	public Short getAge() {
		return this.age;
	}
    public void setAge(Short age) {
		this.age = age;
	}
	
	public String getEmail() {
		return this.email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
    public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAlipayNum() {
		return this.alipayNum;
	}
    public void setAlipayNum(String alipayNum) {
		this.alipayNum = alipayNum;
	}
	
	public String getNickname() {
		return this.nickname;
	}
    public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public String getQq() {
		return this.qq;
	}
    public void setQq(String qq) {
		this.qq = qq;
	}
	
	public Short getGender() {
		return this.gender;
	}
    public void setGender(Short gender) {
		this.gender = gender;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
    public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getBuildingNum() {
		return this.buildingNum;
	}
    public void setBuildingNum(String buildingNum) {
		this.buildingNum = buildingNum;
	}
	
	public String getBuildingStorey() {
		return this.buildingStorey;
	}
    public void setBuildingStorey(String buildingStorey) {
		this.buildingStorey = buildingStorey;
	}
	
	public String getDormNum() {
		return this.dormNum;
	}
    public void setDormNum(String dormNum) {
		this.dormNum = dormNum;
	}
	
	public String getRealName() {
		return this.realName;
	}
    public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getCertificateNum() {
		return this.certificateNum;
	}
    public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}
	
	public String getSchoolName() {
		return this.schoolName;
	}
    public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getAcademyName() {
		return this.academyName;
	}
    public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}
	
	public String getMajorName() {
		return this.majorName;
	}
    public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
}