package com.banfftech;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustRequestManage {
    @JsonProperty("custRequestId")
    private String custRequestId;

    @JsonProperty("custRequestTypeId")
    private String custRequestTypeId;

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(String custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }
}
