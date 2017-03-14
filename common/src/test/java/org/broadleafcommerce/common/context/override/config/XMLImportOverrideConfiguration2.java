package org.broadleafcommerce.common.context.override.config;

import org.broadleafcommerce.common.extensibility.FrameworkXmlBeanDefinitionReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author Nick Crum ncrum
 */
@Configuration
@ImportResource(value = "classpath:context/config/xml-import-override.xml", reader = FrameworkXmlBeanDefinitionReader.class)
public class XMLImportOverrideConfiguration2 {

    @Bean
    public PasswordEncoder blPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}