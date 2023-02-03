package com.platformv.template.controllers.contracts;

import com.platformv.template.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api(tags = {SwaggerConfig.HELLO_WORLD_TAG})
@EnableSwagger2
public interface Contract {

    @ApiOperation("Поздороваться! ;)")
    String hello();
}
