package io.datalake.plugins.xpack.email.dto.request;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.util.HtmlUtils;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

@Data
public class XpackEmailCreate implements Serializable{

    private XpackEmailTaskRequest request;

    private String emailContent;


    public XpackEmailTaskRequest fillContent() {
        if (StringUtils.isBlank(emailContent)) {
            return request;
        }
        String htmlEscape = HtmlUtils.htmlEscape(emailContent);

        byte[] bytes;
        try {
            bytes = htmlEscape.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        request.setContent(bytes);
        return request;
    }
    
}
