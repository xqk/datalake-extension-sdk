package io.datalake.plugins.xpack.email.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class XpackEmailViewRequest implements Serializable{

    private String panelId;

    private String content;

    private String pixel;
    
}
