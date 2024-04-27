package com.siddharth.parking.models;
public class Gate extends Base{
    private int gateNumber;
    private Operator operator;
    private Gatestatusenum gateStatus;
    private Gatetypeenum gateType;

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gatestatusenum getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(Gatestatusenum gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Gatetypeenum getGateType() {
        return gateType;
    }

    public void setGateType(Gatetypeenum gateType) {
        this.gateType = gateType;
    }
}
