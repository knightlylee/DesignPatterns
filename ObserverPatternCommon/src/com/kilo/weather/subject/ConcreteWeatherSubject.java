package com.kilo.weather.subject;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * Created by kilo on 2018/3/10.
 */
public class ConcreteWeatherSubject extends Subject {

    //获取天气的内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //天气更新了，通知所有的订阅人
        this.notifyObservers();
    }
}
