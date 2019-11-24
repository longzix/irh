package top.imuster.mall.dao.impl;

import org.springframework.stereotype.Repository;
import top.imuster.domain.base.BaseDaoImpl;
import top.imuster.mall.dao.ProductCategoryRelDao;
import top.imuster.mall.domain.ProductCategoryRel;

/**
 * ProductCategoryRelDao 实现类
 * @author 黄明人
 * @since 2019-11-24 16:31:57
 */
@Repository("productCategoryRelDao")
public class ProductCategoryRelDaoImpl extends BaseDaoImpl<ProductCategoryRel, Long> implements ProductCategoryRelDao {
	private final static String NAMESPACE = "top.imuster.mall.dao.ProductCategoryRelDao.";
	
	//返回本DAO命名空间,并添加statement
	public String getNameSpace(String statement) {
		return NAMESPACE + statement;
	}
}