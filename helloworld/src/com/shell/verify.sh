#!/bin/bash


if [ $l-gt90 ]
then
echo "Good,$l"
elif [ $l-gt70]
then
echo "OK,$l"
else 
echo "Bad,$l"
fi

exit 0
