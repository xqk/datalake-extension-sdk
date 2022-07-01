package io.datalake.plugins.xpack.auth.dto.request;

import io.datalake.plugins.common.constants.PluginSystemConstants;
import lombok.Data;

@Data
public class XpackBaseTreeRequest {

    private String id;

    private String name;

    //授权资源类型 eg：chart role
    private String modelType;

    //pid 为0 时 查询的是顶级节点 SQL需要相应的处理
    private String pid;

    //now 返回当前条件查询的数据 parent 返回当前数据查询的数据同时递归父节点数据; children 返回当前数据查询的数据同时递归子节点数据
    private String withExtend= PluginSystemConstants.WITH_EXTEND.NOW;

    private String createBy;

    private String withAuth;//需要根据权限返回


    public XpackBaseTreeRequest() {
    }

    public XpackBaseTreeRequest(String id,String modelType, String withExtend) {
        this.id = id;
        this.modelType = modelType;
        this.withExtend = withExtend;
    }
}
