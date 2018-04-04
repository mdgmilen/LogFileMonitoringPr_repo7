

The current directory contains:
- analytics.sh
- analytics.jar
- the whole eclipse-project including the source code /.java files.



Important note: 
  I copied "ReverseLineInputStream.java" file from a third party.

Note:
  Due to time-pressure, unit-test (ContributorTest) was implemented only for Contributor class. 

Note: 
  To implement the current task I (Milen G) authored:
  - 4 /four .java files
  - one analytics.sh file,
  - one /1 pom.xml and
  - the current readMe.txt.


 * Sample usage:
 *   analytics -t <mins>m -d <dir>
 *   
 *   cd /home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr
 *   ./analytics.sh -t 10m -d cLog/
 *   java -jar analytics.jar -t 10m -d cLog/
 * 
 * 
 # sample usage: 
#   cd /home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr
#   ./analytics.sh -t 10m -d cLog/
#   ./analytics.sh -t 30m -d cLog
 
 
 
 
 
 * Execution and output:
 * 
 * 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ ./analytics.sh -t 30m -d cLog
start------------
127.0.0.1 user-identifier frank [28/Feb/2018:12:40:00 +0000] "GET10 /api/endpoint HTTP/1.0" 200 5134

end--------------
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 

 * 
 * 
 * 
 
execution, a couple of rows from http-02.log and two /2 rows from http-01.log
<<<<<<<<<<Wed Feb 28 17:09:59 EET 2018<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ ./analytics.sh -t 160m -d cLog/
start------------
127.0.0.1 user-identifier frank [28/Feb/2018:13:40:00 +0000] "GET23 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET22 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET21 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET20 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET19 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:40:00 +0000] "GET18 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET17 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET16 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET15 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET14 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET13 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET12 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:39:00 +0000] "GET11 /api/endpoint HTTP/1.0" 200 5134

127.0.0.1 user-identifier frank [28/Feb/2018:13:40:00 +0000] "GET10 /api/endpoint HTTP/1.0" 200 5134

end--------------
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ date
ср фев 28 17:09:59 EET 2018
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ pwd
/home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ ll
total 60
drwxrwxr-x 6 front front 4096 фев 28 17:08 ./
drwxrwxr-x 7 front front 4096 фев 27 20:15 ../
-rw-rw-r-- 1 front front 6734 фев 28 17:08 analytics.jar
-rw-rw-r-- 1 front front 4594 фев 28 14:34 analytics_old.jar
-rwxrwxr-x 1 front front  350 фев 28 15:03 analytics.sh*
-rw-rw-r-- 1 front front 1226 фев 28 11:12 .classpath
drwxrwxr-x 2 front front 4096 фев 28 15:13 cLog/
-rw-rw-r-- 1 front front  403 фев 27 20:15 pom.xml
-rw-rw-r-- 1 front front  546 фев 27 20:15 .project
-rw-rw-r-- 1 front front 1241 фев 28 15:29 readMe.txt
drwxrwxr-x 2 front front 4096 фев 27 20:15 .settings/
drwxrwxr-x 4 front front 4096 фев 27 20:15 src/
drwxrwxr-x 4 front front 4096 фев 27 20:15 target/
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
front@front:~/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr$ 
>>>>>>>>>>>>>>>>>>>>>>>>>>Wed Feb 28 17:09:59 EET 2018>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 
 
 
 
 
 
 
 	// From the requirements: "...Note that in real world, log and files count might be in the millions..."
	// My (Milen G) comment:   It's an overall better idea to organize the log files in a hierarchy of directories so that no single directory has 
	//    more than a few thousand entries.
	
	
	
	
	
	