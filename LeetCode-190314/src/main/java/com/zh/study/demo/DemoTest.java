package com.zh.study.demo;

import java.io.*;

/**
 * @auther zh
 * @data 2019/3/19 13:05
 */

 class TestDemo {
    public static void main(String[] args) throws IOException {
        File[] files = new File[] { new File("C:\\Users\\97557\\Desktop\\testa.txt"),
                new File("C:\\Users\\97557\\Desktop\\testb.txt") };
        String[] data = new String[2] ;
        for (int i = 0; i < files.length ; i++) {
            data[i] = readFile(files[i]) ;
        }
        StringBuffer buf = new StringBuffer() ; // 组合操作
//        String contentA [] = data[0].split(" ") ;
//        String contentB [] = data[1].split(" ") ;
//        for (int i = 0; i < contentA.length ; i++) {
//            buf.append(contentA[i]).append("(").append(contentB[i]).append(")").append(" ") ;
//        }
        buf.append(data[0]).append(data[1]);
        System.out.println(buf);
    }
    public static String readFile(File file) throws IOException {
        if (file.exists()) {
            InputStream input = new FileInputStream(file);
// 没有向上转型，因为稍后要使用到toByteArray()方法。
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int temp = 0;
            byte[] data = new byte[10];
            while ((temp = input.read(data)) != -1) {
// 将数据保存在bos中
                bos.write(data, 0, temp);
            }
            bos.close();
            input.close();
// 将读取内容返回
            return new String(bos.toByteArray());
        }
        return null;
    }
}
// class Attachment  implements Serializable{
//
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//public class DemoTest implements Cloneable, Serializable {
//    private Attachment attachment;
//    private String name;
//    private String date;
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return (DemoTest)super.clone();
//    }
//
//    public Attachment getAttachment() {
//        return attachment;
//    }
//
//    public void setAttachment(Attachment attachment) {
//        this.attachment = attachment;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//    public DemoTest deepClone() throws IOException,ClassNotFoundException{
//        //将对象写入流中
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//        objectOutputStream.writeObject(this);
//        //从流中取出
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        return (DemoTest)objectInputStream.readObject();
//
//    }
//}
//class Test{
//    public static void main(String[] args) {
//        Attachment attachment = new Attachment();
//        attachment.setName("zhang");
//
//    }
//}
