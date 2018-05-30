


说明：

配置中心：  通过git/svn 在本地中获取公共 配置文件， 并通过rest 方式供其他服务配置信息

服务注册中心： 提供服务注册 和 发现

服务群（服务提供者）：提供服务， 服务启动时， 从配置中心 获取公共配置信息， 并
将本地服务通过 eureka 注册到注册中心， 在注册时， 需要配置本服务的名称， 调用者通过此名称调用服务


客户端（服务调用者）： 客户端启动时， 从配置中心获取公共配置信息， 通过要访问的服务注册到
服务中心的名称调用 对应的服务， 如果服务注册的方式是 eurka, 则客户端也需要使用 eureka 访问， 通
过 ribbon 可以实现对服务群 的 负载均衡， hystrix 作为断路器，feign 方式简化了服务的调用方式

服务路由： 通过zuul 实现服务的路由， zuul 的作用类似 Nginx, 不是必须的模块






测试

启动服务顺序：
cloud-config-center (配置中心)

cloud-register-center (服务注册中心)

cloud-service  (服务提供者)

cloud-consumer  (服务调用者)
