package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring/spring-redis.xml"})
public class TestRedis {
    @Autowired
    private ShardedJedisPool shardedJedisPool;


    @Test
    public void testSet() {
        ShardedJedis jedis = shardedJedisPool.getResource();
        jedis.set("name", "wwss");
    }


    @Test
    public void testGet() {
        ShardedJedis jedis = shardedJedisPool.getResource();
        String name = jedis.get("name");
        System.out.println(name);
    }
}