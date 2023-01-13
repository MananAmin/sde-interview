#! /bin/bash
echo "hello world"

# system and user defined variables
echo $BASH
echo $HOME

declare -i nu=100
declare -i result=nu+40
echo sum is $result

num=100

echo $num+40

name="manan"

echo $name

printf "My name is %s\n" $name

read input

echo "You entered $input"

if [[ $# -eq 0 ]]; then
    echo "No args given"
    exit 0
fi

arg1=$1
printf "Your argument is %s\n" $arg1

# awk

# array

declare -a arr=(Porche kia honda)
echo ${arr[2]}

declare dic=([key1]=value1 [key2]=value2)
echo ${dic[key2]}

# if else
n=45
if [ $n -gt 100 ]; then
    echo "$n is greater than 100"
elif [ $n -gt 50 ]; then
    echo "$n is greater than 50"
else
    echo "$n is less than 50"
fi

# == eq
# != ne
# < lt
# > gt
# <= le
# >= ge

# case statement

price=100

case $price in
500)
    echo "Tooo expensive"
    ;;
100)
    echo "Reasonable"
    ;;
10)
    echo "sasta"
    ;;
esac

# loops

declare -i loop=10

while [ $loop -gt 0 ]; do

    if [ $loop -eq 8 ]; then
        echo "No printing "
        loop=$loop-2
        continue
    fi
    echo "looppp $loop"

    if [ $loop -eq 4 ]; then
        echo "Exiting loop"
        break
    fi
    loop=$loop-2
done

for ((i = 0; i < 10; i++)); do
    echo "forrr looppp $i"
done

# functions

a=10
b=20
myfunction() {
    local a=30
    b=40
    c=$((a + b))
    echo "a ($a)and b ($b)in function"
}
myfunction
echo "a ($a)and b ($b) outside of function"

# String cutting

string="hello world"

echo ${string:0:5}
echo ${string:6}

# arthmetic ops

var=$(expr 500 - 2)
echo $var

# dir check

if [ -d "./mydir" ]; then
    echo "mydir exist"
fi

# -f file exists
# -r exist and read permission
# -w exist and write permission
# -x exist and executavle permission
# -L exist and symbolic link

# tail and head command

IFS=":"
text="man:on:misison"
for val in $text; do
    echo "$val"
done

echo "lets count the words" | wc -c

# nohup command to run scripts in the background
