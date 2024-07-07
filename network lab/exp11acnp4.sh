#!/bin/sh
#special varibles
#$0 -filename
#$1 - $9
echo "filename : $0"
echo "fisrt parameter : $1"
echo "2nd parameter : $2"
echo "quoate values : $@"
echo "quotes vales : $*"
echo "number of parameters : $#"
echo "filename : $0"

: '
    bash exp11acnp4.sh ajai dev s
filename : exp11acnp4.sh
fisrt parameter : ajai
2nd parameter : dev
quoate values : ajai dev s
quotes vales : ajai dev s
number of parameters : 3
filename : exp11acnp4.sh
' 
