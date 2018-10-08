# Project Documentation

***
## 1.SpringBoot 集成常用开发场景starter如下：

### 1.1 spring-boot-starter-jdbc
### 1.2 mybatis-spring-boot-start
### 1.3 spring-boot-starter-cache
### 1.4 spring-boot-starter-web
### 1.5 spring-boot-starter-mail
### 1.6 spring-boot-starter-data-redis
### 1.7 spring-boot-starter-data-elasticsearch

***
## 2.DataSource switch and common Configuration

### 2.1 DruidDataSource
### 2.2 HikariDataSource

***
## 3.Mybatis Generator Configuration

### 3.1 插件（序列化、equals&hashCode、toString etc.）
### 3.2 代码生成配置原则见 src/main/resources/generatorConfig.xml

***
## 4.Redis match Spring Cache 
### 4.1 Spring Cache
#### 4.1.1 @EnableCaching
#### 4.1.2 @Cacheable
#### 4.1.3 @CachePut
#### 4.1.4 @CacheEvict
#### 4.1.5 @CacheConfig

### 4.2 Redis
#### 4.2.1 RedisTemplate
#### 4.2.2 CacheManager
#### 4.2.3 修改默认序列化规则至Jack2JsonRedisSerializer
##### 4.2.3.1 Version 2.0 以前，是配置自定义的RedisTemplate和CacheManager
##### 4.2.3.2 Version 2.0 以后，有待研究……

***
## 5.Mail Sender
### 5.1 SimpleMailMessage Sender
### 5.2 MimeMailMessage Sender

***
## 6.Elasticsearch 待补充……





