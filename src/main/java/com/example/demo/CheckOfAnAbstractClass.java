package com.example.demo;

public abstract class CheckOfAnAbstractClass {
    public String squareID;
    private Integer testIntegerArea;
    private Integer getTestIntegerLengthInit;
    private Integer getTestIntegerWidthInit;
    public String getSquareID() {
        return squareID;
    }

    public Integer getTestIntegerArea() {
        return testIntegerArea;
    }

    public void setGetTestIntegerLengthInit(Integer getTestIntegerLengthInit) {
        this.getTestIntegerLengthInit = getTestIntegerLengthInit;
    }

    public void setGetTestIntegerWidthInit(Integer getTestIntegerWidthInit) {
        this.getTestIntegerWidthInit = getTestIntegerWidthInit;
    }

    public Integer getGetTestIntegerLengthInit() {
        return getTestIntegerLengthInit;
    }

    public Integer getGetTestIntegerWidthInit() {
        return getTestIntegerWidthInit;
    }

    public void setTestIntegerArea(Integer testIntegerArea) {
        this.testIntegerArea = testIntegerArea;
    }

    public abstract Integer CalculateArea(Integer getTestIntegerLength, Integer getTestIntegerWidth);
}
