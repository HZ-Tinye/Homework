#!/bin/bash
HELLO=“var1”
echo $HELLO
function hello {
local HELLO="var2" 
echo $HELLO
}
echo $HELLO
