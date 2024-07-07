#!/bin/bash
if [[ -e /var/log/syslog ]]
then
	cat /var/log/syslog | grep "^Apr"
else
	echo "File not found"
fi
