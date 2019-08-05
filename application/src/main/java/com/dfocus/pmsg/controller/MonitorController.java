package com.dfocus.pmsg.controller;

import com.dfocus.mint.web.rsp.Response;
import com.dfocus.pmsg.service.atom.IProjectKeyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author baozi
 * @Date: 2019/6/11 10:05
 * @Description:
 */
@Api("接口: 公钥管理")
@RestController
public class MonitorController {

	@Autowired
	IProjectKeyService projectKeyService;

	@ApiOperation("接口: 获取公钥")
	@RequestMapping(method = RequestMethod.GET, value = "/public_keys")
	Response<Map<String, String>> getPublicKeys() {
		return Response.success(projectKeyService.getPublicKeys());
	}

}