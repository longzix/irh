package top.imuster.life.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import top.imuster.common.base.domain.BaseDomain;

/**
 * 
 * @author 黄明人
 * @since 2020-01-30 15:25:20
 */
@ApiModel("帖子分类实体")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ArticleCategoryInfo extends BaseDomain {

	private static final long serialVersionUID = 5839629083L;

	public ArticleCategoryInfo() {
		//默认无参构造方法
	}

	// 文章分类表主键
	@ApiModelProperty("文章分类表主键")
	private Long id;

	// 分类名称, max length: 255
	@ApiModelProperty("分类名称")
	private String name;

	// 1-无效  2-有效
//	private Short state;
	public Long getId() {
		return this.id;
	}
    public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
    public void setName(String name) {
		this.name = name;
	}
}