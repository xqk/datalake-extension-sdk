package io.datalake.plugins.xpack.dept.service;

import io.datalake.plugins.common.entity.XpackGridRequest;
import io.datalake.plugins.common.service.PluginMenuService;
import io.datalake.plugins.xpack.dept.dto.request.XpackCreateDept;
import io.datalake.plugins.xpack.dept.dto.request.XpackDeleteDept;
import io.datalake.plugins.xpack.dept.dto.request.XpackMoveDept;
import io.datalake.plugins.xpack.dept.dto.response.XpackDeptTreeNode;
import io.datalake.plugins.xpack.dept.dto.response.XpackSysDept;

import java.util.List;

public abstract class DeptXpackService extends PluginMenuService {

    public abstract List<XpackSysDept> nodesByPid(Long pid);

    public abstract List<XpackSysDept> nodesTreeByCondition(XpackGridRequest request);

    public abstract List<XpackDeptTreeNode> searchTree(Long deptId);

    public abstract int add(XpackCreateDept xpackCreateDept);

    public abstract int update(XpackCreateDept xpackCreateDept);

    public abstract int batchDelete(List<XpackDeleteDept> requests);

    public abstract void move(XpackMoveDept xpackMoveDept);
}
