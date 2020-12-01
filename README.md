## 整体流程交互
本demo主要是用于演示数据交互过程，性能很一般，仅供各选手参考

## How to run on windows
put simple-http-server-1.0-SNAPSHOT.jar, scoring-1.0-SNAPSHOT.jar, tailbaseSampling-1.0-SNAPSHOT.jar, checkSum.data, trace1.data, trace2.data into one folder e.g. D:\Tianchi\small  

CD D:\Tianchi\small  
java -D"file.upload-dir"=D:/Tianchi/small -jar .\simple-http-server-1.0-SNAPSHOT.jar  
java -D"server.port"=8000 -jar .\tailbaseSampling-1.0-SNAPSHOT.jar  
java -D"server.port"=8001 -jar .\tailbaseSampling-1.0-SNAPSHOT.jar  
java -D"server.port"=8002 -jar .\tailbaseSampling-1.0-SNAPSHOT.jar  
java -D"server.port"=9000 -DcheckSumPath="D:/Tianchi/small/checkSum.data" -jar .\scoring-1.0-SNAPSHOT.jar  

## flow chart
![enter image description here](https://tianchi-public.oss-cn-hangzhou.aliyuncs.com/public/files/forum/158937741003137571589377409737.png)
