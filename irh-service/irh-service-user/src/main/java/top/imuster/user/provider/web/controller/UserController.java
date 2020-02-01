package top.imuster.user.provider.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import top.imuster.common.core.controller.BaseController;
import top.imuster.common.base.wrapper.Message;
import top.imuster.common.core.validate.ValidateGroup;
import top.imuster.user.api.dto.CheckValidDto;
import top.imuster.user.api.pojo.UserInfo;
import top.imuster.user.api.pojo.ReportFeedbackInfo;
import top.imuster.user.provider.service.UserInfoService;
import top.imuster.user.provider.service.ReportFeedbackInfoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: CustomerController
 * @Description: customer的控制器
 * @author: hmr
 * @date: 2019/12/18 19:11
 */
@Api(tags = "用户controller,这个控制器主要是对自己信息的一些操作")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    ReportFeedbackInfoService reportFeedbackInfoService;

    @Resource
    UserInfoService userInfoService;

    /**
     * @Description 用户在注册的时候需要校验各种参数
     * @Author hmr
     * @Date 12:53 2020/1/14
     * @Param checkValidDto
     * @param bindingResult
     * @return top.imuster.common.base.wrapper.Message 
     **/
    @ApiOperation(value = "用户在注册(修改信息)前需要校验各种参数(用户名、邮箱、手机号等)必须唯一",httpMethod = "POST")
    @PostMapping("/check")
    public Message<String> checkValid(@ApiParam("CheckValidDto实体类") @RequestBody CheckValidDto checkValidDto, BindingResult bindingResult) throws Exception {
        validData(bindingResult);
        boolean flag = userInfoService.checkValid(checkValidDto);
        if(flag){
            return Message.createBySuccess();
        }
        return Message.createByError(checkValidDto.getType().getTypeName() + "已经存在");
    }

    /**
     * @Description: 修改会员的个人信息
     * @Author: hmr
     * @Date: 2019/12/26 19:37
     * @param userInfo
     * @param bindingResult
     * @reture: top.imuster.common.base.wrapper.Message
     **/
    @PostMapping("/edit")
    @ApiOperation(value = "修改会员的个人信息(先校验一些信息是否存在)", httpMethod = "POST")
    public Message<String> editInfo(@ApiParam("ConsumerInfo实体类") @RequestBody @Validated(ValidateGroup.editGroup.class) UserInfo userInfo, BindingResult bindingResult){
        validData(bindingResult);
        userInfoService.updateByKey(userInfo);
        return Message.createBySuccess("修改个人信息成功");
    }

    /**
     * @Description: 用户举报
     * @Author: hmr
     * @Date: 2020/1/11 12:18
     * @param type
     * @param id
     * @reture: top.imuster.common.base.wrapper.Message
     **/
    @GetMapping("/report/{type}/{id}")
    @ApiOperation(value = "用户举报(type可选择 1-商品举报 2-留言举报 3-评价举报 4-帖子举报),id则为举报对象的id", httpMethod = "GET")
    public Message<String> reportFeedback(@ApiParam("1-商品举报 2-留言举报 3-评价举报 4-帖子举报")@PathVariable("type") Integer type, @ApiParam("举报对象的id") @PathVariable("id") Long id, HttpServletRequest request) throws Exception {
        Long userId = getIdByToken(request);
        ReportFeedbackInfo reportFeedbackInfo = new ReportFeedbackInfo();
        reportFeedbackInfo.setCustomerId(userId);
        reportFeedbackInfo.setType(type);
        reportFeedbackInfo.setTargetId(id);
        reportFeedbackInfo.setState(2);
        reportFeedbackInfoService.insertEntry(reportFeedbackInfo);
        return Message.createBySuccess("反馈成功,我们会尽快处理");
    }
}