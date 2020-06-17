package com.tinyv.sc.client_b.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by mayue on 2020/6/17.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String SWAGGER_BASE_SCAN_PACKAGE = "com.tinyv.sc.client_b.controller";

    @Bean
    public Docket createRestApi() {
        ApiInfo apiInfo = new ApiInfoBuilder()
                .title("服务接口文档范例")
                .description("服务接口文档，遵循RESTful API设计规范")
                .version("SNAPSHOT")
                .build();

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                //以扫描包的方式
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_BASE_SCAN_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }


}
