package cn.kukinghan.neomega.neomgcomm.admin.controller;

import cn.kukinghan.neomega.neomgcomm.admin.api.dto.UserDTO;
import cn.kukinghan.neomega.neomgcomm.admin.service.SysUserService;
import cn.kukinghan.neomega.neomgcomm.common.core.util.R;
import cn.kukinghan.neomega.neomgcomm.common.log.annotation.SysLog;
import cn.kukinghan.neomega.neomgcomm.common.security.annotation.Inner;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lengleng
 * @date 2022/3/30
 * <p>
 * 客户端注册功能 register.user = false
 */
@RestController
@RequestMapping("/register")
@RequiredArgsConstructor
@ConditionalOnProperty(name = "register.user", matchIfMissing = true)
public class SysRegisterController {

	private final SysUserService userService;

	/**
	 * 注册用户
	 * @param userDto 用户信息
	 * @return success/false
	 */
	@Inner(value = false)
	@SysLog("注册用户")
	@PostMapping("/user")
	public R<Boolean> registerUser(@RequestBody UserDTO userDto) {
		return userService.registerUser(userDto);
	}

}
