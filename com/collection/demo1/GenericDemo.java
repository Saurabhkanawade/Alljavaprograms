package com.collection.demo1;

public class GenericDemo<T> {
    private T data;

    //    public GenericDemo(T data){
//        this.data=data;
//    }
    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
