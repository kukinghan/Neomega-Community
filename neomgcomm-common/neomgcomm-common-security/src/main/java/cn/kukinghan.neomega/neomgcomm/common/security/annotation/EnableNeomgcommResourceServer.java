/*
 * Copyright (c) 2020 neomgcomm4cloud Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.kukinghan.neomega.neomgcomm.common.security.annotation;

import cn.kukinghan.neomega.neomgcomm.common.security.component.NeomgcommResourceServerAutoConfiguration;
import cn.kukinghan.neomega.neomgcomm.common.security.component.NeomgcommResourceServerConfiguration;
import cn.kukinghan.neomega.neomgcomm.common.security.feign.NeomgcommFeignClientConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author lengleng
 * @date 2022-06-04
 * <p>
 * 资源服务注解
 */
@Documented
@Inherited
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Import({ NeomgcommResourceServerAutoConfiguration.class, NeomgcommResourceServerConfiguration.class,
		NeomgcommFeignClientConfiguration.class })
public @interface EnableNeomgcommResourceServer {

}
