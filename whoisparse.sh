#!/bin/bash
rm  emailaddresses.csv
while IFS='' read -r line || [[ -n "$line" ]]; do
	if [ "$line" != "" ]; then
    	test=$(whois $line | grep "Registrant Email:" | cut -d ':' -f 2)
    	if [ "$test" != "" ]; then 
    	echo $test >> emailaddresses.csv
    	else
    	    echo "">> emailaddresses.csv
    	fi

    else
        echo "">> emailaddresses.csv
    fi
    done < "$1"

