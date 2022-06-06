package com.zhao.www.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread类
public class Downloader extends Thread {
    private String url;
    private String name;
    public Downloader(String url,String name){
        this.url=url;
        this.name=name;
    }
    //下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader=new WebDownloader();
        try {
            webDownloader.downloader(url,name);
            System.out.println("下载了文件名为"+name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Downloader downloader = new Downloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F661ac51652c51c47d560548086a620fc524f0c6d.jpg&refer=http%3A%2F%2Fi0.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1629991734&t=fa6ce5400b357d2247a54535c3674fc3","1.jpg");
        Downloader downloader1 = new Downloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F3699e24a4fe2c0f564a13ebd2ee66cd45489d985.jpg&refer=http%3A%2F%2Fi0.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1629991778&t=817c889c9dcfa2f4d4f74c0fa6f6e74d","2.jpg");
        Downloader downloader2 = new Downloader("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fi0.hdslb.com%2Fbfs%2Farticle%2F2f4ecb4738959ead2c3b230903c37d16a2c596ed.jpg&refer=http%3A%2F%2Fi0.hdslb.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1629992000&t=6229aa10d382ab2793e242dc08b1b6d8","3.jpg");

        downloader.start();
        downloader1.start();
        downloader2.start();
    }
}
//下载器
class webDownloader{
    //下载方法
    public void downloder(String url, String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常,DownLoader方法出现问题");
        }
    }
}


