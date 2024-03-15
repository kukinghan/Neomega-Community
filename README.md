## 系统说明
- jdk17: java17 + springboot 3.2 + springcloud 2023

- 基于 Spring Cloud 、Spring Boot、 OAuth2 的 RBAC **权限管理系统**
- 基于数据驱动视图的理念封装 element-plus，即使没有 vue 的使用经验也能快速上手
- 提供对常见容器化支持 Docker、Kubernetes、Rancher2 支持
- 提供 lambda 、stream api 、webflux 的生产实践


### 核心依赖

| 依赖                          | 版本         |
|-----------------------------|------------|
| Spring Boot                 | 3.2.3      |
| Spring Cloud                | 2023.0.0   |
| Spring Cloud Alibaba        | 2022.0.0.0 |
| Spring Authorization Server | 1.2.2      |
| Mybatis Plus                | 3.5.5      |
| Vue                      | 3.4        |
| Element Plus                      | 2.5        |

### 模块说明

```lua
neomgcomm-ui

neomgcomm
├── neomgcomm-auth -- 授权服务提供[3000]
└── neomgcomm-common -- 系统公共模块
     ├── neomgcomm-common-bom -- 全局依赖管理控制
     ├── neomgcomm-common-core -- 公共工具类核心包
     ├── neomgcomm-common-datasource -- 动态数据源包
     ├── neomgcomm-common-log -- 日志服务
     ├── neomgcomm-common-oss -- 文件上传工具类
     ├── neomgcomm-common-mybatis -- mybatis 扩展封装
     ├── neomgcomm-common-seata -- 分布式事务
     ├── neomgcomm-common-security -- 安全工具类
     ├── neomgcomm-common-swagger -- 接口文档
     ├── neomgcomm-common-feign -- feign 扩展封装
     └── neomgcomm-common-xss -- xss 安全封装
├── neomgcomm-register -- Nacos Server[8848]
├── neomgcomm-gateway -- Spring Cloud Gateway网关[9999]
└── neomgcomm-upms -- 通用用户权限管理模块
     └── neomgcomm-upms-api -- 通用用户权限管理系统公共api模块
     └── neomgcomm-upms-biz -- 通用用户权限管理系统业务处理模块[4000]
└── neomgcomm-visual
     └── neomgcomm-monitor -- 服务监控 [5001]
     ├── neomgcomm-codegen -- 图形化代码生成 [5002]
     └── neomgcomm-quartz -- 定时任务管理台 [5007]
```

## 更新子模块
```
git submodule init	# 初始化子模块
git submodule update	# 更新子模块
```

> 也可以在克隆子模块时更新子模块
```
git clone --recurse-submodules  <url>
```

