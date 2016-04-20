#!/bin/bash
HELLO="var1"

function hello {
local HELLO="var2"
echo $HELLO
}

echo $HELLO

hello

echo $HELLO
