package com.example.demo;

public class ImpCalcSquareArea extends CheckOfAnAbstractClass {

    public ImpCalcSquareArea() {
        this.squareID = "123-SQ-" + Math.PI;
        this.setGetTestIntegerLengthInit(1);
        this.setGetTestIntegerWidthInit(1);
        this.setTestIntegerArea(this.getGetTestIntegerLengthInit() * this.getGetTestIntegerWidthInit());
    }

    @Override
    public Integer CalculateArea(Integer getTestIntegerLength, Integer getTestIntegerWidth) {

        return getTestIntegerLength * getTestIntegerWidth;
    }

}
