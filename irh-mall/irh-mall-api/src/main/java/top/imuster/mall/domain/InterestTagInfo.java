package top.imuster.mall.domain;

import java.util.Date;

import top.imuster.domain.base.BaseDomain;

/**
 * 
 * @author 黄明人
 * @since 2019-11-24 16:31:57
 */
public class InterestTagInfo extends BaseDomain {

	private static final long serialVersionUID = 5497047741L;

	public InterestTagInfo() {
		//默认无参构造方法
	}
	// 兴趣标签表主键
	private Long id;

	// 标签名称, max length: 255
	private String tagName;

	// 创建者的id,对应于管理员表中的主键id
	private Long managerId;

	// 创建时间
	private Date createTime;

	// 更新时间
	private Date updateTime;

	// 状态:1-无效 2-有效
	private Short state;

	public Long getId() {
		return this.id;
	}
    public void setId(Long id) {
		this.id = id;
	}
	
	public String getTagName() {
		return this.tagName;
	}
    public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	
	public Long getManagerId() {
		return this.managerId;
	}
    public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	
	public Date getCreateTime() {
		return this.createTime;
	}
    public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Date getUpdateTime() {
		return this.updateTime;
	}
    public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public Short getState() {
		return this.state;
	}
    public void setState(Short state) {
		this.state = state;
	}
	 
}