package org.exam.dto;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
public class BaseDto  implements Serializable {
    @ApiModelProperty(name = "code",value = "编码")
    private String code;
    public String getCode() {
        return code;
    }
    public BaseDto setCode(String code) {
        this.code = code;
        return this;
    }
}
