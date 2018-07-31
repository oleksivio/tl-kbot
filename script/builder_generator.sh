#/bin/bash
for file in `ls -Rl $1 | grep '.java' | awk '{print $9}' | awk -F '.' '{print $1}'`; 
do 

    lowerCamelCase=`echo "$file" | awk '{print tolower(substr($0,1,1)) substr($0,2)}'`
    echo "public $file $lowerCamelCase(){\n return new $file(networker); \n}";
done;
