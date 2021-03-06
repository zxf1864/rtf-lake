安装RTF(kafka版本)
=================

1、首先我们需要开启binlog功能，并配置binlog模式为ROW，在my.cnf中配置如下信息

```
[mysqld]
log-bin       = mysql-bin  #  开启binlog
binlog-format = ROW        #  选择模式为ROW
server_id     = 1          #
```

由于我们从binlog读取数据的方式是主从复制，所以需要一个非root用户模仿slave。需要新建用户并授权，如果已经有非root账号可以直接授权

```
CREATE USER rtfuser IDENTIFIED BY ‘rtfuser’;
GRANT SELECT, REPLICATION SLAVE, REPLICATION CLIENT ON *.* TO ‘rtfuser’@‘%’;
FLUSH PRIVILEGES;  #  刷新权限
```

2、点击下载RTF项目压缩包:[Download](../Download/download.md)

上传到服务器上并解压到指定目录：

```
tar -zxvf rtf-writer-1.0-SNAPSHOT.tar.gz rtf
```

3、在启动之前，我们需要进入解压之后的目录下的conf，在binlog.properties中配置以下信息：

```
host=      #mysql所在的主机ip
port=      #mysql的端口名称，一般默认为3306
dt_names=  #监听的离线表名，按照db1:table1 db2:table2格式输入
username=  #之前新建的用户
password=  #用户的密码
topics=    #不同的表需要通过不同的topic发送消息，同样按照topic1 topic2形式
server=    #producer所在的机器，例如192.168.210.101:9092
```

在conf.properties中配置：
```
SPARK_HOME=      #spark路径
MASTER=          #提交spark任务方式，可以通过master或者yarn来提交
SPARK_CORE=      #
```


接下来，需要配置接入表的信息(为了方便之后对rtf表进行管理，强烈建议以database_table的命名格式)：
```
cp example.properties db1_table1.properties

START_COMPACTION_FACTOR=5242880     #可以执行压实操作的文件大小
MUST_COMPACTION_FACTOR=30485760     #必须执行压实操作的文件大小
CORE_POOL_SIZE=3                    #线程池基本大小
MAX_POOL_SIZE=10                    #线程池最大线程数
MAX_COMPACTION_NUM=5                #最大压实数，不应超过初始化文件个数

filename=                           #hdfs上用于存放rtf数据的路径
topic=                              #用于消费的topic名
brokerlist=                         #
group=                              #

checkPointDir=                      #快照路径
fields=                             #DB中表的全部字段名
offset_filename=                    #offset路径，位于存放rtf数据的相同路径
                                          #,需要以_开头
primary_key=                        #主键字段
maxRatePerPartition=20000           #限制每个partition拉取速度
durations=30                        #窗口时间 秒
subconcurrency=10
backPressureEnabled=false
backPressureInitialRate=0
appName=yourAppName
recently_n_days=3                   #保留近n天数据
parallelism=20
executorIdleTimeout=1800s

```
至此，需要配置的基本信息就已经全部完成了。接下来，需要在hdfs上初始化你希望获得实时数据的离线表的对应文件夹。请转到[快速开始](./start.md)，有我们为您提供的一个示范。
