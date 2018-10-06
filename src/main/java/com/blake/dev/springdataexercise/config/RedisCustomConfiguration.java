package com.blake.dev.springdataexercise.config;

import com.blake.dev.springdataexercise.entity.Department;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;
import java.util.List;

/**
 * Created by Blake on 2018/10/4
 */
@Configuration
public class RedisCustomConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.cache")
    public CacheProperties cacheProperties() {
        return new CacheProperties();
    }

    @Bean
    public RedisTemplate<Object, Department> deptRedisTemplate(
            RedisConnectionFactory redisConnectionFactory)
            throws UnknownHostException {
        RedisTemplate<Object, Department> template = new RedisTemplate<>();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Department> serializer = new Jackson2JsonRedisSerializer<>(Department.class);
        template.setDefaultSerializer(serializer);
        return template;
    }

    @Bean
    public RedisCacheManager deptRedisCacheManager(RedisTemplate<Object, Department> deptRedisTemplate,
                                                   CacheProperties cacheProperties) {
        RedisCacheManager cacheManager = new RedisCacheManager(deptRedisTemplate);
        assembleCacheManager(cacheProperties, cacheManager);
        return cacheManager;
    }

    @Bean
    @Primary
    public RedisCacheManager cacheManager(RedisTemplate<Object, Object> redisTemplate
            , CacheProperties cacheProperties) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        assembleCacheManager(cacheProperties, cacheManager);
        return cacheManager;
    }

    private void assembleCacheManager(CacheProperties cacheProperties, RedisCacheManager cacheManager) {
        cacheManager.setUsePrefix(true);
        List<String> cacheNames = cacheProperties.getCacheNames();
        if (!cacheNames.isEmpty()) {
            cacheManager.setCacheNames(cacheNames);
        }
    }

}
