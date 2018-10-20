/*
Author : Aatman
Timestamp : 9 Jun 2018 00:29:11
*/
package com.home.main;

import java.io.*;
import java.net.*;

public class URLDemo {

   public static void main(String [] args) {
      try {
         URL url = new URL("https://mail.google.com/mail/ca/u/0/#inbox");
         
         System.out.println("URL is " + url.toString());
         System.out.println("protocol is " + url.getProtocol());
         System.out.println("authority is " + url.getAuthority());
         System.out.println("file name is " + url.getFile());
         System.out.println("host is " + url.getHost());
         System.out.println("path is " + url.getPath());
         System.out.println("port is " + url.getPort());
         System.out.println("default port is " + url.getDefaultPort());
         System.out.println("query is " + url.getQuery());
         System.out.println("ref is " + url.getRef());
         System.out.println("Content is " + url.getContent());
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}