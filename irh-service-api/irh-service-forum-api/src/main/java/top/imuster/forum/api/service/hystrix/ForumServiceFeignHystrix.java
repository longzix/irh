package top.imuster.forum.api.service.hystrix;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.imuster.forum.api.pojo.ArticleCategory;
import top.imuster.forum.api.service.ForumServiceFeignApi;

/**
 * @ClassName: ForumServiceFeignHystrix
 * @Description: ForumServiceFeignHystrix
 * @author: hmr
 * @date: 2020/2/1 12:10
 */
@Component
@Slf4j
public class ForumServiceFeignHystrix implements ForumServiceFeignApi {

    @Override
    public boolean adminDeleteArticle(Long id) {
        log.error("管理员根据id删除帖子失败,帖子id为{}", id);
        return false;
    }

    @Override
    public boolean adminDeleteArticleCategory(Long id) {
        log.error("管理员根据id删除帖子分类失败,帖子分类id为{}", id);
        return false;
    }

    @Override
    public ArticleCategory getCategoryInfoById(Long id) {
        log.error("管理员根据id获得帖子分类信息失败,帖子分类id为{}", id);
        return null;
    }

    @Override
    public boolean addArticleCategory(ArticleCategory category) {
        log.error("管理员新增帖子分类失败,新增帖子信息为{}", category);
        return false;
    }

    @Override
    public boolean editArticleCategory(ArticleCategory category) {
        log.error("管理员根据id提交修改帖子分类信息失败,帖子分类信息为{}", category);
        return false;
    }

    @Override
    public boolean adminDeleteArticleReview(Long id) {
        log.error("管理员根据留言id删除帖子留言失败,留言id为{}", id);
        return false;
    }
}