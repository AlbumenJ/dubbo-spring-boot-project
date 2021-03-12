package org.apache.dubbo.spring.boot;

import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Albumen
 * @date on 2021/3/12
 */
@ComponentScan("org.apache.dubbo")
@SpringBootApplication
public class BaseTest {
}
