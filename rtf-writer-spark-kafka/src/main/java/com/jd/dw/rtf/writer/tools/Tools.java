/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jd.dw.rtf.writer.tools;

import com.google.common.base.Strings;
import com.jd.dw.rtf.writer.Constants;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author anjinlong
 * @create 2017-07-11 11:39
 * @description description
 **/
public class Tools {
  private static String SPACE = " ";
  final static String DATE_FORMATE="yyyy-MM-dd HH:mm:ss";
  //final static String DATE_FORMATE="yyyy-MM-dd hh:mm:ss";

  public static String getdate() {
    Date d = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    return sdf.format(d);
  }

  public static int compareTS(String ts1, String ts2) {

    if (Strings.isNullOrEmpty(ts1) || Constants.NULL_STRING.equals(ts1)) {
      return 0;
    }
    if (Strings.isNullOrEmpty(ts2) || Constants.NULL_STRING.equals(ts2)) {
      return 1;
    }
    long l1 = 0;
    long l2 = 0;
    try {
      if (ts1.contains(":")) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dt1 = df.parse(ts1);
        l1 = dt1.getTime();
      } else {
        l1 = Long.parseLong(ts1);
      }

      if (ts2.contains(":")) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dt2 = df.parse(ts2);
        l2 = dt2.getTime();
      } else {
        l2 = Long.parseLong(ts2);
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    if (l1 >= l2) {
      return 1;
    } else {
      return 0;
    }
  }

  public static String getDateBefore(int lastNDays) {
    Calendar now = Calendar.getInstance();
    now.set(Calendar.DATE, now.get(Calendar.DATE) - lastNDays);
    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMATE);
    return sdf.format(now.getTime());
  }

  public static void readFileByLines(String fileName) {
    File file = new File(fileName);
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String tempString = null;
      int line = 1;
      while ((tempString = reader.readLine()) != null) {
        System.out.println("line " + line + ": " + tempString);
        line++;
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e1) {
        }
      }
    }
  }

  public static boolean isNumeric(String str) {
    Pattern pattern = Pattern.compile("[0-9]*");
    Matcher isNum = pattern.matcher(str);
    if (!isNum.matches()) {
      return false;
    }
    return true;
  }

  public static long getRealTimeDataStartPosFromFileName(String filename) throws Exception {
    String[] tmps = filename.split(Constants.FILE_PATH_SLASH, -1);
    String justFilename = tmps[tmps.length - 1];
    String[] tmpFiles = justFilename.split("-");
    if (tmpFiles.length == 3) {
      return Long.parseLong(tmpFiles[2]);
    } else {
      throw new Exception("this is not a real file! :" + filename);
    }
  }

  public static String timestamp2String(long ts) {
    String tsStr = "";
    DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    try {
      tsStr = sdf.format(ts);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return tsStr;
  }

  public static String getCurrentTime() {
    return timestamp2String(System.currentTimeMillis());
  }

  public static void printLog(String log) {
    System.out.println(new StringBuffer(getCurrentTime()).append(SPACE).append(log));
  }

  public static void printErrLog(String log) {
    System.err.println(new StringBuffer(getCurrentTime()).append(SPACE).append(log));
  }

  public static void printLog(String log, String level) {
    if (Constants.LOG_INFO.equals(level)) {
      System.out.println(new StringBuffer(getCurrentTime()).append(SPACE).append(log));
    } else if (Constants.LOG_ERROR.equals(level)) {
      System.err.println(new StringBuffer(getCurrentTime()).append(SPACE).append(log));
    }
  }

  public static void main(String[] args) {

    System.out.println(getDateBefore(1));

    /**
    Map<Integer, Long> partitionOffsets = new HashMap<Integer, Long>();
    partitionOffsets.put(0, 2121010755l);
    partitionOffsets.put(1, 2121380577l);
    partitionOffsets.put(2, 2121128332l);
    partitionOffsets.put(3, 2121337336l);
    partitionOffsets.put(4, 2120952612l);
    partitionOffsets.put(5, 2121199873l);
    partitionOffsets.put(6, 2121515346l);
    partitionOffsets.put(7, 2121078293l);
    partitionOffsets.put(8, 2121129553l);
    partitionOffsets.put(9, 2120957328l);
    partitionOffsets.put(10, 2121137334l);
    partitionOffsets.put(11, 2121233748l);
    partitionOffsets.put(12, 2120965378l);
    partitionOffsets.put(13, 2121283047l);
    partitionOffsets.put(14, 2121184214l);
    partitionOffsets.put(15, 2121057092l);
    partitionOffsets.put(16, 2121030017l);
    partitionOffsets.put(17, 2121156383l);
    partitionOffsets.put(18, 2121031682l);
    partitionOffsets.put(19, 2121158247l);
    partitionOffsets.put(20, 2121102527l);
    partitionOffsets.put(21, 2121115743l);
    partitionOffsets.put(22, 2121342936l);
    partitionOffsets.put(23, 2121224203l);
    partitionOffsets.put(24, 2121223522l);
     **/


//    writeOffsetFile("offset.properties", partitionOffsets);
//    Map<Integer, Long> map = readOffsetFile("offset.properties");
//    for (int k : map.keySet()) {
//      System.out.println(k + " : " + map.get(k));
//    }

  }


}