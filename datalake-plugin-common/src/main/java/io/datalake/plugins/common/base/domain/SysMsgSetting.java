package io.datalake.plugins.common.base.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("订阅信息")
public class SysMsgSetting implements Serializable {
    @ApiModelProperty(hidden = true)
    private Long msgSettingId;

    @ApiModelProperty("订阅用户ID")
    private Long userId;

    @ApiModelProperty("订阅类型ID")
    private Long typeId;

    @ApiModelProperty("订阅渠道ID")
    private Long channelId;

    @ApiModelProperty("订阅状态ID")
    private Boolean enable;

    private static final long serialVersionUID = 1L;

    public Boolean match(SysMsgSetting setting) {
        return setting.getTypeId() == typeId && setting.getChannelId() == channelId;
    }
}