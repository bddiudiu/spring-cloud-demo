# spring-cloud-demo
spring-cloud-demo

相关内容可参考注释

#eureka
注册中心</br>
访问地址 `http://localhost:1111`

#userCenter
提供者</br>
提供一个简单的服务 </br>
add?a=1&b=2 </br>
计算传入的 a+b 的值</br>

```
引入了 configCenter服务</br>
并增加  bootstrap.properties 文件来配置configCenter的内容</br>
具体内容见相关文件

通过使用
http://localhost:2222/refresh 来更新内容 注:请使用post方式
```

#webPage
消费者 </br>
前端工程</br> 如作为前台页面或管理界面 根据apiGateway绑定的服务进行数据的交互

#apiGateway
网关工程</br>
配置所有的数据交互请求 </br>
添加接口的token进行接口安全认证 使用token验证(验证逻辑未实现)
`修改 AccessFilter 配置token验证规则`

#configCenter
配置中心</br>
对配置进行管理</br>
注册到注册中心,作为服务对外提供.</br>
配置对应的 git或者本地信息 进行配置管理</br>


#访问信息
注册中心 : `http://localhost:1111`

根据网关访问 : `http://localhost:5555/userCenter/add?a=1&b=2&accessToken=123`

服务提供者 : `http://localhost:2222/add?a=1&b=2`

配置中心 : `http://localhost:4444/{application}/{profile}`

```
注:
    如果使用配置中心,请先保证配置中心的配置信息正确,否则无法启动使用配置中心的应用
```