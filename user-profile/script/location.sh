#!/bin/bash
# author: hehuihui@meituan.com
# date: 2015-07-21

source ./conf.sh

jobname="hehuihui_user_profile_$0"
map_script='location.map.py'
reduce_script=''

input_dir="/user/hive/warehouse/mart_mobile.db/user_workhome_location"
output_dir="/user/hadoop-hoteldata/hehuihui/user-profile/location"

${HADOOP} fs -rmr $output_dir
${HADOOP_STREAM} \
	-jobconf mapred.job.name=$jobname \
	-jobconf mapred.job.queue.name=${HADOOP_QUEUE} \
	-jobconf mapred.job.priority="VERY_HIGH" \
	-jobconf stream.memory.limit=2048 \
	-jobconf mapred.reduce.tasks=0 \
	-input $input_dir \
	-output $output_dir \
	-mapper "$python $(basename $map_script)" \
	-file $map_script 

if [ $? -ne 0 ]
then
	echo "[Haodop Error]: job $jobname failed!"
	exit -1
fi
