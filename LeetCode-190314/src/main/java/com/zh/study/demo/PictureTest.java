package com.zh.study.demo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 * @auther zh
 * @data 2019/3/23 11:03
 * 实现图片编辑功能
 */
public class PictureTest {

    private Font font = new Font("宋体", Font.PLAIN, 12);
    private Graphics2D g = null;
    private int fontsize = 0;
    private int x = 0;
    private int y = 0;

    public BufferedImage loadImageLocal(String name) {
        try {
            return ImageIO.read(new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeImageLoacl(String newImage, BufferedImage img) {
        if (newImage != null && img != null) {
            File outputfile = new File(newImage);
            try {
                ImageIO.write(img, "jpg", outputfile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public BufferedImage modifyImage(BufferedImage img, Object content, int x, int y) {

        try {
            int w = img.getWidth();
            int h = img.getHeight();
            g = img.createGraphics();
            g.setBackground(Color.RED);//设置背景颜色
            g.setColor(Color.BLUE);//设置字体颜色
            if (this.font != null) {
                g.setFont(this.font);
            }
            // 验证输出位置的纵坐标和横坐标
            if (x >= h || y >= w) {
                this.x = h - this.fontsize + 2;
                this.y = w;
            } else {
                this.x = x;
                this.y = y;
            }
            if (content != null) {
                g.drawString(content.toString(), this.x, this.y);
            }
            g.dispose();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return img;

    }


    public static void main(String[] args) {
        PictureTest pictureTest = new PictureTest();
        BufferedImage d = pictureTest.loadImageLocal("C:\\Users\\97557\\Desktop\\shiyuan.jpg");
        pictureTest.writeImageLoacl("C:\\Users\\97557\\Desktop\\new.jpg",
                pictureTest.modifyImage(d, "这是文本", 0, 10));
        System.out.println("success");
    }


}
