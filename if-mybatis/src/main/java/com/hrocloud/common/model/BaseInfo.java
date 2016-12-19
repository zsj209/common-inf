package com.hrocloud.common.model;

import com.hrocloud.common.page.PageParameter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BaseInfo implements Serializable {


    private static final long serialVersionUID = 1439022303213602336L;
    private String sql;
    private List<Object> params = new ArrayList<Object>();
    private List<SqlMap> sqlMaps = new ArrayList<SqlMap>();

    public BaseInfo() {
        super();
    }

    public BaseInfo(String sql) {
        super();
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<Object> getParams() {
        return params;
    }

    public void setParams(List<Object> params) {
        this.params = params;
    }

    public List<SqlMap> getSqlMaps() {
        return sqlMaps;
    }

    public void setSqlMaps(List<SqlMap> sqlMaps) {
        this.sqlMaps = sqlMaps;
    }

    @Override
    public String toString() {
        return "BaseInfo [sql=" + sql + ", params=" + params + ", sqlMaps=" + sqlMaps + "]";
    }

    public String refactor(String mark, int size) {
        String str = "";
        if (size > 0) {
            for (int i = 0; i < size - 1; i++) {
                str += "?,";
            }
            str += "?";
        }
        return this.sql.replace(mark, str);
    }

    public void load() {
        if (this.sql != null) {
            String[] arr = this.sql.split("\\?");
            for (int i = 0; i < this.params.size(); i++) {
                this.sqlMaps.add(new SqlMap(arr[i], this.params.get(i)));
            }
            if (arr.length > this.params.size()) {
                this.sqlMaps.add(new SqlMap(arr[arr.length - 1], null));
            }
            this.sql = null;
            this.params = null;
        }
    }

}
