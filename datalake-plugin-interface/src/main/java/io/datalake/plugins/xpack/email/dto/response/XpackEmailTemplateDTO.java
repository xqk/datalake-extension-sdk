package io.datalake.plugins.xpack.email.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class XpackEmailTemplateDTO implements Serializable{

    private Long id;

    private String title;

    private String panelId;

    private String recipients;

    private String pixel;

    private Long taskId;

    private byte[] content;
    
}
