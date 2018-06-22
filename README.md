# spring-cloud-basis
springcloud基础练习

##关于spring2.0
注册中心使用springboot2.0版本时，springcloud的版本至少是Finchley.RELEASE，不然启动时会报错。
另外springboot2.0的启动方式中SpringApplicationBuilder.web(boolean webEnvironment)方法已经过时，
用SpringApplicationBuilder.web(WebApplicationType webApplicationType)代替

##注册中心
spring2.0之前注册中心引入的jar包是spring-cloud-starter-eureka-server，
spring2.0之后改为了spring-cloud-starter-netflix-eureka-server



