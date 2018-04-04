#!/bin/sh

# sample usage: 
#   cd /home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr
#   ./analytics.sh -t 10m -d cLog/
#   ./analytics.sh -t 30m -d cLog
 
tOpt=$1
tVal=$2
dOpt=$3
dVal=$4

java -jar analytics.jar $tOpt $tVal $dOpt $dVal

# /home/front/Desktop/UserM/projects/eclipse-neon-workspace/aiAwLogAnalyticPr/cLog/
# 