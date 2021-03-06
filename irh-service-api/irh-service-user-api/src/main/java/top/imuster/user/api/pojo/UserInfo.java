package top.imuster.user.api.pojo;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.imuster.common.base.domain.BaseDomain;
import top.imuster.common.core.validate.ValidateGroup;

import javax.management.relation.RoleInfo;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * @author 黄明人
 * @since 2019-11-24 16:31:57
 */
@ApiModel("会员实体类")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserInfo extends BaseDomain {

	private static final long serialVersionUID = 23378053182L;

	// 自动生成的id
	@ApiModelProperty("会员表的主键")
	private Long id;

	// 年龄
	@ApiModelProperty("年龄")
	private Short age;

	// 登录用的邮箱, max length: 50
	@ApiModelProperty("登录用的邮箱")
	@Email(groups = {ValidateGroup.loginGroup.class, ValidateGroup.register.class, ValidateGroup.editGroup.class}, message = "邮箱参数错误")
	@NotEmpty(groups = {ValidateGroup.loginGroup.class, ValidateGroup.register.class}, message = "邮箱不能为空")
	private String email;

	// 密码
	@ApiModelProperty("密码")
	@NotBlank(groups = {ValidateGroup.loginGroup.class, ValidateGroup.register.class}, message = "密码不能为空")
	private String password;

	//个性签名
	private String signature;

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

	//10:普通会员 20:服务人员 30:校园组织 35:公益组织 40:校园社团 50:管理员
	@ApiModelProperty("10:普通会员 20:服务人员 30:校园组织 35:公益组织 40:校园社团 50:管理员")
	@NotEmpty(groups = ValidateGroup.addGroup.class, message = "用户类型不能为空")
	private Integer type;

	@ApiModelProperty("用户头像地址")
	private String portrait;

	private String address;

	//登陆时请求的验证码
	private String code;

	// 10:注销 20:锁定 25:未实名 30:审核中 40:审核通过 50:认证失败
	//state


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	private List<RoleInfo> roleList;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getPortrait() {
		return portrait;
	}

	public void setPortrait(String portrait) {
		this.portrait = portrait;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

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