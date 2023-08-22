package com.narisu.homework;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(new News("1101121191008611"));
        arrayList.add(new News("11011211910086119"));
        int size = arrayList.size();
        for (int i = size -1; i >= 0 ; i--) {
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }
    }
    //专门写个方法 处理实现新闻标题
    public static  String processTitle(String title) {
        if (title == null) {
            return"";
        }
        if (title.length() > 15) {
            return title.substring(0,15) + "........";
        }else {
            return title;
        }
    }
}
class News {
    private String title;
    private String content;
    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}