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

package com.jd.dw.rtf.binlog.Factory;

import com.github.shyiko.mysql.binlog.BinaryLogClient;
import com.jd.dw.rtf.binlog.listener.RtfEventListener;
import com.jd.dw.rtf.binlog.metastore.MysqlConnection;

public class BinLogFactory {

    public String host;
    public int port;
    public String user;
    public String password;
    //public String DN_Table;

    public BinLogFactory(String host, int port, String user, String password) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        //this.DN_Table = DN_Table;
    }

    public BinaryLogClient getBinlogClient(){
        MysqlConnection.setConnection(host, port, user, password);
        return new BinaryLogClient(host,port,user,password);
    }

    public RtfEventListener getEventListener(){
        return new RtfEventListener();
    }

/*    public Filter getFilter(){
        return new Filter(BinlogTools.selectedPart(DN_Table));
    }*/
}