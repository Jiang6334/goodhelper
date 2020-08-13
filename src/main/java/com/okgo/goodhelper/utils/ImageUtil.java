//package com.okgo.goodhelper.utils;
//
//import com.alibaba.cos.COSClient;
//import com.qcloud.cos.ClientConfig;
//import com.qcloud.cos.auth.BasicCOSCredentials;
//import com.qcloud.cos.auth.COSCredentials;
//import com.qcloud.cos.exception.CosServiceException;
//import com.qcloud.cos.model.ObjectMetadata;
//import com.qcloud.cos.model.PutObjectRequest;
//import com.qcloud.cos.region.Region;
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//public class ImageUtil {
//
//    private static final String SECRETID = "AKIDfJirkP41ZrwmRyDI7gy3sVw96uTmRiNm";
//    private static final String SECRETKEY = "MUP5VigaGvPtsIVSEnBcomU0MTUGqAD0";
//    private static final String BUCKETNAME = "shop-product-1259560818";
//
//    /**
//     * 上传到云服务器
//     * @param file
//     * @return
//     */
//    public static String uploadWx(MultipartFile file){
//
//        if(file == null || file.isEmpty())
//            return null;
//        //上传图片不大于10m
//        if(file.getSize() > 10 * 1024 * 1024)
//            return null;
//        COSCredentials cred = new BasicCOSCredentials(SECRETID, SECRETKEY);
//        Region region = new Region("ap-beijing");
//        ClientConfig clientConfig = new ClientConfig(region);
//        COSClient cosClient = new COSClient(cred, clientConfig);
//        String rename = RandomUtil.getRandom();
//        String filename = file.getOriginalFilename();
//        String[] strings = filename.split("\\.");
//        String type = strings[strings.length-1];
//        if(type!=null&&(type.equals("img") || type.equals("png") || type.equals("jpg") ||
//                type.equals("gif") || type.equals("bmp") || type.equals("swf") ||
//                type.equals("ico") || type.equals("jpeg"))){
//            rename = rename + "." + type;
//        }else {
//            return null;
//        }
//        try {
//            InputStream inputStream = file.getInputStream();
//            ObjectMetadata objectMetadata = new ObjectMetadata();
//            objectMetadata.setContentLength(file.getSize());
//            objectMetadata.setCacheControl("no-cache");
//            PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKETNAME, rename, inputStream, objectMetadata);
//            putObjectRequest.setMetadata(objectMetadata);
//            cosClient.putObject(putObjectRequest);
//        } catch (CosServiceException e) {
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            cosClient.shutdown();
//        }
//        return rename;
//    }
//
//    /**
//     * 删除图片
//     * @param key
//     */
//    public static void delete(String key){
//        if(StringUtils.isBlank(key))
//            return;
//        COSCredentials cred = new BasicCOSCredentials(SECRETID, SECRETKEY);
//        Region region = new Region("ap-beijing");
//        ClientConfig clientConfig = new ClientConfig(region);
//        COSClient cosClient = new COSClient(cred, clientConfig);
//        try{
//            cosClient.deleteObject(BUCKETNAME,key);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            cosClient.shutdown();
//        }
//    }
//
//    /**
//     * 上传图片
//     * @param url
//     * @return
//     */
//    public static String uploadStream(String url) {
//
//        COSCredentials cred = new BasicCOSCredentials(SECRETID, SECRETKEY);
//        Region region = new Region("ap-beijing");
//        ClientConfig clientConfig = new ClientConfig(region);
//        COSClient cosClient = new COSClient(cred, clientConfig);
//        String rename = RandomUtil.getRandom() + ".jpg";
//
//        try {
//            InputStream inputStream = null;
//            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
//            connection.setReadTimeout(5000);
//            connection.setConnectTimeout(5000);
//            connection.setRequestMethod("GET");
//            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK)
//                inputStream = connection.getInputStream();
//            try {
//                ObjectMetadata objectMetadata = new ObjectMetadata();
//                objectMetadata.setCache Control("no-cache");
//                objectMetadata.setContentLength(connection.getContentLength());
//                PutObjectRequest putObjectRequest = new PutObjectRequest(BUCKETNAME, rename, inputStream, objectMetadata);
//                putObjectRequest.setMetadata(objectMetadata);
//                cosClient.putObject(putObjectRequest);
//            } catch (CosServiceException e) {
//                e.printStackTrace();
//            }finally {
//                cosClient.shutdown();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return rename;
//    }
//
//}