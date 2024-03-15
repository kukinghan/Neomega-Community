/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the neomgcomm4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package cn.kukinghan.neomega.neomgcomm.codegen.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import cn.kukinghan.neomega.neomgcomm.codegen.entity.GenGroupEntity;
import cn.kukinghan.neomega.neomgcomm.codegen.util.vo.GroupVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 模板分组
 *
 * @author PIG
 * @date 2023-02-21 20:01:53
 */
@Mapper
public interface GenGroupMapper extends BaseMapper<GenGroupEntity> {

	GroupVo getGroupVoById(@Param("id") Long id);

}
