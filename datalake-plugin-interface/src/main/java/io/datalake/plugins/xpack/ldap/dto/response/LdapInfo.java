package io.datalake.plugins.xpack.ldap.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class LdapInfo implements Serializable{

    private String url;
    private String dn;
    private String password;
    private String ou;
    private String filter;
    private String mapping;
    private String open;
}
