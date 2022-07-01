package io.datalake.plugins.datasource.provider;

import com.alibaba.druid.pool.DruidDataSource;
import io.datalake.plugins.datasource.entity.TableDesc;
import io.datalake.plugins.datasource.entity.TableField;
import io.datalake.plugins.common.request.datasource.DatasourceRequest;
import io.datalake.plugins.datasource.entity.JdbcConfiguration;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public abstract class Provider {

    abstract public List<String[]> getData(DatasourceRequest datasourceRequest) throws Exception;

    abstract public List<TableDesc> getTables(DatasourceRequest datasourceRequest) throws Exception ;

    abstract public String checkStatus(DatasourceRequest datasourceRequest) throws Exception ;

    public List<String[]> fetchResult(DatasourceRequest datasourceRequest) throws Exception {
        return null;
    }

    abstract public List<TableField> fetchResultField(DatasourceRequest datasourceRequest) throws Exception ;

    abstract public Map<String, List> fetchResultAndField(DatasourceRequest datasourceRequest) throws Exception;

    public void handleDatasource(DatasourceRequest datasourceRequest, String type) throws Exception{
    }

    public List<String> getSchema(DatasourceRequest datasourceRequest) throws Exception{
        return null;
    }

    public List<TableField> getTableFileds(DatasourceRequest datasourceRequest) throws Exception {
        return null;
    }

    public String getTablesSql(DatasourceRequest datasourceRequest) throws Exception{
        return null;
    }

    public String getViewSql(DatasourceRequest datasourceRequest) throws Exception {
        return null;
    }

    public String getSchemaSql(DatasourceRequest datasourceRequest) throws Exception{
        return null;
    }

    public Connection getConnection(DatasourceRequest datasourceRequest) throws Exception{
        return null;
    }

    public JdbcConfiguration setCredential(DatasourceRequest datasourceRequest, DruidDataSource dataSource) throws Exception{
        return null;
    }

    public Connection getConnectionFromPool(DatasourceRequest datasourceRequest) throws Exception {
        return null;
    }

    public void addToPool(DatasourceRequest datasourceRequest) throws PropertyVetoException, SQLException, Exception {
    }
}
